/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PANTALLAS;

import static PANTALLAS.Pantalla1_JUGAR.frameinstruc;
import java.awt.Font;
import java.io.File;

public class Pantalla2_INSTRUCCIONES extends javax.swing.JFrame {

    public static Pantalla3_MENU frameMENU = new Pantalla3_MENU();

    private boolean recicla = false;

    public Pantalla2_INSTRUCCIONES() {
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

        Bt_izq = new javax.swing.JToggleButton();
        Bt_estudiando = new javax.swing.JToggleButton();
        Bt_barriendo = new javax.swing.JToggleButton();
        Bt_reciclando = new javax.swing.JToggleButton();
        Bt_der = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt_izq.setToolTipText("");
        Bt_izq.setBorderPainted(false);
        Bt_izq.setContentAreaFilled(false);
        Bt_izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_izqActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, 80, 90));

        Bt_estudiando.setBorderPainted(false);
        Bt_estudiando.setContentAreaFilled(false);
        Bt_estudiando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_estudiandoActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_estudiando, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 190, 50));

        Bt_barriendo.setBorderPainted(false);
        Bt_barriendo.setContentAreaFilled(false);
        Bt_barriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_barriendoActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_barriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 190, 50));

        Bt_reciclando.setBorderPainted(false);
        Bt_reciclando.setContentAreaFilled(false);
        Bt_reciclando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_reciclandoActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_reciclando, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 190, 50));

        Bt_der.setBorder(null);
        Bt_der.setBorderPainted(false);
        Bt_der.setContentAreaFilled(false);
        Bt_der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_derActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_der, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 80, 100));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\maxtr\\OneDrive\\Documentos\\GitHub\\LAB_EDD2\\src\\IMAGENES\\Instrucciones.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_derActionPerformed
        if (recicla) {
            this.setVisible(false);
            frameMENU.setVisible(true);
        } else {
            new Pop_up("src/imagenes/NO.png");
        }
    }//GEN-LAST:event_Bt_derActionPerformed

    private void Bt_estudiandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_estudiandoActionPerformed
            new Pop_up("src/imagenes/NO.png");
    }//GEN-LAST:event_Bt_estudiandoActionPerformed

    private void Bt_izqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_izqActionPerformed
        new Pop_up("src/imagenes/NO.png");  
    }//GEN-LAST:event_Bt_izqActionPerformed

    private void Bt_reciclandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_reciclandoActionPerformed
        recicla = true;
        new Pop_up("src/imagenes/SI.png");
    }//GEN-LAST:event_Bt_reciclandoActionPerformed

    private void Bt_barriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_barriendoActionPerformed
        new Pop_up("src/imagenes/NO.png");

    }//GEN-LAST:event_Bt_barriendoActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla2_INSTRUCCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla2_INSTRUCCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla2_INSTRUCCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla2_INSTRUCCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla2_INSTRUCCIONES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bt_barriendo;
    private javax.swing.JToggleButton Bt_der;
    private javax.swing.JToggleButton Bt_estudiando;
    private javax.swing.JToggleButton Bt_izq;
    private javax.swing.JToggleButton Bt_reciclando;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
