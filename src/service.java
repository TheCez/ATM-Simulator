
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarve
 */
public class service extends javax.swing.JFrame {

    /**
     * Creates new form service
     */
    public service() {
        
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
        service_txt = new javax.swing.JLabel();
        balance_txt = new javax.swing.JLabel();
        arrowbal = new javax.swing.JLabel();
        cash_with_txt = new javax.swing.JLabel();
        arrowcw = new javax.swing.JLabel();
        atmbg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        service_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        service_txt.setText("select the service");
        jPanel1.add(service_txt);
        service_txt.setBounds(520, 250, 315, 80);

        balance_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balance_txt.setForeground(new java.awt.Color(255, 255, 255));
        balance_txt.setText("BALANCE ENQUIRY");
        jPanel1.add(balance_txt);
        balance_txt.setBounds(770, 380, 160, 40);

        arrowbal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        jPanel1.add(arrowbal);
        arrowbal.setBounds(770, 380, 160, 40);

        cash_with_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cash_with_txt.setForeground(new java.awt.Color(255, 255, 255));
        cash_with_txt.setText("CASH WITHDRAWAL");
        jPanel1.add(cash_with_txt);
        cash_with_txt.setBounds(770, 330, 160, 40);

        arrowcw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        jPanel1.add(arrowcw);
        arrowcw.setBounds(770, 330, 160, 40);

        atmbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atmbg);
        atmbg.setBounds(435, 248, 500, 320);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg.jpg"))); // NOI18N
        main_bg.setText("jLabel2");
        jPanel1.add(main_bg);
        main_bg.setBounds(200, 0, 952, 730);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel arrowbal;
    private javax.swing.JLabel arrowcw;
    private javax.swing.JLabel atmbg;
    private javax.swing.JLabel balance_txt;
    private javax.swing.JLabel cash_with_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JLabel service_txt;
    // End of variables declaration//GEN-END:variables
}
