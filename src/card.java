/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarve
 */
import java.awt.Toolkit;

public class card extends javax.swing.JFrame {

    /**
     * Creates new form card
     */
    public card() {
        
        this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cardslot = new javax.swing.JLabel();
        card = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pls_insert = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        atm_bg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 670));
        jPanel1.setLayout(null);

        cardslot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardslot2.jpg"))); // NOI18N
        jPanel1.add(cardslot);
        cardslot.setBounds(910, 470, 100, 40);

        card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tide1.jpg"))); // NOI18N
        jPanel1.add(card);
        card.setBounds(920, 580, 74, 120);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(930, 590, 60, 100);

        Pls_insert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Pls_insert.setText("please insert the card");
        jPanel1.add(Pls_insert);
        Pls_insert.setBounds(580, 310, 260, 40);

        Welcome.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Welcome.setText("Welcome");
        jPanel1.add(Welcome);
        Welcome.setBounds(600, 220, 240, 40);

        atm_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atm_bg);
        atm_bg.setBounds(520, 190, 380, 240);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbgkey.jpg"))); // NOI18N
        jPanel1.add(main_bg);
        main_bg.setBounds(350, 0, 700, 730);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         insert i1 =new insert();
         i1.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Pls_insert;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel atm_bg;
    private javax.swing.JLabel card;
    private javax.swing.JLabel cardslot;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    // End of variables declaration//GEN-END:variables
}
