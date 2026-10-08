import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class adminTransactions extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminTransactions.class.getName());

    public adminTransactions() {
        initComponents();
        setLocationRelativeTo(null);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] {"All", "Deposit", "Withdraw", "Transfer"} ));

        loadTransactions();
    }
    private void loadTransactions() {
    String type = jComboBox1.getSelectedItem().toString();
    String sql;

    if (type.equals("All")) {
        sql = "SELECT * FROM transactions ORDER BY date_time DESC";
    } else {
        sql = "SELECT * FROM transactions " + "WHERE transaction_type = ? " + "ORDER BY date_time DESC";
    }

    try (Connection conn = new DBconnection().connect();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        if (!type.equals("All")) {
            ps.setString(1, type);
        }
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = new DefaultTableModel(
            new String[]{"Type", "Description", "Date & Time", "Amount", "Balance After"}, 0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("transaction_type"),
                rs.getString("description"),
                rs.getString("date_time"),
                rs.getDouble("amount"),
                rs.getDouble("balance_after")
            });
        }
        adminTransactionsTable.setModel(model);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fancyPanel1 = new fancyui.FancyPanel();
        fancyPanel6 = new fancyui.FancyPanel();
        fancyLabel10 = new fancyui.FancyLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminTransactionsTable = new fancyui.FancyTable();
        fancyLabel1 = new fancyui.FancyLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel2 = new fancyui.FancyPanel();
        fancyLabel12 = new fancyui.FancyLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        fancyPanel22 = new fancyui.FancyPanel();
        fancyImage10 = new fancyui.FancyImage();
        adminDashboardBtn = new fancyui.FancyButton();
        adminManageUserBtn = new fancyui.FancyButton();
        fancyButton60 = new fancyui.FancyButton();
        adminTransactionBtn = new fancyui.FancyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fancyPanel1.setGradientEnabled(false);
        fancyPanel1.setGradientEnd(new java.awt.Color(0, 0, 20));
        fancyPanel1.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel1.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        fancyPanel1.setSolidBackgroundEnabled(true);

        fancyPanel6.setBorderColor(new java.awt.Color(102, 102, 102));
        fancyPanel6.setBorderEnabled(true);
        fancyPanel6.setBorderThickness(2.0F);
        fancyPanel6.setGradientAngle(65);
        fancyPanel6.setGradientEnd(new java.awt.Color(0, 0, 51));
        fancyPanel6.setGradientStart(new java.awt.Color(76, 0, 153));
        fancyPanel6.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        fancyLabel10.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel10.setText("All Transactions");
        fancyLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        adminTransactionsTable.setAutoCreateRowSorter(true);
        adminTransactionsTable.setForeground(new java.awt.Color(255, 255, 255));
        adminTransactionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        adminTransactionsTable.setAlignmentX(1.0F);
        adminTransactionsTable.setAlignmentY(1.0F);
        adminTransactionsTable.setColumnSelectionAllowed(true);
        adminTransactionsTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        adminTransactionsTable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        adminTransactionsTable.setEvenRowColor(new java.awt.Color(31, 0, 63));
        adminTransactionsTable.setGradientEnabled(true);
        adminTransactionsTable.setGradientEnd(new java.awt.Color(51, 0, 153));
        adminTransactionsTable.setGradientStart(new java.awt.Color(0, 0, 51));
        adminTransactionsTable.setGridLineColor(new java.awt.Color(0, 0, 51));
        adminTransactionsTable.setHeaderBackground(new java.awt.Color(0, 0, 51));
        adminTransactionsTable.setHeaderForeground(new java.awt.Color(255, 255, 255));
        adminTransactionsTable.setOddRowColor(new java.awt.Color(51, 0, 51));
        adminTransactionsTable.setStripedRowsEnabled(true);
        adminTransactionsTable.setTableBackgroundColor(new java.awt.Color(39, 7, 81));
        jScrollPane2.setViewportView(adminTransactionsTable);
        adminTransactionsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(fancyLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fancyPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        fancyLabel1.setForeground(new java.awt.Color(153, 0, 204));
        fancyLabel1.setText("Transactions");
        fancyLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View and manage all transacitns in the system.");

        fancyPanel2.setGradientEnd(new java.awt.Color(0, 0, 51));
        fancyPanel2.setGradientStart(new java.awt.Color(76, 0, 153));

        fancyLabel12.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel12.setText("Transaction Type");
        fancyLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        javax.swing.GroupLayout fancyPanel2Layout = new javax.swing.GroupLayout(fancyPanel2);
        fancyPanel2.setLayout(fancyPanel2Layout);
        fancyPanel2Layout.setHorizontalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        fancyPanel2Layout.setVerticalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fancyPanel22.setBorderEnabled(true);
        fancyPanel22.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel22.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyImage10.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage10.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        adminDashboardBtn.setText("Dashboard");
        adminDashboardBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adminDashboardBtn.setBorderThickness(3.0F);
        adminDashboardBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adminDashboardBtn.addActionListener(this::adminDashboardBtnActionPerformed);

        adminManageUserBtn.setText("Manage Users");
        adminManageUserBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adminManageUserBtn.setBorderColor(new java.awt.Color(153, 153, 153));
        adminManageUserBtn.setBorderThickness(3.0F);
        adminManageUserBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adminManageUserBtn.addActionListener(this::adminManageUserBtnActionPerformed);

        fancyButton60.setText("Logout");
        fancyButton60.setBackgroundColor(new java.awt.Color(0, 0, 51));
        fancyButton60.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyButton60.setBorderThickness(3.0F);
        fancyButton60.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton60.addActionListener(this::fancyButton60ActionPerformed);

        adminTransactionBtn.setText("Transactions");
        adminTransactionBtn.setBackgroundColor(new java.awt.Color(0, 0, 51));
        adminTransactionBtn.setBorderColor(new java.awt.Color(153, 153, 153));
        adminTransactionBtn.setBorderThickness(3.0F);
        adminTransactionBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        adminTransactionBtn.addActionListener(this::adminTransactionBtnfancyButton4ActionPerformed);

        javax.swing.GroupLayout fancyPanel22Layout = new javax.swing.GroupLayout(fancyPanel22);
        fancyPanel22.setLayout(fancyPanel22Layout);
        fancyPanel22Layout.setHorizontalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyImage10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(adminManageUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminDashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminTransactionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fancyPanel22Layout.setVerticalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addComponent(fancyImage10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminManageUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout fancyPanel1Layout = new javax.swing.GroupLayout(fancyPanel1);
        fancyPanel1.setLayout(fancyPanel1Layout);
        fancyPanel1Layout.setHorizontalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fancyPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fancyPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fancyPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fancyPanel1Layout.setVerticalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(fancyPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    loadTransactions();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void adminDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDashboardBtnActionPerformed
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminDashboardBtnActionPerformed

    private void adminManageUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminManageUserBtnActionPerformed
        new adminUserManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminManageUserBtnActionPerformed

    private void adminTransactionBtnfancyButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTransactionBtnfancyButton4ActionPerformed
        new adminTransactions().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminTransactionBtnfancyButton4ActionPerformed

    private void fancyButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton60ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {

        JOptionPane.showMessageDialog(this, "You have been logged out.");

        new demoframe().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_fancyButton60ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new adminTransactions().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyButton adminDashboardBtn;
    private fancyui.FancyButton adminManageUserBtn;
    private fancyui.FancyButton adminTransactionBtn;
    private fancyui.FancyTable adminTransactionsTable;
    private fancyui.FancyButton fancyButton60;
    private fancyui.FancyImage fancyImage10;
    private fancyui.FancyLabel fancyLabel1;
    private fancyui.FancyLabel fancyLabel10;
    private fancyui.FancyLabel fancyLabel12;
    private fancyui.FancyPanel fancyPanel1;
    private fancyui.FancyPanel fancyPanel2;
    private fancyui.FancyPanel fancyPanel22;
    private fancyui.FancyPanel fancyPanel6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
