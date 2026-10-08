import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminUserManagement extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminUserManagement.class.getName());

    public adminUserManagement() {
        initComponents();
        setLocationRelativeTo(null);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "All", "customer", "admin"} ));
        loadUsers();
    }

    private void loadUsers() {
    String search = searchBar.getText().trim();
    String role = jComboBox1.getSelectedItem().toString();

    String sql = "SELECT user_id, fullname, email, role " + "FROM users " + "WHERE (fullname LIKE ? OR email LIKE ? OR user_id LIKE ?) ";

    if (!role.equals("All")) {
        sql += "AND role = ? ";
    }

    sql += "ORDER BY user_id DESC";

    try (Connection conn = new DBconnection().connect();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        String keyword = "%" + search + "%";

        ps.setString(1, keyword);
        ps.setString(2, keyword);
        ps.setString(3, keyword);

        if (!role.equals("All")) {
            ps.setString(4, role);
        }

        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Full Name", "Email", "Role"}, 0 );

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("user_id"),
                rs.getString("fullname"),
                rs.getString("email"),
                rs.getString("role")
            });
        }

        fancyTable2.setModel(model);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fancyButton1 = new fancyui.FancyButton();
        fancyPanel1 = new fancyui.FancyPanel();
        fancyPanel6 = new fancyui.FancyPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fancyTable2 = new fancyui.FancyTable();
        searchBar = new fancyui.FancyTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        fancyButton2 = new fancyui.FancyButton();
        fancyButton3 = new fancyui.FancyButton();
        fancyLabel2 = new fancyui.FancyLabel();
        fancyLabel1 = new fancyui.FancyLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel22 = new fancyui.FancyPanel();
        fancyImage10 = new fancyui.FancyImage();
        dashboard = new fancyui.FancyButton();
        deposit = new fancyui.FancyButton();
        logoutAdmin = new fancyui.FancyButton();
        transfer1 = new fancyui.FancyButton();

        fancyButton1.setText("fancyButton1");

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

        fancyTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(fancyTable2);

        searchBar.setCornerRadius(3);
        searchBar.setPlaceholder("Enter name or id...");
        searchBar.addActionListener(this::searchBarActionPerformed);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        fancyButton2.setText("Delete User");
        fancyButton2.addActionListener(this::fancyButton2ActionPerformed);

        fancyButton3.setText("Add User");
        fancyButton3.addActionListener(this::fancyButton3ActionPerformed);

        fancyLabel2.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel2.setText("Search:");
        fancyLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel6Layout.createSequentialGroup()
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fancyPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(fancyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(fancyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        fancyLabel1.setForeground(new java.awt.Color(153, 0, 204));
        fancyLabel1.setText("User Management");
        fancyLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage all users in the system.");

        fancyPanel22.setBorderEnabled(true);
        fancyPanel22.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel22.setGradientStart(new java.awt.Color(0, 0, 51));

        fancyImage10.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage10.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        dashboard.setText("Dashboard");
        dashboard.setBackgroundColor(new java.awt.Color(0, 0, 51));
        dashboard.setBorderThickness(3.0F);
        dashboard.setDefaultForeground(new java.awt.Color(255, 255, 255));
        dashboard.addActionListener(this::dashboardActionPerformed);

        deposit.setText("Manage Users");
        deposit.setBackgroundColor(new java.awt.Color(0, 0, 51));
        deposit.setBorderColor(new java.awt.Color(153, 153, 153));
        deposit.setBorderThickness(3.0F);
        deposit.setDefaultForeground(new java.awt.Color(255, 255, 255));
        deposit.addActionListener(this::depositActionPerformed);

        logoutAdmin.setText("Logout");
        logoutAdmin.setBackgroundColor(new java.awt.Color(0, 0, 51));
        logoutAdmin.setBorderColor(new java.awt.Color(153, 153, 153));
        logoutAdmin.setBorderThickness(3.0F);
        logoutAdmin.setDefaultForeground(new java.awt.Color(255, 255, 255));
        logoutAdmin.addActionListener(this::logoutAdminActionPerformed);

        transfer1.setText("Transactions");
        transfer1.setBackgroundColor(new java.awt.Color(0, 0, 51));
        transfer1.setBorderColor(new java.awt.Color(153, 153, 153));
        transfer1.setBorderThickness(3.0F);
        transfer1.setDefaultForeground(new java.awt.Color(255, 255, 255));
        transfer1.addActionListener(this::transfer1fancyButton4ActionPerformed);

        javax.swing.GroupLayout fancyPanel22Layout = new javax.swing.GroupLayout(fancyPanel22);
        fancyPanel22.setLayout(fancyPanel22Layout);
        fancyPanel22Layout.setHorizontalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyImage10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transfer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fancyPanel22Layout.setVerticalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addComponent(fancyImage10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
                        .addGap(21, 21, 21)
                        .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fancyPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        fancyPanel1Layout.setVerticalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fancyPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        new adminUserManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositActionPerformed

    private void transfer1fancyButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer1fancyButton4ActionPerformed
     new adminTransactions().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_transfer1fancyButton4ActionPerformed

    private void fancyButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton2ActionPerformed
       String search = searchBar.getText().trim();

    if (search.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter a User ID, name, or email first.");
        return;
    }
    int confirm = JOptionPane.showConfirmDialog(this, "Delete user: " + search + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }
    String sql = "DELETE FROM users " + "WHERE user_id = ? OR fullname = ? OR email = ?";

    try (Connection conn = new DBconnection().connect();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, search);
        ps.setString(2, search);
        ps.setString(3, search);

        int deleted = ps.executeUpdate();

        if (deleted > 0) {
            JOptionPane.showMessageDialog(this, "User deleted successfully!");
            searchBar.setText("");
            loadUsers();
        } else {
            JOptionPane.showMessageDialog(this, "User not found.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Delete Error: " + e.getMessage());
    }
    }//GEN-LAST:event_fancyButton2ActionPerformed

    private void fancyButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton3ActionPerformed
    new adminAddUser().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_fancyButton3ActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
     loadUsers();
    }//GEN-LAST:event_searchBarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     loadUsers();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void logoutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutAdminActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        new demoframe().setVisible(true);
        this.dispose();
        
        if (confirm == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "You have been logged out.");
    }
    }//GEN-LAST:event_logoutAdminActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new adminUserManagement().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyButton dashboard;
    private fancyui.FancyButton deposit;
    private fancyui.FancyButton fancyButton1;
    private fancyui.FancyButton fancyButton2;
    private fancyui.FancyButton fancyButton3;
    private fancyui.FancyImage fancyImage10;
    private fancyui.FancyLabel fancyLabel1;
    private fancyui.FancyLabel fancyLabel2;
    private fancyui.FancyPanel fancyPanel1;
    private fancyui.FancyPanel fancyPanel22;
    private fancyui.FancyPanel fancyPanel6;
    private fancyui.FancyTable fancyTable2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private fancyui.FancyButton logoutAdmin;
    private fancyui.FancyTextField searchBar;
    private fancyui.FancyButton transfer1;
    // End of variables declaration//GEN-END:variables
}
