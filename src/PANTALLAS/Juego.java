/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PANTALLAS;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lab_edd2.Arbolinho;

import lab_edd2.Nodo;

/**
 *
 * @author maxtr
 */
public class Juego extends javax.swing.JFrame {

    private String respuestaCorrecta;

    static Nodo nodoActual;

    static Nodo raiz;

    private Map<Integer, String[]> datasetImagenes;

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        transparenciaButton();
        try {
            File fontStyle = new File("src\\Fuente\\league-spartan\\LeagueSpartan-Bold.otf");

            Font fontAcertijo = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(40f);
            Font fontOpciones = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(20f);
            TxtAcertijo.setFont((fontAcertijo));
            BtnOpcion1.setFont((fontOpciones));
            BtnOpcion2.setFont((fontOpciones));
            BtnOpcion3.setFont((fontOpciones));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Arbolinho arbol = new Arbolinho();
        arbol.crearArbol();
        nodoActual = arbol.raiz;
        raiz = arbol.raiz;

        cargarDatasetImagenes();
        actualizarImagenFondo();

        plantilla.setText(Integer.toString(nodoActual.nombre));

        TxtAcertijo.setVisible(false);
        BtnOpcion1.setVisible(false);
        BtnOpcion2.setVisible(false);
        BtnOpcion3.setVisible(false);
        BtnIzquierda.setVisible(false);
        BtnDerecha.setVisible(false);
    }

    private void cargarDatasetImagenes() {
        datasetImagenes = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\Resources\\Nodos_DS.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int nodoNombre = Integer.parseInt(partes[0]);
                datasetImagenes.put(nodoNombre, partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void actualizarImagenFondo() {
        String[] infoNodo = datasetImagenes.get(nodoActual.nombre);
        if (infoNodo != null) {
            String imagen1 = infoNodo[1];
            String imagen2 = infoNodo[2];
            String imagen3 = infoNodo[3];

            if (BtnAcertijo.isVisible()) {
                jLabel1.setIcon(new ImageIcon("src\\Resources\\ImagenesJuego\\" + imagen1));
            } else if (TxtAcertijo.isVisible()) {
                jLabel1.setIcon(new ImageIcon("src\\Resources\\ImagenesJuego\\" + imagen2));
            } else if (BtnIzquierda.isVisible() && BtnDerecha.isVisible()) {
                jLabel1.setIcon(new ImageIcon("src\\Resources\\ImagenesJuego\\" + imagen3));
            }

            jLabel1.revalidate();
            jLabel1.repaint();
        }
    }

    public void transparenciaButton() {
        BtnAcertijo.setOpaque(false);
        BtnAcertijo.setContentAreaFilled(false);
        BtnAcertijo.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAcertijo = new javax.swing.JButton();
        TxtAcertijo = new javax.swing.JLabel();
        BtnOpcion1 = new javax.swing.JButton();
        BtnOpcion2 = new javax.swing.JButton();
        BtnOpcion3 = new javax.swing.JButton();
        BtnIzquierda = new javax.swing.JButton();
        BtnDerecha = new javax.swing.JButton();
        plantilla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAcertijo.setBackground(new java.awt.Color(242, 242, 242));
        BtnAcertijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcertijoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAcertijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 340, 100));

        TxtAcertijo.setText("jLabel2");
        TxtAcertijo.setToolTipText("");
        getContentPane().add(TxtAcertijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 950, 460));

