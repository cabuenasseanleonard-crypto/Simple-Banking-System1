import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DBconnection {
    private final String DB_URL = "jdbc:sqlite:sbs.db";
    
    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to SQLite Database!");
            System.out.println("Database location: " + new java.io.File("sbs.db").getAbsolutePath());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public boolean forgotPassword(String email, String newPassword) {
    String sql = "UPDATE users SET password = ? WHERE email = ?";

    try (Connection conn = connect();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, newPassword);
        ps.setString(2, email);

        int rowsUpdated = ps.executeUpdate();

        return rowsUpdated > 0;

    } catch (SQLException e) {
        System.out.println("SQLError : " + e.getMessage());
        return false;
    }
}
    
    public String login(String email, String password){
    String sql = "SELECT * FROM users WHERE email = ? AND password = ? ";
    try(Connection conn = connect();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
            System.out.println("USER FOUND!");
            System.out.println("ID : " + rs.getInt("user_id"));
            System.out.println("Name : " + rs.getString("fullname"));
            System.out.println("Email : " + rs.getString("email"));
            System.out.println("Role : " + rs.getString("role"));
                    
            Session.userid = rs.getInt("user_id");
            Session.fullname = rs.getString("fullname");
            Session.email = rs.getString("email");
            Session.role = rs.getString("role"); 
            return Session.role;
             }
            return "";  
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    
    public DefaultTableModel getUsers (){
        String[] headers = {"transaction_type","description","date_time", "amount", "balance_after" };
        DefaultTableModel model = new DefaultTableModel (headers, 0);
        String sql = "SELECT * FROM users";
        try (Connection conn = connect()){
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                String transaction_type = rs.getString("transaction_type");
                String description = rs.getString("description");
                int date_time = rs.getInt("date & time");
                int amount = rs.getInt("amount");
                int balance_after = rs.getInt("balance_after");
                
                Object [] row = {transaction_type, description, amount, date_time, balance_after};
                model.addRow(row);
            }
        }catch(SQLException e){
         System.out.println(e.getMessage());
            
        }
        return model;
    }
    

public boolean registerUser(String fullname, String email, String password, String pin) {
    String sql = "INSERT INTO users (fullname, email, password, role, pin) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = connect();
         PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

        ps.setString(1, fullname);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4, "customer");
        ps.setString(5, pin);
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            int id = rs.getInt(1);
            String acc = "VB-" + String.format("%010d", id);
            String sql2 = "INSERT INTO accounts (user_id, account_number, balance) VALUES (?, ?, ?)";

            try (PreparedStatement aps = conn.prepareStatement(sql2)) {
                aps.setInt(1, id);
                aps.setString(2, acc);
                aps.setDouble(3, 0);
                aps.executeUpdate();
            }
            return true;
        }
    } catch (SQLException e) {
        System.out.println("Registration Error: " + e.getMessage());
    }
    return false;
}
public int count(String table) {
    String sql = "SELECT COUNT(*) FROM " + table;

    try (Connection c = connect();
         Statement s = c.createStatement();
         ResultSet r = s.executeQuery(sql)) {

        return r.getInt(1);
    } catch (SQLException e) {
        return 0;
    }
}

public double totalDeposits() {
    String sql = "SELECT SUM(amount) FROM transactions WHERE transaction_type = 'Deposit'";

    try (Connection conn = connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        return rs.getDouble(1);
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        return 0;
    }
}

}