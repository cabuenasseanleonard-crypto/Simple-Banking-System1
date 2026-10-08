
import javax.swing.JOptionPane;
public class demoframe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(demoframe.class.getName());
    public demoframe() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fancyButton1 = new fancyui.FancyButton();
        fancyPanel1 = new fancyui.FancyPanel();
        fancyPanel2 = new fancyui.FancyPanel();
        fancyLabel2 = new fancyui.FancyLabel();
        emailField = new fancyui.FancyTextField();
        passwordField = new fancyui.FancyPasswordField();
        forgotPassword = new fancyui.FancyLabel();
        loginBtn = new fancyui.FancyButton();
        fancyLabel5 = new fancyui.FancyLabel();
        registerBtn2 = new fancyui.FancyButton();
        fancyImage1 = new fancyui.FancyImage();
        fancyLabel4 = new fancyui.FancyLabel();
        fancyLabel1 = new fancyui.FancyLabel();

        fancyButton1.setText("fancyButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fancyPanel1.setGradientEnabled(false);
        fancyPanel1.setGradientEnd(new java.awt.Color(0, 0, 20));
        fancyPanel1.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel1.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        fancyPanel1.setSolidBackgroundEnabled(true);

        fancyPanel2.setBorderColor(new java.awt.Color(102, 102, 102));
        fancyPanel2.setBorderEnabled(true);
        fancyPanel2.setBorderThickness(2.0F);
        fancyPanel2.setGradientEnabled(false);
        fancyPanel2.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel2.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel2.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        fancyPanel2.setSolidBackgroundEnabled(true);

        fancyLabel2.setForeground(new java.awt.Color(218, 212, 212));
        fancyLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel2.setText("Enter your credentials to access your account.");
        fancyLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N

        emailField.setBackgroundColor(new java.awt.Color(0, 0, 25));
        emailField.setBorderColor(new java.awt.Color(102, 102, 102));
        emailField.setCornerRadius(7);
        emailField.setLeftIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-user-25.png")); // NOI18N
        emailField.setPlaceholder("User ID/ Email");
        emailField.addActionListener(this::emailFieldActionPerformed);

        passwordField.setBackgroundColor(new java.awt.Color(0, 0, 25));
        passwordField.setBorderColor(new java.awt.Color(102, 102, 102));
        passwordField.setLeftIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-password-25.png")); // NOI18N
        passwordField.addActionListener(this::passwordFieldActionPerformed);

        forgotPassword.setBackground(new java.awt.Color(64, 0, 160));
        forgotPassword.setForeground(new java.awt.Color(90, 18, 199));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassword.setText("Forgot Password?");
        forgotPassword.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setBackgroundColor(new java.awt.Color(51, 0, 153));
        loginBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setGradientEnabled(true);
        loginBtn.setGradientEnd(new java.awt.Color(102, 51, 255));
        loginBtn.setGradientStart(new java.awt.Color(0, 0, 102));
        loginBtn.addActionListener(this::loginBtnActionPerformed);

        fancyLabel5.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel5.setText("Login");
        fancyLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        registerBtn2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        registerBtn2.setText("Register");
        registerBtn2.setBackgroundColor(new java.awt.Color(51, 0, 153));
        registerBtn2.setDefaultForeground(new java.awt.Color(255, 255, 255));
        registerBtn2.setGradientEnabled(true);
        registerBtn2.setGradientEnd(new java.awt.Color(102, 51, 255));
        registerBtn2.setGradientStart(new java.awt.Color(0, 0, 102));
        registerBtn2.addActionListener(this::registerBtn2ActionPerformed);

        javax.swing.GroupLayout fancyPanel2Layout = new javax.swing.GroupLayout(fancyPanel2);
        fancyPanel2.setLayout(fancyPanel2Layout);
        fancyPanel2Layout.setHorizontalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fancyLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fancyLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        fancyPanel2Layout.setVerticalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        emailField.getAccessibleContext().setAccessibleName("");

        fancyImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage1.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        fancyLabel4.setForeground(new java.awt.Color(255, 204, 0));
        fancyLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel4.setText("Welcome back!");
        fancyLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        fancyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel1.setText(" Login to continue");
        fancyLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        javax.swing.GroupLayout fancyPanel1Layout = new javax.swing.GroupLayout(fancyPanel1);
        fancyPanel1.setLayout(fancyPanel1Layout);
        fancyPanel1Layout.setHorizontalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel1Layout.createSequentialGroup()
                .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fancyImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fancyLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        fancyPanel1Layout.setVerticalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
     String email = emailField.getText().trim();
     String password = new String(passwordField.getPassword());
     
     String role = new DBconnection().login(email, password);
     System.out.println(role);
        
     if(role.equalsIgnoreCase("admin")){
        JOptionPane.showMessageDialog(this, "Login Success! Welcome Admin");
        new adminDashboard().setVisible(true);
        this.dispose();
        }else if(role.equalsIgnoreCase("customer")){
            JOptionPane.showMessageDialog(this, "Login Success! Welcome Customer " + Session.fullname);
              new Dashboard().setVisible(true);
              this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Invalid email or password!");
        }
     
//     if(success) {
//         JOptionPane.showMessageDialog(this, "Login Success!");
//         new Dashboard().setVisible(true);
//         this.dispose();
//     }else{
//         JOptionPane.showMessageDialog(this, "Login Failed");
//     }
//     
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtn2ActionPerformed
        new createAccount().setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_registerBtn2ActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
    String email = JOptionPane.showInputDialog( this, "Enter your email:");

    if (email == null || email.trim().isEmpty()) {
        return;
    }
    String newPassword = JOptionPane.showInputDialog(this, "Enter your new password:");

    if (newPassword == null || newPassword.trim().isEmpty()) {
        return;
    }
    DBconnection db = new DBconnection();
    boolean success = db.forgotPassword(email.trim(), newPassword.trim());

    if (success) {
        JOptionPane.showMessageDialog(this, "Password successfully changed!");
    } else {
        JOptionPane.showMessageDialog(this, "Email not found.");
    }
    }//GEN-LAST:event_forgotPasswordMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new demoframe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private fancyui.FancyTextField emailField;
    private fancyui.FancyButton fancyButton1;
    private fancyui.FancyImage fancyImage1;
    private fancyui.FancyLabel fancyLabel1;
    private fancyui.FancyLabel fancyLabel2;
    private fancyui.FancyLabel fancyLabel4;
    private fancyui.FancyLabel fancyLabel5;
    private fancyui.FancyPanel fancyPanel1;
    private fancyui.FancyPanel fancyPanel2;
    private fancyui.FancyLabel forgotPassword;
    private fancyui.FancyButton loginBtn;
    private fancyui.FancyPasswordField passwordField;
    private fancyui.FancyButton registerBtn2;
    // End of variables declaration//GEN-END:variables
}