        BtnOpcion1.setText("jButton1");
        BtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 260, 90));

        BtnOpcion2.setText("jButton1");
        BtnOpcion2.setBorderPainted(false);
        BtnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 260, 90));

        BtnOpcion3.setText("jButton1");
        BtnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 593, 280, 90));

        BtnIzquierda.setText("Izquierda");
        BtnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));

        BtnDerecha.setText("Derecha");
        BtnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDerechaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, -1, -1));

        plantilla.setText("jLabel2");
        getContentPane().add(plantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAcertijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcertijoActionPerformed

        TxtAcertijo.setVisible(true);
        BtnOpcion1.setVisible(true);
        BtnOpcion2.setVisible(true);
        BtnOpcion3.setVisible(true);
        BtnAcertijo.setVisible(false);

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src/Resources/Acertijos_DS.txt"));
            List<String[]> listaAcertijos = new ArrayList<>();
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                listaAcertijos.add(partes);
            }

            Random random = new Random();
            int indice = random.nextInt(listaAcertijos.size());
            String[] acertijoSeleccionado = listaAcertijos.get(indice);

            TxtAcertijo.setText(acertijoSeleccionado[1]);
            BtnOpcion1.setText(acertijoSeleccionado[2]);
            BtnOpcion2.setText(acertijoSeleccionado[3]);
            BtnOpcion3.setText(acertijoSeleccionado[4]);

            respuestaCorrecta = acertijoSeleccionado[5];
            String[] infoNodo = datasetImagenes.get(nodoActual.nombre);
            if (infoNodo != null) {
                String imagen2 = infoNodo[2];
                jLabel1.setIcon(new ImageIcon("src\\Resources\\ImagenesJuego\\" + imagen2));
                jLabel1.revalidate();
                jLabel1.repaint();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnAcertijoActionPerformed
    private void verificarRespuesta(String respuestaSeleccionada) {
        if (respuestaSeleccionada.equals(respuestaCorrecta)) {
            JOptionPane.showMessageDialog(this, "¡Correcto!");

            BtnIzquierda.setVisible(true);
            BtnDerecha.setVisible(true);

            TxtAcertijo.setVisible(false);
            BtnOpcion1.setVisible(false);
            BtnOpcion2.setVisible(false);
            BtnOpcion3.setVisible(false);
            BtnAcertijo.setVisible(false);

            actualizarImagenFondo();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrecto, intenta con otro acertijo.");

            BtnIzquierda.setVisible(false);
            BtnDerecha.setVisible(false);

            BtnAcertijoActionPerformed(null);
        }
    }

    private void BtnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIzquierdaActionPerformed
        // TODO add your handling code here:
        avanceHistoria(nodoActual, BtnIzquierda.getText());

    }//GEN-LAST:event_BtnIzquierdaActionPerformed

    private void BtnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDerechaActionPerformed
        // TODO add your handling code here:
        avanceHistoria(nodoActual, BtnDerecha.getText());
    }//GEN-LAST:event_BtnDerechaActionPerformed

    private void BtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion1ActionPerformed
        verificarRespuesta(BtnOpcion1.getText());
    }//GEN-LAST:event_BtnOpcion1ActionPerformed

    private void BtnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion2ActionPerformed
        verificarRespuesta(BtnOpcion2.getText());
    }//GEN-LAST:event_BtnOpcion2ActionPerformed

    private void BtnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion3ActionPerformed
        verificarRespuesta(BtnOpcion3.getText());
    }//GEN-LAST:event_BtnOpcion3ActionPerformed

    public void avanceHistoria(Nodo nodo, String direccion) {
        if (direccion.toLowerCase().equals("izquierda")) {
            if (nodoActual.izq == null && nodoActual.der == null) {

                verificarNodoLlegada(nodoActual);
            } else {
                nodoActual = nodoActual.izq;
                plantilla.setText(Integer.toString(nodoActual.nombre));
                BtnIzquierda.setVisible(false);
                BtnDerecha.setVisible(false);
                BtnAcertijo.setVisible(true);
                actualizarImagenFondo();
                if (esHoja(nodoActual)) {
                    verificarNodoLlegada(nodoActual);
                }
            }
        } else if (direccion.toLowerCase().equals("derecha")) {
            if (nodoActual.izq == null && nodoActual.der == null) {

                verificarNodoLlegada(nodoActual);
            } else {
                nodoActual = nodoActual.der;
                plantilla.setText(Integer.toString(nodoActual.nombre));
                BtnIzquierda.setVisible(false);
                BtnDerecha.setVisible(false);
                BtnAcertijo.setVisible(true);
                actualizarImagenFondo();
                if (esHoja(nodoActual)) {
                    verificarNodoLlegada(nodoActual);
                }
            }
        }
    }

    private boolean esHoja(Nodo nodo) {
        return nodo.izq == null && nodo.der == null;
    }

    private void verificarNodoLlegada(Nodo nodo) {
        if (nodo.llegada) {

        } else {
            JOptionPane.showMessageDialog(null, "¡Te moriste! Regresando al nodo anterior...");
            nodoActual = encontrarPadre(raiz, nodo);
            actualizarImagenFondo();
            plantilla.setText(Integer.toString(nodoActual.nombre));
            BtnIzquierda.setVisible(false);
            BtnDerecha.setVisible(false);
            BtnAcertijo.setVisible(true);
        }
    }

    private Nodo encontrarPadre(Nodo raiz, Nodo nodo) {
        if (raiz == null || nodo == null) {
            return null;
        }

        if (raiz.izq == nodo || raiz.der == nodo) {
            return raiz;
        }

        Nodo left = encontrarPadre(raiz.izq, nodo);
        if (left != null) {
            return left;
        }

        return encontrarPadre(raiz.der, nodo);
    }

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcertijo;
    private javax.swing.JButton BtnDerecha;
    private javax.swing.JButton BtnIzquierda;
    private javax.swing.JButton BtnOpcion1;
    private javax.swing.JButton BtnOpcion2;
    private javax.swing.JButton BtnOpcion3;
    private javax.swing.JLabel TxtAcertijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel plantilla;
    // End of variables declaration//GEN-END:variables
}
