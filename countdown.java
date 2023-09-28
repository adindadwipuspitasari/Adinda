
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adinda puspitasari
 */
public class countdown extends javax.swing.JFrame {
Timer timer;
    
    int angka;
    /**
     * Creates new form countdown
     */
    public countdown() {
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

        eTampil = new javax.swing.JLabel();
        eStop = new javax.swing.JButton();
        eMulai = new javax.swing.JButton();
        eAngka = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eTampil.setFont(new java.awt.Font("Segoe UI", 0, 100)); // NOI18N
        eTampil.setForeground(new java.awt.Color(255, 255, 255));
        eTampil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(eTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 90));

        eStop.setText("STOP");
        eStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eStopActionPerformed(evt);
            }
        });
        getContentPane().add(eStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        eMulai.setText("MULAI");
        eMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(eMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        eAngka.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        eAngka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAngkaActionPerformed(evt);
            }
        });
        eAngka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eAngkaKeyReleased(evt);
            }
        });
        getContentPane().add(eAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 230, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COUNTDOWN (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAngkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eAngkaActionPerformed

    private void eMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMulaiActionPerformed
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               if(angka > 0){
                   angka--;
                   eTampil.setText(Integer.toString(angka)); // Update label ehitung
                } else {
                    timer.stop(); // Hentikan timer ketika angka mencapai 0
                    JOptionPane.showMessageDialog(null, "Countdown Selesai!");
                }
            }
        });
    timer.start();
    }//GEN-LAST:event_eMulaiActionPerformed

    private void eAngkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eAngkaKeyReleased
        eTampil.setText(""+eAngka.getText());
        angka = Integer.parseInt(eAngka.getText());
    }//GEN-LAST:event_eAngkaKeyReleased

    private void eStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eStopActionPerformed
        timer.stop();
    }//GEN-LAST:event_eStopActionPerformed

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
            java.util.logging.Logger.getLogger(countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new countdown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eAngka;
    private javax.swing.JButton eMulai;
    private javax.swing.JButton eStop;
    private javax.swing.JLabel eTampil;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}