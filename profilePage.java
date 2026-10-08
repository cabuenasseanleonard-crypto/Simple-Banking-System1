import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class profilePage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(profilePage.class.getName());
    public profilePage() {
        initComponents();
        setLocationRelativeTo(null);
        uSer.setText(Session.fullname);
        loadUserCard();
        loadTotalWithdrawals();
        
    }
  private void loadUserCard() {

    String sql = "SELECT users.fullname, users.email, " + "accounts.account_number, accounts.balance, " + "(SELECT COALESCE(SUM(amount), 0) FROM transactions "
            + "WHERE user_id = accounts.user_id AND transaction_type = 'Deposit') AS total_deposits " +"FROM users " + "JOIN accounts ON users.user_id = accounts.user_id " 
            + "WHERE users.user_id = ?";

    try (Connection con = new DBconnection().connect();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, Session.userid);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            fNameLabel.setText(rs.getString("fullname"));
            eAddLabel.setText(rs.getString("email"));
            accNoLabel.setText(rs.getString("account_number"));

            nAme.setText(rs.getString("fullname"));
            accNum.setText(rs.getString("account_number"));
            curBal.setText("₱" + rs.getDouble("balance"));
            totalDep.setText("₱" + rs.getDouble("total_deposits"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Unable to load profile information:\n" + e.getMessage());
    }
}
    private void loadTotalWithdrawals() {
    String sql = "SELECT SUM(-amount) FROM transactions " + "WHERE user_id=? AND transaction_type='Withdraw'"; 
    
    try (Connection con = new DBconnection().connect();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, Session.userid);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double total = rs.getDouble(1);
            totalWithdrawLabel.setText(String.format("₱%,.2f", total));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Unable to load withdrawals.");
    }
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fancyImage2 = new fancyui.FancyImage();
        fancyPanel21 = new fancyui.FancyPanel();
        fancyPanel20 = new fancyui.FancyPanel();
        fancyImage8 = new fancyui.FancyImage();
        fancyButton44 = new fancyui.FancyButton();
        fancyButton45 = new fancyui.FancyButton();
        fancyButton46 = new fancyui.FancyButton();
        fancyButton47 = new fancyui.FancyButton();
        fancyButton48 = new fancyui.FancyButton();
        fancyButton49 = new fancyui.FancyButton();
        transactionHistory = new fancyui.FancyButton();
        fancyPanel6 = new fancyui.FancyPanel();
        fancyLabel1 = new fancyui.FancyLabel();
        jLabel3 = new javax.swing.JLabel();
        fancyPanel1 = new fancyui.FancyPanel();
        fancyPanel2 = new fancyui.FancyPanel();
        fancyLabel2 = new fancyui.FancyLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fancyLabel3 = new fancyui.FancyLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        fancyLabel4 = new fancyui.FancyLabel();
        fancyPanel8 = new fancyui.FancyPanel();
        fNameLabel = new fancyui.FancyLabel();
        fancyPanel9 = new fancyui.FancyPanel();
        eAddLabel = new fancyui.FancyLabel();
        fancyPanel11 = new fancyui.FancyPanel();
        accNoLabel = new fancyui.FancyLabel();
        fancyPanel3 = new fancyui.FancyPanel();
        fancyImage1 = new fancyui.FancyImage();
        nAme = new fancyui.FancyLabel();
        accNum = new fancyui.FancyLabel();
        fancyImage4 = new fancyui.FancyImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel10 = new fancyui.FancyPanel();
        uSer = new fancyui.FancyLabel();
        fancyPanel4 = new fancyui.FancyPanel();
        fancyLabel9 = new fancyui.FancyLabel();
        curBal = new fancyui.FancyLabel();
        fancyPanel5 = new fancyui.FancyPanel();
        fancyLabel12 = new fancyui.FancyLabel();
        totalDep = new fancyui.FancyLabel();
        fancyPanel7 = new fancyui.FancyPanel();
        fancyLabel13 = new fancyui.FancyLabel();
        totalWithdrawLabel = new fancyui.FancyLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fancyPanel21.setGradientEnabled(false);
        fancyPanel21.setGradientEnd(new java.awt.Color(0, 0, 20));
        fancyPanel21.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel21.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        fancyPanel21.setSolidBackgroundEnabled(true);

        fancyPanel20.setBorderEnabled(true);
        fancyPanel20.setBottomRightRadius(0);
        fancyPanel20.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel20.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel20.setTopRightRadius(0);

        fancyImage8.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage8.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        fancyButton44.setText("Dashboard");
        fancyButton44.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton44.setBorderThickness(3.0F);
        fancyButton44.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton44.addActionListener(this::fancyButton44ActionPerformed);

        fancyButton45.setText("Deposit");
        fancyButton45.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton45.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton45.setBorderThickness(3.0F);
        fancyButton45.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton45.addActionListener(this::fancyButton45ActionPerformed);

        fancyButton46.setText("Transfer");
        fancyButton46.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton46.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton46.setBorderThickness(3.0F);
        fancyButton46.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton46.addActionListener(this::fancyButton46fancyButton4ActionPerformed);

        fancyButton47.setText("Withdraw");
        fancyButton47.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton47.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton47.setBorderThickness(3.0F);
        fancyButton47.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton47.addActionListener(this::fancyButton47fancyButton5ActionPerformed);

        fancyButton48.setText("Logout");
        fancyButton48.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton48.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton48.setBorderThickness(3.0F);
        fancyButton48.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton48.addActionListener(this::fancyButton48ActionPerformed);

        fancyButton49.setText("Profile");
        fancyButton49.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton49.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton49.setBorderThickness(3.0F);
        fancyButton49.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton49.addActionListener(this::fancyButton49fancyButton6ActionPerformed);

        transactionHistory.setText("Transaction  History");
        transactionHistory.setBackgroundColor(new java.awt.Color(0, 0, 51));
        transactionHistory.setBorderColor(new java.awt.Color(153, 153, 153));
        transactionHistory.setBorderThickness(3.0F);
        transactionHistory.setDefaultForeground(new java.awt.Color(255, 255, 255));
        transactionHistory.addActionListener(this::transactionHistoryfancyButton5ActionPerformed);

        javax.swing.GroupLayout fancyPanel20Layout = new javax.swing.GroupLayout(fancyPanel20);
        fancyPanel20.setLayout(fancyPanel20Layout);
        fancyPanel20Layout.setHorizontalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fancyButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transactionHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        fancyPanel20Layout.setVerticalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fancyButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        fancyPanel6.setBorderColor(new java.awt.Color(102, 102, 102));
        fancyPanel6.setBorderEnabled(true);
        fancyPanel6.setBorderThickness(2.0F);
        fancyPanel6.setGradientAngle(65);
        fancyPanel6.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel6.setGradientStart(new java.awt.Color(18, 0, 38));
        fancyPanel6.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        fancyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel1.setText("Account Profile");
        fancyLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("View and manage your personal information and account details");

        fancyPanel1.setBorderEnabled(true);
        fancyPanel1.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel1.setGradientStart(new java.awt.Color(18, 0, 38));

        fancyPanel2.setBorderEnabled(true);
        fancyPanel2.setBottomLeftRadius(0);
        fancyPanel2.setCornerRadius(0);
        fancyPanel2.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel2.setGradientStart(new java.awt.Color(18, 0, 38));
        fancyPanel2.setTopRightRadius(8);

        fancyLabel2.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel2.setText("Full Name");
        fancyLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        fancyLabel3.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel3.setText("Email Address");
        fancyLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        fancyLabel4.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel4.setText("Account Number");
        fancyLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        fancyPanel8.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyPanel8.setBorderEnabled(true);
        fancyPanel8.setBorderThickness(2.0F);
        fancyPanel8.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel8.setGradientStart(new java.awt.Color(18, 0, 38));

        fNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fNameLabel.setText("fancyLabel7");

        javax.swing.GroupLayout fancyPanel8Layout = new javax.swing.GroupLayout(fancyPanel8);
        fancyPanel8.setLayout(fancyPanel8Layout);
        fancyPanel8Layout.setHorizontalGroup(
            fancyPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        fancyPanel8Layout.setVerticalGroup(
            fancyPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel8Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fancyPanel9.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyPanel9.setBorderEnabled(true);
        fancyPanel9.setBorderThickness(2.0F);
        fancyPanel9.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel9.setGradientStart(new java.awt.Color(18, 0, 38));

        eAddLabel.setForeground(new java.awt.Color(255, 255, 255));
        eAddLabel.setText("fancyLabel7");

        javax.swing.GroupLayout fancyPanel9Layout = new javax.swing.GroupLayout(fancyPanel9);
        fancyPanel9.setLayout(fancyPanel9Layout);
        fancyPanel9Layout.setHorizontalGroup(
            fancyPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(eAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        fancyPanel9Layout.setVerticalGroup(
            fancyPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        fancyPanel11.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyPanel11.setBorderEnabled(true);
        fancyPanel11.setBorderThickness(2.0F);
        fancyPanel11.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel11.setGradientStart(new java.awt.Color(18, 0, 38));

        accNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        accNoLabel.setText("fancyLabel7");

        javax.swing.GroupLayout fancyPanel11Layout = new javax.swing.GroupLayout(fancyPanel11);
        fancyPanel11.setLayout(fancyPanel11Layout);
        fancyPanel11Layout.setHorizontalGroup(
            fancyPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(accNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        fancyPanel11Layout.setVerticalGroup(
            fancyPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel2Layout = new javax.swing.GroupLayout(fancyPanel2);
        fancyPanel2.setLayout(fancyPanel2Layout);
        fancyPanel2Layout.setHorizontalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(fancyPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fancyPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fancyPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        fancyPanel2Layout.setVerticalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fancyPanel3.setBorderEnabled(true);
        fancyPanel3.setGradientAngle(30);
        fancyPanel3.setGradientEnd(new java.awt.Color(153, 0, 255));
        fancyPanel3.setGradientStart(new java.awt.Color(51, 0, 102));

        fancyImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage1.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        nAme.setForeground(new java.awt.Color(255, 255, 255));
        nAme.setText("Jasper Arenas");
        nAme.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        accNum.setForeground(new java.awt.Color(255, 255, 255));
        accNum.setText("VB-2026-1012-5567");
        accNum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        fancyImage4.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\—Pngtree—close-up view of a golden_23691834.png")); // NOI18N

        javax.swing.GroupLayout fancyPanel3Layout = new javax.swing.GroupLayout(fancyPanel3);
        fancyPanel3.setLayout(fancyPanel3Layout);
        fancyPanel3Layout.setHorizontalGroup(
            fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel3Layout.createSequentialGroup()
                .addGroup(fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nAme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fancyPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(fancyImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        fancyPanel3Layout.setVerticalGroup(
            fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(fancyImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nAme, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(accNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(fancyPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel1Layout = new javax.swing.GroupLayout(fancyPanel1);
        fancyPanel1.setLayout(fancyPanel1Layout);
        fancyPanel1Layout.setHorizontalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        fancyPanel1Layout.setVerticalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fancyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage your account,security, and preferences.");

        fancyPanel10.setGradientEnd(new java.awt.Color(125, 24, 175));
        fancyPanel10.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fancyPanel10MouseClicked(evt);
            }
        });

        uSer.setForeground(new java.awt.Color(255, 204, 0));
        uSer.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-user-24 (1).png")); // NOI18N
        uSer.setText("User");
        uSer.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel10Layout = new javax.swing.GroupLayout(fancyPanel10);
        fancyPanel10.setLayout(fancyPanel10Layout);
        fancyPanel10Layout.setHorizontalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uSer, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        fancyPanel10Layout.setVerticalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(uSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fancyPanel4.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyPanel4.setBorderEnabled(true);
        fancyPanel4.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel4.setGradientStart(new java.awt.Color(18, 0, 38));

        fancyLabel9.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel9.setText("Current Balance");
        fancyLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        curBal.setForeground(new java.awt.Color(255, 255, 255));
        curBal.setText("₱25,750.00");
        curBal.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N

        fancyPanel5.setBorderEnabled(true);
        fancyPanel5.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel5.setGradientStart(new java.awt.Color(18, 0, 38));

        fancyLabel12.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel12.setText("Total Deposits");
        fancyLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        totalDep.setForeground(new java.awt.Color(255, 255, 255));
        totalDep.setText("₱0.00");
        totalDep.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel5Layout = new javax.swing.GroupLayout(fancyPanel5);
        fancyPanel5.setLayout(fancyPanel5Layout);
        fancyPanel5Layout.setHorizontalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(totalDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fancyPanel5Layout.createSequentialGroup()
                        .addComponent(fancyLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fancyPanel5Layout.setVerticalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        fancyPanel7.setBorderEnabled(true);
        fancyPanel7.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel7.setGradientStart(new java.awt.Color(18, 0, 38));

        fancyLabel13.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel13.setText("Total Withdrawal");
        fancyLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        totalWithdrawLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalWithdrawLabel.setText("₱0.00");
        totalWithdrawLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel7Layout = new javax.swing.GroupLayout(fancyPanel7);
        fancyPanel7.setLayout(fancyPanel7Layout);
        fancyPanel7Layout.setHorizontalGroup(
            fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(totalWithdrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fancyPanel7Layout.createSequentialGroup()
                        .addComponent(fancyLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fancyPanel7Layout.setVerticalGroup(
            fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(fancyLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalWithdrawLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel4Layout = new javax.swing.GroupLayout(fancyPanel4);
        fancyPanel4.setLayout(fancyPanel4Layout);
        fancyPanel4Layout.setHorizontalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fancyPanel4Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(fancyPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fancyPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(curBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        fancyPanel4Layout.setVerticalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(fancyLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(curBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fancyPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fancyPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel21Layout = new javax.swing.GroupLayout(fancyPanel21);
        fancyPanel21.setLayout(fancyPanel21Layout);
        fancyPanel21Layout.setHorizontalGroup(
            fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel21Layout.createSequentialGroup()
                .addComponent(fancyPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fancyPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fancyPanel21Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fancyPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fancyPanel21Layout.setVerticalGroup(
            fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fancyPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fancyPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fancyPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel21Layout.createSequentialGroup()
                        .addComponent(fancyPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fancyPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fancyPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fancyButton46fancyButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton46fancyButton4ActionPerformed
     new Transfer().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_fancyButton46fancyButton4ActionPerformed

    private void fancyButton47fancyButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton47fancyButton5ActionPerformed
     new Withdraw().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_fancyButton47fancyButton5ActionPerformed

    private void fancyButton49fancyButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton49fancyButton6ActionPerformed
      new profilePage().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_fancyButton49fancyButton6ActionPerformed

    private void transactionHistoryfancyButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionHistoryfancyButton5ActionPerformed
     new TransactionHistory().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_transactionHistoryfancyButton5ActionPerformed

    private void fancyButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton44ActionPerformed
     new Dashboard().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_fancyButton44ActionPerformed

    private void fancyButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton45ActionPerformed
     new Deposit().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_fancyButton45ActionPerformed

    private void fancyPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fancyPanel10MouseClicked
     new profilePage().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_fancyPanel10MouseClicked

    private void fancyButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton48ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (confirm == JOptionPane.YES_OPTION) {

        JOptionPane.showMessageDialog(this, "You have been logged out.");
        new demoframe().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_fancyButton48ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new profilePage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyLabel accNoLabel;
    private fancyui.FancyLabel accNum;
    private fancyui.FancyLabel curBal;
    private fancyui.FancyLabel eAddLabel;
    private fancyui.FancyLabel fNameLabel;
    private fancyui.FancyButton fancyButton44;
    private fancyui.FancyButton fancyButton45;
    private fancyui.FancyButton fancyButton46;
    private fancyui.FancyButton fancyButton47;
    private fancyui.FancyButton fancyButton48;
    private fancyui.FancyButton fancyButton49;
    private fancyui.FancyImage fancyImage1;
    private fancyui.FancyImage fancyImage2;
    private fancyui.FancyImage fancyImage4;
    private fancyui.FancyImage fancyImage8;
    private fancyui.FancyLabel fancyLabel1;
    private fancyui.FancyLabel fancyLabel12;
    private fancyui.FancyLabel fancyLabel13;
    private fancyui.FancyLabel fancyLabel2;
    private fancyui.FancyLabel fancyLabel3;
    private fancyui.FancyLabel fancyLabel4;
    private fancyui.FancyLabel fancyLabel9;
    private fancyui.FancyPanel fancyPanel1;
    private fancyui.FancyPanel fancyPanel10;
    private fancyui.FancyPanel fancyPanel11;
    private fancyui.FancyPanel fancyPanel2;
    private fancyui.FancyPanel fancyPanel20;
    private fancyui.FancyPanel fancyPanel21;
    private fancyui.FancyPanel fancyPanel3;
    private fancyui.FancyPanel fancyPanel4;
    private fancyui.FancyPanel fancyPanel5;
    private fancyui.FancyPanel fancyPanel6;
    private fancyui.FancyPanel fancyPanel7;
    private fancyui.FancyPanel fancyPanel8;
    private fancyui.FancyPanel fancyPanel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private fancyui.FancyLabel nAme;
    private fancyui.FancyLabel totalDep;
    private fancyui.FancyLabel totalWithdrawLabel;
    private fancyui.FancyButton transactionHistory;
    private fancyui.FancyLabel uSer;
    // End of variables declaration//GEN-END:variables
}
