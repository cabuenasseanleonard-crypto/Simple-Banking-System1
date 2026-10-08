import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Transfer extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Transfer.class.getName());

    public Transfer() {
        initComponents();
        setLocationRelativeTo(null);
        accMatch.setText("");
        balAfterLabel.setText("₱0.00");
        transferMethodComB.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[]{"Select Transfer Method", "Bank Transfer", "GCash"}
    ));

    loadBalance();
    }

    private void loadBalance() {
    try (Connection con = new DBconnection().connect();
         PreparedStatement ps = con.prepareStatement( "SELECT balance FROM accounts WHERE user_id=?")) {
        ps.setInt(1, Session.userid);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
        curBalanceLabel.setText(String.format("₱%,.2f", rs.getDouble("balance")));
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Unable to load balance.");
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        recipNameField = new fancyui.FancyTextField();
        accMatch = new fancyui.FancyLabel();
        jLabel5 = new javax.swing.JLabel();
        accNumField = new fancyui.FancyTextField();
        jLabel6 = new javax.swing.JLabel();
        transferAmountField = new fancyui.FancyTextField();
        fancyButton1 = new fancyui.FancyButton();
        fancyButton2 = new fancyui.FancyButton();
        fancyButton3 = new fancyui.FancyButton();
        fancyButton4 = new fancyui.FancyButton();
        jLabel7 = new javax.swing.JLabel();
        curBalanceLabel = new fancyui.FancyLabel();
        jLabel9 = new javax.swing.JLabel();
        transferMethodComB = new javax.swing.JComboBox<>();
        transferBtn = new fancyui.FancyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fancyPanel10 = new fancyui.FancyPanel();
        fancyLabel11 = new fancyui.FancyLabel();
        fancyPanel4 = new fancyui.FancyPanel();
        fancyLabel5 = new fancyui.FancyLabel();
        fancyPanel22 = new fancyui.FancyPanel();
        balAfterLabel = new fancyui.FancyLabel();
        jLabel8 = new javax.swing.JLabel();
        fancyImage11 = new fancyui.FancyImage();

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
            .addComponent(fancyButton48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fancyButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdraw1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
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
                .addComponent(withdraw1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(fancyButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fancyPanel6.setBorderColor(new java.awt.Color(153, 153, 153));
        fancyPanel6.setBorderEnabled(true);
        fancyPanel6.setBorderThickness(2.0F);
        fancyPanel6.setGradientAngle(65);
        fancyPanel6.setGradientEnd(new java.awt.Color(0, 0, 25));
        fancyPanel6.setGradientStart(new java.awt.Color(18, 0, 38));
        fancyPanel6.setSolidBackgroundColor(new java.awt.Color(0, 0, 25));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transfer Details");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recipients Account Number");

        recipNameField.setCornerRadius(6);
        recipNameField.addActionListener(this::recipNameFieldActionPerformed);

        accMatch.setForeground(new java.awt.Color(18, 0, 38));
        accMatch.setText("Account found");
        accMatch.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transfer Amount");

        accNumField.setCornerRadius(6);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recipients Name");

        transferAmountField.setCornerRadius(6);
        transferAmountField.setPlaceholder("₱0.00");

        fancyButton1.setText("₱5k");
        fancyButton1.setBackgroundColor(new java.awt.Color(0, 0, 58));
        fancyButton1.setBorderColor(new java.awt.Color(0, 0, 102));
        fancyButton1.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton1.addActionListener(this::fancyButton1ActionPerformed);

        fancyButton2.setText("₱10k");
        fancyButton2.setBackgroundColor(new java.awt.Color(0, 0, 58));
        fancyButton2.setBorderColor(new java.awt.Color(0, 0, 102));
        fancyButton2.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton2.addActionListener(this::fancyButton2ActionPerformed);

        fancyButton3.setText("₱20k");
        fancyButton3.setBackgroundColor(new java.awt.Color(0, 0, 58));
        fancyButton3.setBorderColor(new java.awt.Color(0, 0, 102));
        fancyButton3.setDefaultForeground(new java.awt.Color(255, 255, 255));
        fancyButton3.addActionListener(this::fancyButton3ActionPerformed);

        fancyButton4.setText("₱1k");
        fancyButton4.setBackgroundColor(new java.awt.Color(0, 0, 58));
        fancyButton4.setBorderColor(new java.awt.Color(0, 0, 102));
        fancyButton4.setDefaultForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Current Balance");

        curBalanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        curBalanceLabel.setText("₱25,750.00");
        curBalanceLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Transfer Method");

        transferMethodComB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        transferBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        transferBtn.setText("Transfer");
        transferBtn.setBorderColor(new java.awt.Color(0, 0, 102));
        transferBtn.setDefaultForeground(new java.awt.Color(255, 255, 255));
        transferBtn.setGradientEnabled(true);
        transferBtn.setGradientEnd(new java.awt.Color(8, 0, 17));
        transferBtn.setGradientStart(new java.awt.Color(102, 51, 255));
        transferBtn.addActionListener(this::transferBtnActionPerformed);

        javax.swing.GroupLayout fancyPanel6Layout = new javax.swing.GroupLayout(fancyPanel6);
        fancyPanel6.setLayout(fancyPanel6Layout);
        fancyPanel6Layout.setHorizontalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fancyPanel6Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(accMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fancyPanel6Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recipNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accNumField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fancyPanel6Layout.createSequentialGroup()
                                    .addComponent(transferAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fancyButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fancyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fancyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fancyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fancyPanel6Layout.createSequentialGroup()
                                    .addComponent(curBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))))
                        .addGroup(fancyPanel6Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(transferMethodComB, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        fancyPanel6Layout.setVerticalGroup(
            fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferAmountField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fancyPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fancyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fancyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fancyButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fancyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferMethodComB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transfer");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Send money to another Bank account.");

        fancyPanel10.setGradientEnd(new java.awt.Color(125, 24, 175));
        fancyPanel10.setGradientStart(new java.awt.Color(0, 0, 51));
        fancyPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fancyPanel10MouseClicked(evt);
            }
        });

        fancyLabel11.setForeground(new java.awt.Color(255, 204, 0));
        fancyLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-user-24 (1).png")); // NOI18N
        fancyLabel11.setText("Jasper Arenas");
        fancyLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        javax.swing.GroupLayout fancyPanel10Layout = new javax.swing.GroupLayout(fancyPanel10);
        fancyPanel10.setLayout(fancyPanel10Layout);
        fancyPanel10Layout.setHorizontalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel10Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(fancyLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fancyPanel10Layout.setVerticalGroup(
            fancyPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fancyLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fancyPanel4.setBorderEnabled(true);
        fancyPanel4.setGradientEnd(new java.awt.Color(25, 0, 56));
        fancyPanel4.setGradientStart(new java.awt.Color(76, 0, 153));

        fancyLabel5.setForeground(new java.awt.Color(255, 255, 255));
        fancyLabel5.setText("Transfer to your account");
        fancyLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N

        fancyPanel22.setBorderColor(new java.awt.Color(0, 0, 12));
        fancyPanel22.setBorderEnabled(true);
        fancyPanel22.setGradientEnd(new java.awt.Color(51, 0, 102));
        fancyPanel22.setGradientStart(new java.awt.Color(118, 32, 204));
        fancyPanel22.setSolidBackgroundColor(new java.awt.Color(7, 0, 28));

        balAfterLabel.setForeground(new java.awt.Color(51, 255, 51));
        balAfterLabel.setText("₱20,750.00");
        balAfterLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Balance After Transfer");

        javax.swing.GroupLayout fancyPanel22Layout = new javax.swing.GroupLayout(fancyPanel22);
        fancyPanel22.setLayout(fancyPanel22Layout);
        fancyPanel22Layout.setHorizontalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGroup(fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fancyPanel22Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(balAfterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel22Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        fancyPanel22Layout.setVerticalGroup(
            fancyPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel22Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balAfterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        fancyImage11.setIcon(new javax.swing.ImageIcon("C:\\Users\\p_gen\\Downloads\\icons8-transfer-100 (1).png")); // NOI18N

        javax.swing.GroupLayout fancyPanel4Layout = new javax.swing.GroupLayout(fancyPanel4);
        fancyPanel4.setLayout(fancyPanel4Layout);
        fancyPanel4Layout.setHorizontalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fancyPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fancyPanel4Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(fancyImage11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fancyPanel4Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        fancyPanel4Layout.setVerticalGroup(
            fancyPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fancyPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fancyImage11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fancyLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fancyPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fancyPanel21Layout = new javax.swing.GroupLayout(fancyPanel21);
        fancyPanel21.setLayout(fancyPanel21Layout);
        fancyPanel21Layout.setHorizontalGroup(
            fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fancyPanel21Layout.createSequentialGroup()
                .addGap(0, 0, 0)
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
                        .addComponent(fancyPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(fancyPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fancyPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fancyPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fancyPanel21Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(fancyPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
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

    private void fancyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fancyButton1ActionPerformed

    private void fancyButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fancyButton2ActionPerformed

    private void fancyButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fancyButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fancyButton3ActionPerformed

    private void withdraw1fancyButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw1fancyButton5ActionPerformed
     new TransactionHistory().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_withdraw1fancyButton5ActionPerformed

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

    private void recipNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recipNameFieldActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
      try {
        String account = accNumField.getText().trim();
        double amount = Double.parseDouble(transferAmountField.getText());
        String method = transferMethodComB.getSelectedItem().toString();

        if (account.isEmpty() || amount <= 0) {
            JOptionPane.showMessageDialog(this, "Enter valid transfer details.");
            return;
        }
        if (method.equals("Select Transfer Method")) {
            JOptionPane.showMessageDialog(this, "Select a transfer method.");
            return;
        }
        JPasswordField pin = new JPasswordField();
        if (JOptionPane.showConfirmDialog(this, pin, "Enter PIN", JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;

        Connection con = new DBconnection().connect();

        PreparedStatement ps = con.prepareStatement("SELECT pin, balance FROM users JOIN accounts USING(user_id) WHERE user_id=?");
        ps.setInt(1, Session.userid);
        ResultSet rs = ps.executeQuery();

        if (!rs.next() || !new String(pin.getPassword()).equals(rs.getString("pin"))) {
            JOptionPane.showMessageDialog(this, "Incorrect PIN.");
            return;
        }

        double balance = rs.getDouble("balance");

        if (amount > balance) {
            JOptionPane.showMessageDialog(this, "Insufficient balance.");
            return;
        }

        ps = con.prepareStatement("SELECT user_id FROM accounts WHERE account_number=?");
        ps.setString(1, account);
        rs = ps.executeQuery();

        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Recipient account not found.");
            return;
        }

        int receiver = rs.getInt("user_id");

        if (receiver == Session.userid) {
             JOptionPane.showMessageDialog(this, "You cannot transfer to yourself.");
            return;
        }

        double newBalance = balance - amount;

        ps = con.prepareStatement("UPDATE accounts SET balance=? WHERE user_id=?");
        ps.setDouble(1, newBalance);
        ps.setInt(2, Session.userid);
        ps.executeUpdate();

        ps = con.prepareStatement("UPDATE accounts SET balance=balance+? WHERE user_id=?");
        ps.setDouble(1, amount);
        ps.setInt(2, receiver);
        ps.executeUpdate();

        ps = con.prepareStatement("INSERT INTO transactions " + "(user_id, transaction_type, description, amount, date_time, balance_after) " +
        "VALUES (?, 'Transfer', ?, ?, datetime('now','localtime'), ?)");
        ps.setInt(1, Session.userid);
        ps.setString(2, method + "to" + account);
        ps.setDouble(3, -amount);
        ps.setDouble(4, newBalance);
        ps.executeUpdate();

        curBalanceLabel.setText(String.format("₱%,.2f", newBalance));
        balAfterLabel.setText(String.format("₱%,.2f", newBalance));
        JOptionPane.showMessageDialog(this, "Transfer successful!");

    } catch (Exception e) {JOptionPane.showMessageDialog(this, "Invalid amount or transfer failed.");
    }
    }//GEN-LAST:event_transferBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Transfer().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fancyui.FancyLabel accMatch;
    private fancyui.FancyTextField accNumField;
    private fancyui.FancyLabel balAfterLabel;
    private fancyui.FancyLabel curBalanceLabel;
    private fancyui.FancyButton fancyButton1;
    private fancyui.FancyButton fancyButton2;
    private fancyui.FancyButton fancyButton3;
    private fancyui.FancyButton fancyButton4;
    private fancyui.FancyButton fancyButton44;
    private fancyui.FancyButton fancyButton45;
    private fancyui.FancyButton fancyButton46;
    private fancyui.FancyButton fancyButton47;
    private fancyui.FancyButton fancyButton48;
    private fancyui.FancyButton fancyButton49;
    private fancyui.FancyImage fancyImage11;
    private fancyui.FancyImage fancyImage8;
    private fancyui.FancyLabel fancyLabel11;
    private fancyui.FancyLabel fancyLabel5;
    private fancyui.FancyPanel fancyPanel10;
    private fancyui.FancyPanel fancyPanel20;
    private fancyui.FancyPanel fancyPanel21;
    private fancyui.FancyPanel fancyPanel22;
    private fancyui.FancyPanel fancyPanel4;
    private fancyui.FancyPanel fancyPanel6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private fancyui.FancyTextField recipNameField;
    private fancyui.FancyTextField transferAmountField;
    private fancyui.FancyButton transferBtn;
    private javax.swing.JComboBox<String> transferMethodComB;
    private fancyui.FancyButton withdraw1;
    // End of variables declaration//GEN-END:variables
}
