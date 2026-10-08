
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminDashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminDashboard.class.getName());

    public adminDashboard() {
        initComponents();
        setLocationRelativeTo(null);
        loadDashboardData();
        loadTransactions();
        welcomeBack1.setText("Welcome back! Admin " + Session.fullname);
    }
    
    private void loadDashboardData() {
    try (Connection conn = new DBconnection().connect()) {

        String sql1 = "SELECT COUNT(*) FROM users";
        PreparedStatement ps1 = conn.prepareStatement(sql1);
        ResultSet rs1 = ps1.executeQuery();

        if (rs1.next()) {
            totalUsers.setText(String.valueOf(rs1.getInt(1)));
        }

        String sql2 = "SELECT COUNT(*) FROM accounts";
        PreparedStatement ps2 = conn.prepareStatement(sql2);
        ResultSet rs2 = ps2.executeQuery();

        if (rs2.next()) {
            totalAccounts.setText(String.valueOf(rs2.getInt(1)));
        }
        String sql3 = "SELECT COALESCE(SUM(amount), 0) FROM transactions WHERE transaction_type = 'Deposit'";
        PreparedStatement ps3 = conn.prepareStatement(sql3);
        ResultSet rs3 = ps3.executeQuery();

        if (rs3.next()) {
            totalDeposits.setText(String.format("₱%,.2f", rs3.getDouble(1)));
        }

        String sql4 = "SELECT COALESCE(SUM(amount), 0) FROM transactions WHERE transaction_type = 'Withdraw'";
        PreparedStatement ps4 = conn.prepareStatement(sql4);
        ResultSet rs4 = ps4.executeQuery();

        if (rs4.next()) {
            totalWithdrawals.setText(String.format("₱%,.2f", rs4.getDouble(1)));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    private void loadTransactions() {

    String sql = "SELECT transaction_type, description, date_time, amount, balance_after " + "FROM transactions " + "ORDER BY date_time DESC LIMIT 5";

    try (Connection conn = new DBconnection().connect();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        DefaultTableModel model =
                (DefaultTableModel) transactionTable.getModel();

        model.setRowCount(0);

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getString("transaction_type"),
                rs.getString("description"),
                rs.getString("date_time"),
                rs.getDouble("amount"),
                rs.getDouble("balance_after")
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardLayout = new fancyui.FancyPanel();
        fancyPanel4 = new fancyui.FancyPanel();
        fancyLabel4 = new fancyui.FancyLabel();
        fancyPanel2 = new fancyui.FancyPanel();
        fancyLabel5 = new fancyui.FancyLabel();
        totalUsers = new fancyui.FancyLabel();
        fancyPanel3 = new fancyui.FancyPanel();
        fancyLabel6 = new fancyui.FancyLabel();
        totalAccounts = new fancyui.FancyLabel();
        fancyPanel5 = new fancyui.FancyPanel();
        fancyLabel8 = new fancyui.FancyLabel();
        totalDeposits = new fancyui.FancyLabel();
        fancyPanel9 = new fancyui.FancyPanel();
        fancyLabel13 = new fancyui.FancyLabel();
        totalWithdrawals = new fancyui.FancyLabel();
        jLabel3 = new javax.swing.JLabel();
        fancyImage1 = new fancyui.FancyImage();
        fancyPanel6 = new fancyui.FancyPanel();
        fancyLabel10 = new fancyui.FancyLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionTable = new fancyui.FancyTable();
        welcomeBack1 = new fancyui.FancyLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel20 = new fancyui.FancyPanel();
        fancyImage8 = new fancyui.FancyImage();
        adDashboardBtn = new fancyui.FancyButton();
        adminManageUBtn = new fancyui.FancyButton();
        adminTransactionBtn = new fancyui.FancyButton();
        fancyButton48 = new fancyui.FancyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardLayout.setGradientEnabled(false);
        cardLayout.setGradientEnd(new java.awt.Color(0, 0, 20));
        cardLayout.setGradientStart(new java.awt.Color(0, 0, 51));
        cardLayout.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        cardLayout.setSolidBackgroundEnabled(true);

        fancyPanel4.setBorderColor(new java.awt.Color(102, 102, 102));
        fancyPanel4.setBorderEnabled(true);
        fancyPanel4.setBorderThickness(2.0F);
        fancyPanel4.setGradientAngle(65);
        fancyPanel4.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel4.setGradientStart(new java.awt.Color(76, 0, 153));
        fancyPanel4.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        fancyLabel4.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel4.setText("Admin Dashboard");
        fancyLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N

        fancyPanel2.setBorderColor(new java.awt.Color(102, 51, 255));
        fancyPanel2.setBorderEnabled(true);
        fancyPanel2.setGradientEnd(new java.awt.Color(204, 51, 255));
        fancyPanel2.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fancyLabel5.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fancyLabel5.setText("Total Users");
        fancyLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fancyLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        totalUsers.setForeground(new java.awt.Color(255, 255, 255));
        totalUsers.setText("fancyLabel2");
        totalUsers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel2Layout = new javax.swing.GroupLayout(fancyPanel2);
        fancyPanel2.setLayout(fancyPanel2Layout);
        fancyPanel2Layout.setHorizontalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        fancyPanel2Layout.setVerticalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        fancyPanel3.setBorderColor(new java.awt.Color(102, 51, 255));
        fancyPanel3.setBorderEnabled(true);
        fancyPanel3.setGradientEnd(new java.awt.Color(204, 51, 255));
        fancyPanel3.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fancyLabel6.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fancyLabel6.setText("Total Accounts");
        fancyLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fancyLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        totalAccounts.setForeground(new java.awt.Color(255, 255, 255));
        totalAccounts.setText("fancyLabel3");
        totalAccounts.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel3Layout = new javax.swing.GroupLayout(fancyPanel3);
        fancyPanel3.setLayout(fancyPanel3Layout);
        fancyPanel3Layout.setHorizontalGroup(
            fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        fancyPanel3Layout.setVerticalGroup(
            fancyPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        fancyPanel5.setBorderColor(new java.awt.Color(102, 51, 255));
        fancyPanel5.setBorderEnabled(true);
        fancyPanel5.setGradientEnd(new java.awt.Color(204, 51, 255));
        fancyPanel5.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fancyLabel8.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fancyLabel8.setText("Total Deposits");
        fancyLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fancyLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        totalDeposits.setForeground(new java.awt.Color(0, 255, 0));
        totalDeposits.setText("fancyLabel7");
        totalDeposits.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel5Layout = new javax.swing.GroupLayout(fancyPanel5);
        fancyPanel5.setLayout(fancyPanel5Layout);
        fancyPanel5Layout.setHorizontalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        fancyPanel5Layout.setVerticalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fancyPanel9.setBorderColor(new java.awt.Color(102, 51, 255));
        fancyPanel9.setBorderEnabled(true);
        fancyPanel9.setGradientEnd(new java.awt.Color(204, 51, 255));
        fancyPanel9.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fancyLabel13.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fancyLabel13.setText("Total Withdrawals");
        fancyLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fancyLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        totalWithdrawals.setForeground(new java.awt.Color(255, 38, 38));
        totalWithdrawals.setText("fancyLabel9");
        totalWithdrawals.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel9Layout = new javax.swing.GroupLayout(fancyPanel9);
        fancyPanel9.setLayout(fancyPanel9Layout);
        fancyPanel9Layout.setHorizontalGroup(
            fancyPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel9Layout.createSequentialGroup()
                .addGroup(fancyPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fancyLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(totalWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        fancyPanel9Layout.setVerticalGroup(
            fancyPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Overview of bank activity.");

        fancyImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-admin-100.png")); // NOI18N
        fancyImage1.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        javax.swing.GroupLayout fancyPanel4Layout = new javax.swing.GroupLayout(fancyPanel4);
        fancyPanel4.setLayout(fancyPanel4Layout);
        fancyPanel4Layout.setHorizontalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(fancyPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(fancyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fancyPanel4Layout.setVerticalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel4Layout.createSequentialGroup()
                        .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fancyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fancyPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        fancyPanel6.setBorderColor(new java.awt.Color(102, 102, 102));
        fancyPanel6.setBorderEnabled(true);
        fancyPanel6.setBorderThickness(2.0F);
        fancyPanel6.setGradientAngle(65);
        fancyPanel6.setGradientEnd(new java.awt.Color(0, 0, 51));
        fancyPanel6.setGradientStart(new java.awt.Color(76, 0, 153));
        fancyPanel6.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        fancyLabel10.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel10.setText("Recent Transactions");
        fancyLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        transactionTable.setAutoCreateRowSorter(true);
        transactionTable.setForeground(new java.awt.Color(255, 255, 255));
        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Deposit", "Cash Deposit", "05-12-25 - 10:30 AM", "+5,000.00", "25,750.00"},
                {"Withdraw", "ATM Withdrawal", "05-29-25 - 10:30 AM", "-2,000.00", "20,750.00"},
                {"Deposit", "Cash Deposit", "05-15-25 - 10:30 AM", "+3,000.00", "22,750.00"},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Description", "Date & Time", "Amount", "Balance After"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionTable.setAlignmentX(1.0F);
        transactionTable.setAlignmentY(1.0F);
        transactionTable.setColumnSelectionAllowed(true);
        transactionTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        transactionTable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        transactionTable.setEvenRowColor(new java.awt.Color(31, 0, 63));
        transactionTable.setGradientEnabled(true);
        transactionTable.setGradientEnd(new java.awt.Color(51, 0, 153));
        transactionTable.setGradientStart(new java.awt.Color(0, 0, 51));
        transactionTable.setGridLineColor(new java.awt.Color(0, 0, 51));
        transactionTable.setHeaderBackground(new java.awt.Color(0, 0, 51));
        transactionTable.setHeaderForeground(new java.awt.Color(255, 255, 255));
        transactionTable.setOddRowColor(new java.awt.Color(51, 0, 51));
        transactionTable.setStripedRowsEnabled(true);
        transactionTable.setTableBackgroundColor(new java.awt.Color(39, 7, 81));
        jScrollPane2.setViewportView(transactionTable);
        transactionTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fancyLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        welcomeBack1.setForeground(new java.awt.Color(255, 255, 255));
        welcomeBack1.setText("Welcome Back,");
        welcomeBack1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Here's what's happening to the bank today.");

        fancyPanel20.setBorderEnabled(true);
        fancyPanel20.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel20.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyImage8.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage8.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        adDashboardBtn.setText("Dashboard");
        adDashboardBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adDashboardBtn.setBorderThickness(3.0F);
        adDashboardBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adDashboardBtn.addActionListener(this::adDashboardBtnActionPerformed);

        adminManageUBtn.setText("Manage Users");
        adminManageUBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adminManageUBtn.setBorderColor(new java.awt.Color(153, 153, 153));
        adminManageUBtn.setBorderThickness(3.0F);
        adminManageUBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adminManageUBtn.addActionListener(this::adminManageUBtnActionPerformed);

        adminTransactionBtn.setText("Transactions");
        adminTransactionBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adminTransactionBtn.setBorderColor(new java.awt.Color(153, 153, 153));
        adminTransactionBtn.setBorderThickness(3.0F);
        adminTransactionBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adminTransactionBtn.addActionListener(this::adminTransactionBtnfancyButton4ActionPerformed);

        fancyButton48.setText("Logout");
        fancyButton48.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton48.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton48.setBorderThickness(3.0F);
        fancyButton48.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton48.addActionListener(this::fancyButton48ActionPerformed);

        javax.swing.GroupLayout fancyPanel20Layout = new javax.swing.GroupLayout(fancyPanel20);
        fancyPanel20.setLayout(fancyPanel20Layout);
        fancyPanel20Layout.setHorizontalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(adminTransactionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminManageUBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adDashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fancyPanel20Layout.setVerticalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(adminManageUBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(adminTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(fancyButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout cardLayoutLayout = new javax.swing.GroupLayout(cardLayout);
        cardLayout.setLayout(cardLayoutLayout);
        cardLayoutLayout.setHorizontalGroup(
            cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLayoutLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(fancyPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayoutLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLayoutLayout.createSequentialGroup()
                        .addComponent(fancyPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(cardLayoutLayout.createSequentialGroup()
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        cardLayoutLayout.setVerticalGroup(
            cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayoutLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(welcomeBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(fancyPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminTransactionBtnfancyButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTransactionBtnfancyButton4ActionPerformed
      new adminTransactions().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_adminTransactionBtnfancyButton4ActionPerformed

    private void adDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adDashboardBtnActionPerformed
      new adminDashboard().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_adDashboardBtnActionPerformed

    private void fancyButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton48ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {

        JOptionPane.showMessageDialog(this, "You have been logged out.");
        new demoframe().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_fancyButton48ActionPerformed

    private void adminManageUBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminManageUBtnActionPerformed
      new adminUserManagement().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_adminManageUBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new adminDashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyButton adDashboardBtn;
    private fancyui.FancyButton adminManageUBtn;
    private fancyui.FancyButton adminTransactionBtn;
    private fancyui.FancyPanel cardLayout;
    private fancyui.FancyButton fancyButton48;
    private fancyui.FancyImage fancyImage1;
    private fancyui.FancyImage fancyImage8;
    private fancyui.FancyLabel fancyLabel10;
    private fancyui.FancyLabel fancyLabel13;
    private fancyui.FancyLabel fancyLabel4;
    private fancyui.FancyLabel fancyLabel5;
    private fancyui.FancyLabel fancyLabel6;
    private fancyui.FancyLabel fancyLabel8;
    private fancyui.FancyPanel fancyPanel2;
    private fancyui.FancyPanel fancyPanel20;
    private fancyui.FancyPanel fancyPanel3;
    private fancyui.FancyPanel fancyPanel4;
    private fancyui.FancyPanel fancyPanel5;
    private fancyui.FancyPanel fancyPanel6;
    private fancyui.FancyPanel fancyPanel9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private fancyui.FancyLabel totalAccounts;
    private fancyui.FancyLabel totalDeposits;
    private fancyui.FancyLabel totalUsers;
    private fancyui.FancyLabel totalWithdrawals;
    private fancyui.FancyTable transactionTable;
    private fancyui.FancyLabel welcomeBack1;
    // End of variables declaration//GEN-END:variables
}
