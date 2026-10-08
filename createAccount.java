
import javax.swing.JOptionPane;

public class createAccount extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(createAccount.class.getName());
    public createAccount() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fancyPanel1 = new fancyui.FancyPanel();
        fancyPanel2 = new fancyui.FancyPanel();
        fancyLabel2 = new fancyui.FancyLabel();
        fullName = new fancyui.FancyTextField();
        registerPass = new fancyui.FancyPasswordField();
        registerBtn = new fancyui.FancyButton();
        fancyLabel5 = new fancyui.FancyLabel();
        confirmPass = new fancyui.FancyPasswordField();
        email2 = new fancyui.FancyTextField();
        fancyLabel3 = new fancyui.FancyLabel();
        returnLogin = new fancyui.FancyLabel();
        fancyImage1 = new fancyui.FancyImage();
        fancyLabel4 = new fancyui.FancyLabel();
        fancyLabel1 = new fancyui.FancyLabel();

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
        fancyLabel2.setText("Fill in the details to create your account.");
        fancyLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N

        fullName.setBackgroundColor(new java.awt.Color(0, 0, 25));
        fullName.setBorderColor(new java.awt.Color(102, 102, 102));
        fullName.setCornerRadius(7);
        fullName.setLeftIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-user-24.png")); // NOI18N
        fullName.setPlaceholder("Full Name");
        fullName.addActionListener(this::fullNameActionPerformed);

        registerPass.setBackgroundColor(new java.awt.Color(0, 0, 25));
        registerPass.setBorderColor(new java.awt.Color(102, 102, 102));
        registerPass.setLeftIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-lock-24.png")); // NOI18N
        registerPass.addActionListener(this::registerPassActionPerformed);

        registerBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.setBackgroundColor(new java.awt.Color(51, 0, 153));
        registerBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setGradientEnabled(true);
        registerBtn.setGradientEnd(new java.awt.Color(102, 51, 255));
        registerBtn.setGradientStart(new java.awt.Color(0, 0, 102));
        registerBtn.addActionListener(this::registerBtnActionPerformed);

        fancyLabel5.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel5.setText("Register");
        fancyLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        confirmPass.setBackgroundColor(new java.awt.Color(0, 0, 25));
        confirmPass.setBorderColor(new java.awt.Color(102, 102, 102));
        confirmPass.setLeftIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-lock-24.png")); // NOI18N
        confirmPass.setPlaceholder("Confim Password");
        confirmPass.addActionListener(this::confirmPassActionPerformed);

        email2.setBackgroundColor(new java.awt.Color(0, 0, 25));
        email2.setBorderColor(new java.awt.Color(102, 102, 102));
        email2.setCornerRadius(7);
        email2.setPlaceholder("Email Address");
        email2.addActionListener(this::email2ActionPerformed);

        fancyLabel3.setForeground(new java.awt.Color(218, 212, 212));
        fancyLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel3.setText("Already have an account?");
        fancyLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N

        returnLogin.setForeground(new java.awt.Color(102, 0, 204));
        returnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnLogin.setText("Login");
        returnLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        returnLogin.setHoverBackground(new java.awt.Color(51, 0, 102));
        returnLogin.setHoverEnabled(true);
        returnLogin.setHoverForeground(new java.awt.Color(255, 255, 255));
        returnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fancyPanel2Layout = new javax.swing.GroupLayout(fancyPanel2);
        fancyPanel2.setLayout(fancyPanel2Layout);
        fancyPanel2Layout.setHorizontalGroup(
            fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel2Layout.createSequentialGroup()
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(registerPass, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(confirmPass, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(fancyLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullName, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(fancyLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fancyPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fancyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fancyImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\ChatGPT Image Sep 24, 2026, 04_56_03 PM.png")); // NOI18N
        fancyImage1.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        fancyLabel4.setForeground(new java.awt.Color(255, 204, 0));
        fancyLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel4.setText("Create your account");
        fancyLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        fancyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fancyLabel1.setText(" Start your Velora Bank journey");
        fancyLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        javax.swing.GroupLayout fancyPanel1Layout = new javax.swing.GroupLayout(fancyPanel1);
        fancyPanel1.setLayout(fancyPanel1Layout);
        fancyPanel1Layout.setHorizontalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        fancyPanel1Layout.setVerticalGroup(
            fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(fancyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(fancyImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(fancyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fancyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fancyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fancyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed

    private void registerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPassActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
    String fullName1 = fullName.getText().trim();
    String emailAddress1 = email2.getText().trim();
    String password1 = registerPass.getText();
    String confirmPassword = confirmPass.getText();

    if (fullName1.isEmpty() || emailAddress1.isEmpty() || password1.isEmpty() || confirmPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }
    if (!password1.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match.");
        return;
    }
    String pin = JOptionPane.showInputDialog(this, "Create your 4-digit PIN:");
    if (pin == null) {
        return;
    }
    if (!pin.matches("\\d{4}")) {
        JOptionPane.showMessageDialog(this, "PIN must be exactly 4 digits.");
        return;
    }
    boolean success = new DBconnection().registerUser(fullName1, emailAddress1, password1, pin);

    if (success) {
        JOptionPane.showMessageDialog(this, "Registration Successful!");
        new demoframe().setVisible(true);
        this.dispose();

    } else {
        JOptionPane.showMessageDialog(this, "Email is already registered");
    }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void confirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassActionPerformed

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void returnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLoginMouseClicked
     new demoframe().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_returnLoginMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new createAccount().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyPasswordField confirmPass;
    private fancyui.FancyTextField email2;
    private fancyui.FancyImage fancyImage1;
    private fancyui.FancyLabel fancyLabel1;
    private fancyui.FancyLabel fancyLabel2;
    private fancyui.FancyLabel fancyLabel3;
    private fancyui.FancyLabel fancyLabel4;
    private fancyui.FancyLabel fancyLabel5;
    private fancyui.FancyPanel fancyPanel1;
    private fancyui.FancyPanel fancyPanel2;
    private fancyui.FancyTextField fullName;
    private fancyui.FancyButton registerBtn;
    private fancyui.FancyPasswordField registerPass;
    private fancyui.FancyLabel returnLogin;
    // End of variables declaration//GEN-END:variables
}
