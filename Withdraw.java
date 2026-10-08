
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Withdraw extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Withdraw.class.getName());

    public Withdraw() {
    initComponents();
    loadBalance();
    setLocationRelativeTo(null);
    userWithdraw.setText(Session.fullname);

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Select Withdrawal Method", "Cash", "ATM", "GCash", "Bank Transfer"}));
    }
    
    private void loadBalance() {
    String sql = "SELECT balance FROM accounts WHERE user_id = ?";

    try (Connection conn = new DBconnection().connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
         pstmt.setInt(1, Session.userid);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            double balance = rs.getDouble("balance");
            withdrawCurBalance.setText(String.format("₱%,.2f", balance));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Unable to load balance: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fancyPanel5 = new fancyui.FancyPanel();
        fancyLabel2 = new fancyui.FancyLabel();
        fancyLabel3 = new fancyui.FancyLabel();
        fancyTextField1 = new fancyui.FancyTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        fancyButton1 = new fancyui.FancyButton();
        fancyLabel4 = new fancyui.FancyLabel();
        jLabel3 = new javax.swing.JLabel();
        fancyPanel21 = new fancyui.FancyPanel();
        fancyPanel20 = new fancyui.FancyPanel();
        fancyImage8 = new fancyui.FancyImage();
        fancyButton44 = new fancyui.FancyButton();
        fancyButton45 = new fancyui.FancyButton();
        fancyButton46 = new fancyui.FancyButton();
        fancyButton47 = new fancyui.FancyButton();
        fancyButton48 = new fancyui.FancyButton();
        fancyButton49 = new fancyui.FancyButton();
        withdraw1 = new fancyui.FancyButton();
        fancyPanel6 = new fancyui.FancyPanel();
        fancyPanel4 = new fancyui.FancyPanel();
        fancyLabel5 = new fancyui.FancyLabel();
        fancyPanel22 = new fancyui.FancyPanel();
        jLabel4 = new javax.swing.JLabel();
        withdrawCurBalance = new fancyui.FancyLabel();
        fancyPanel15 = new fancyui.FancyPanel();
        fancyImage5 = new fancyui.FancyImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel10 = new fancyui.FancyPanel();
        userWithdraw = new fancyui.FancyLabel();
        fancyPanel7 = new fancyui.FancyPanel();
        fancyLabel7 = new fancyui.FancyLabel();
        fancyLabel8 = new fancyui.FancyLabel();
        fancyTextField2 = new fancyui.FancyTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        fancyButton2 = new fancyui.FancyButton();
        fancyLabel9 = new fancyui.FancyLabel();
        jLabel5 = new javax.swing.JLabel();

        fancyPanel5.setBorderColor(new java.awt.Color(153, 0, 0));
        fancyPanel5.setBorderEnabled(true);
        fancyPanel5.setGradientEnd(new java.awt.Color(16, 0, 25));
        fancyPanel5.setGradientStart(new java.awt.Color(38, 0, 0));

        fancyLabel3.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel3.setText("Payment Method");
        fancyLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        fancyTextField1.setCornerRadius(8);
        fancyTextField1.setIconTextGap(12);
        fancyTextField1.setPlaceholder("0.00");
        fancyTextField1.addActionListener(this::fancyTextField1ActionPerformed);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fancyButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        fancyButton1.setText("Deposit");
        fancyButton1.setBorderThickness(0.0F);
        fancyButton1.setCornerRadius(6);
        fancyButton1.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton1.setGradientAngle(95);
        fancyButton1.setGradientEnabled(true);
        fancyButton1.setGradientEnd(new java.awt.Color(8, 0, 17));
        fancyButton1.setGradientStart(new java.awt.Color(102, 51, 255));

        fancyLabel4.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel4.setText("Enter Withdrawal Amount");
        fancyLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your balance will be updated after a successful deposit.");

        javax.swing.GroupLayout fancyPanel5Layout = new javax.swing.GroupLayout(fancyPanel5);
        fancyPanel5.setLayout(fancyPanel5Layout);
        fancyPanel5Layout.setHorizontalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addGroup(fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fancyButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fancyTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fancyPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        fancyPanel5Layout.setVerticalGroup(
            fancyPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fancyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(fancyLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(fancyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fancyPanel21.setGradientEnabled(false);
        fancyPanel21.setGradientEnd(new java.awt.Color(0, 0, 20));
        fancyPanel21.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel21.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));
        fancyPanel21.setSolidBackgroundEnabled(true);

        fancyPanel20.setBorderEnabled(true);
        fancyPanel20.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel20.setGradientStart(new java.awt.Color(0, 0, 51));

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

        withdraw1.setText("Transaction  History");
        withdraw1.setBackgroundColor(new java.awt.Color(0, 0, 51));
        withdraw1.setBorderColor(new java.awt.Color(153, 153, 153));
        withdraw1.setBorderThickness(3.0F);
        withdraw1.setDefaultForeground(new java.awt.Color(255, 255, 255));
        withdraw1.addActionListener(this::withdraw1fancyButton5ActionPerformed);

        javax.swing.GroupLayout fancyPanel20Layout = new javax.swing.GroupLayout(fancyPanel20);
        fancyPanel20.setLayout(fancyPanel20Layout);
        fancyPanel20Layout.setHorizontalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(fancyButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdraw1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addComponent(fancyButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fancyPanel20Layout.setVerticalGroup(
            fancyPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel20Layout.createSequentialGroup()
                .addComponent(fancyImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdraw1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fancyButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        fancyPanel6.setBorderColor(new java.awt.Color(51, 51, 51));
        fancyPanel6.setBorderEnabled(true);
        fancyPanel6.setBorderThickness(2.0F);
        fancyPanel6.setGradientAngle(65);
        fancyPanel6.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel6.setGradientStart(new java.awt.Color(18, 0, 38));
        fancyPanel6.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        fancyPanel4.setBorderColor(new java.awt.Color(153, 0, 0));
        fancyPanel4.setBorderEnabled(true);
        fancyPanel4.setGradientEnd(new java.awt.Color(12, 0, 0));
        fancyPanel4.setGradientStart(new java.awt.Color(38, 0, 0));

        fancyLabel5.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel5.setText("Withdraw from Your Account");
        fancyLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        fancyPanel22.setBorderColor(new java.awt.Color(0, 0, 12));
        fancyPanel22.setBorderEnabled(true);
        fancyPanel22.setGradientEnd(new java.awt.Color(17, 0, 35));
        fancyPanel22.setGradientStart(new java.awt.Color(102, 0, 0));
        fancyPanel22.setSolidBackgroundColor(new java.awt.Color(7, 0, 28));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Current Balance");

        withdrawCurBalance.setForeground(new java.awt.Color(51, 255, 51));
        withdrawCurBalance.setText("₱25,750.00");
        withdrawCurBalance.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout fancyPanel22Layout = new javax.swing.GroupLayout(fancyPanel22);
        fancyPanel22.setLayout(fancyPanel22Layout);
        fancyPanel22Layout.setHorizontalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel22Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(withdrawCurBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fancyPanel22Layout.setVerticalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawCurBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        fancyPanel15.setGradientEnd(new java.awt.Color(153, 102, 0));
        fancyPanel15.setGradientStart(new java.awt.Color(102, 51, 0));

        fancyImage5.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-up-50.png")); // NOI18N
        fancyImage5.setScaleType(fancyui.FancyImage.ScaleType.STRETCH);

        javax.swing.GroupLayout fancyPanel15Layout = new javax.swing.GroupLayout(fancyPanel15);
        fancyPanel15.setLayout(fancyPanel15Layout);
        fancyPanel15Layout.setHorizontalGroup(
            fancyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fancyImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        fancyPanel15Layout.setVerticalGroup(
            fancyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel15Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(fancyImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout fancyPanel4Layout = new javax.swing.GroupLayout(fancyPanel4);
        fancyPanel4.setLayout(fancyPanel4Layout);
        fancyPanel4Layout.setHorizontalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fancyPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fancyPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(fancyPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        fancyPanel4Layout.setVerticalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(fancyPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fancyPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fancyPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Withdraw");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Withdraw money from your account.");

        fancyPanel10.setGradientEnd(new java.awt.Color(125, 24, 175));
        fancyPanel10.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fancyPanel10MouseClicked(evt);
            }
        });

        userWithdraw.setForeground(new java.awt.Color(255, 204, 0));
        userWithdraw.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-user-24 (1).png")); // NOI18N
        userWithdraw.setText("Jasper Arenas");
        userWithdraw.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel10Layout = new javax.swing.GroupLayout(fancyPanel10);
        fancyPanel10.setLayout(fancyPanel10Layout);
        fancyPanel10Layout.setHorizontalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel10Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(userWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fancyPanel10Layout.setVerticalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fancyPanel7.setBorderColor(new java.awt.Color(153, 0, 0));
        fancyPanel7.setBorderEnabled(true);
        fancyPanel7.setGradientEnd(new java.awt.Color(12, 0, 0));
        fancyPanel7.setGradientStart(new java.awt.Color(38, 0, 0));

        fancyLabel8.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel8.setText("Payment Method");
        fancyLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        fancyTextField2.setCornerRadius(8);
        fancyTextField2.setIconTextGap(12);
        fancyTextField2.setPlaceholder("0.00");
        fancyTextField2.addActionListener(this::fancyTextField2ActionPerformed);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fancyButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        fancyButton2.setText("Withdraw");
        fancyButton2.setBorderThickness(0.0F);
        fancyButton2.setCornerRadius(6);
        fancyButton2.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton2.setGradientAngle(95);
        fancyButton2.setGradientEnabled(true);
        fancyButton2.setGradientEnd(new java.awt.Color(102, 0, 0));
        fancyButton2.setGradientStart(new java.awt.Color(255, 0, 0));
        fancyButton2.addActionListener(this::fancyButton2ActionPerformed);

        fancyLabel9.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel9.setText("Enter Withdrawal Amount");
        fancyLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ensure you have sufficient balance before withdrawing");

        javax.swing.GroupLayout fancyPanel7Layout = new javax.swing.GroupLayout(fancyPanel7);
        fancyPanel7.setLayout(fancyPanel7Layout);
        fancyPanel7Layout.setHorizontalGroup(
            fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel7Layout.createSequentialGroup()
                .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fancyButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fancyPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(fancyPanel7Layout.createSequentialGroup()
                                .addComponent(fancyLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fancyLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fancyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fancyLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        fancyPanel7Layout.setVerticalGroup(
            fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel7Layout.createSequentialGroup()
                .addGroup(fancyPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel7Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(fancyLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fancyLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fancyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(fancyLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel21Layout = new javax.swing.GroupLayout(fancyPanel21);
        fancyPanel21.setLayout(fancyPanel21Layout);
        fancyPanel21Layout.setHorizontalGroup(
            fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fancyPanel21Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fancyPanel21Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fancyPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fancyPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        fancyPanel21Layout.setVerticalGroup(
            fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fancyPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fancyPanel21Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2))
                    .addComponent(fancyPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fancyPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void fancyTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fancyTextField1ActionPerformed

    private void fancyTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fancyTextField2ActionPerformed

    private void withdraw1fancyButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw1fancyButton5ActionPerformed
      new TransactionHistory().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_withdraw1fancyButton5ActionPerformed

    private void fancyButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton2ActionPerformed
        try {
        double amount = Double.parseDouble(fancyTextField2.getText());
        String method = jComboBox2.getSelectedItem().toString();

        if (amount <= 0) {JOptionPane.showMessageDialog(this, "Enter a valid amount.");
        return;
        }

        if (method.equals("Select Withdrawal Method")) {JOptionPane.showMessageDialog(this, "Select a withdrawal method.");
        return;
        }
        JPasswordField pinField = new JPasswordField();

        if (JOptionPane.showConfirmDialog(this, pinField, "Enter PIN", JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        Connection con = new DBconnection().connect();
        
        PreparedStatement ps = con.prepareStatement("SELECT pin, balance FROM users JOIN accounts USING(user_id) WHERE user_id=?" );
        ps.setInt(1, Session.userid);
        
        ResultSet rs = ps.executeQuery();

        if (!rs.next() || !new String(pinField.getPassword()).equals(rs.getString("pin"))) {
            JOptionPane.showMessageDialog(this, "Incorrect PIN.");
            return;
        }
        double balance = rs.getDouble("balance");

        if (amount > balance) { JOptionPane.showMessageDialog(this, "Insufficient balance.");
        return;
        }
        double newBalance = balance - amount;

        ps = con.prepareStatement("UPDATE accounts SET balance=? WHERE user_id=?");
        ps.setDouble(1, newBalance);
        ps.setInt(2, Session.userid);
        ps.executeUpdate();

        ps = con.prepareStatement("INSERT INTO transactions(user_id,transaction_type,description,amount,date_time,balance_after) " +
        "VALUES(?,?,? ,?,datetime('now','localtime'),?)");
        
        ps.setInt(1, Session.userid);
        ps.setString(2, "Withdraw");
        ps.setString(3, method + " Withdrawal");
        ps.setDouble(4, -amount);
        ps.setDouble(5, newBalance);
        ps.executeUpdate();

        withdrawCurBalance.setText(String.format("₱%,.2f", newBalance));
        fancyTextField2.setText("");
        jComboBox2.setSelectedIndex(0);

        JOptionPane.showMessageDialog(this, "Withdrawal successful!");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Invalid amount or withdrawal failed.");
    }

    }//GEN-LAST:event_fancyButton2ActionPerformed

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
       int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to logout?",
        "Confirm Logout",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {

        JOptionPane.showMessageDialog(
            this,
            "You have been logged out."
        );

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
        java.awt.EventQueue.invokeLater(() -> new Withdraw().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyButton fancyButton1;
    private fancyui.FancyButton fancyButton2;
    private fancyui.FancyButton fancyButton44;
    private fancyui.FancyButton fancyButton45;
    private fancyui.FancyButton fancyButton46;
    private fancyui.FancyButton fancyButton47;
    private fancyui.FancyButton fancyButton48;
    private fancyui.FancyButton fancyButton49;
    private fancyui.FancyImage fancyImage5;
    private fancyui.FancyImage fancyImage8;
    private fancyui.FancyLabel fancyLabel2;
    private fancyui.FancyLabel fancyLabel3;
    private fancyui.FancyLabel fancyLabel4;
    private fancyui.FancyLabel fancyLabel5;
    private fancyui.FancyLabel fancyLabel7;
    private fancyui.FancyLabel fancyLabel8;
    private fancyui.FancyLabel fancyLabel9;
    private fancyui.FancyPanel fancyPanel10;
    private fancyui.FancyPanel fancyPanel15;
    private fancyui.FancyPanel fancyPanel20;
    private fancyui.FancyPanel fancyPanel21;
    private fancyui.FancyPanel fancyPanel22;
    private fancyui.FancyPanel fancyPanel4;
    private fancyui.FancyPanel fancyPanel5;
    private fancyui.FancyPanel fancyPanel6;
    private fancyui.FancyPanel fancyPanel7;
    private fancyui.FancyTextField fancyTextField1;
    private fancyui.FancyTextField fancyTextField2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private fancyui.FancyLabel userWithdraw;
    private fancyui.FancyButton withdraw1;
    private fancyui.FancyLabel withdrawCurBalance;
    // End of variables declaration//GEN-END:variables
}
