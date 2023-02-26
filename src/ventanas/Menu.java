/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import grafo.Grafo;
import grafo.Lector;
import grafo.Vertice;
import grafo.Producto;
import grafo.Vertice;
import grafo.GraphStream;

/**
 *
 * @author Liz
 */
public class Menu extends javax.swing.JFrame {
    Grafo matriz = Global.getGrafo();
    /**
     * Creates new form Inicio
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        archivoDefecto = new javax.swing.JButton();
        archivoDefecto1 = new javax.swing.JButton();
        archivoDefecto2 = new javax.swing.JButton();
        archivoDefecto3 = new javax.swing.JButton();
        archivoDefecto4 = new javax.swing.JButton();
        archivoDefecto5 = new javax.swing.JButton();
        archivoDefecto6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        archivoDefecto.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto.setText("Realizar Pedido");
        archivoDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefectoActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 160, 40));

        archivoDefecto1.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto1.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto1.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto1.setText("Ver Stock");
        archivoDefecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto1ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 160, 40));

        archivoDefecto2.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto2.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto2.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto2.setText("Gestionar Stock");
        archivoDefecto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto2ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 40));

        archivoDefecto3.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto3.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto3.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto3.setText("Nuevo Almacen");
        archivoDefecto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto3ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 160, 40));

        archivoDefecto4.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto4.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto4.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto4.setText("Nueva Arista");
        archivoDefecto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto4ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, 40));

        archivoDefecto5.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto5.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto5.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto5.setText("Ver Grafo");
        archivoDefecto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto5ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 40));

        archivoDefecto6.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto6.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto6.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto6.setText("Guardar Cambios");
        archivoDefecto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto6ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Headline R", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Seleccione una opcion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivoDefectoActionPerformed

    private void archivoDefecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto1ActionPerformed
        this.setVisible(false);
        ReporteStock stock = new ReporteStock();
    }//GEN-LAST:event_archivoDefecto1ActionPerformed

    private void archivoDefecto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        GestionStock stock = new GestionStock();
    }//GEN-LAST:event_archivoDefecto2ActionPerformed

    private void archivoDefecto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivoDefecto3ActionPerformed

    private void archivoDefecto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivoDefecto4ActionPerformed

    private void archivoDefecto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto5ActionPerformed
        // TODO add your handling code here:
        GraphStream graph = new GraphStream();
        Graph graficar = graph.Graphic(Global.getGrafo());
        System.setProperty("org.graphstream.ui", "swing");
        graficar.display();
    }//GEN-LAST:event_archivoDefecto5ActionPerformed

    private void archivoDefecto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto6ActionPerformed
        // TODO add your handling code here:
        Lector lec = new Lector();
        lec.writeTxt(matriz);
    }//GEN-LAST:event_archivoDefecto6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoDefecto;
    private javax.swing.JButton archivoDefecto1;
    private javax.swing.JButton archivoDefecto2;
    private javax.swing.JButton archivoDefecto3;
    private javax.swing.JButton archivoDefecto4;
    private javax.swing.JButton archivoDefecto5;
    private javax.swing.JButton archivoDefecto6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
