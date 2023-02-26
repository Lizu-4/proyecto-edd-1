/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author Liz
 */
public class ReporteStock extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public ReporteStock() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        panelDfs = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelBFS = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        archivoDefecto5 = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDfs.setBackground(new java.awt.Color(204, 204, 204));
        panelDfs.setColumns(20);
        panelDfs.setForeground(new java.awt.Color(0, 0, 0));
        panelDfs.setRows(5);
        jScrollPane2.setViewportView(panelDfs);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 220, 270));

        panelBFS.setBackground(new java.awt.Color(204, 204, 204));
        panelBFS.setColumns(20);
        panelBFS.setForeground(new java.awt.Color(0, 0, 0));
        panelBFS.setRows(5);
        jScrollPane3.setViewportView(panelBFS);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 270));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Headline R", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("BFS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 40, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Headline R", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("DFS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 40, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Headline R", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ver Stock");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        archivoDefecto5.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto5.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto5.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto5.setText("Enviar");
        archivoDefecto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto5ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 130, 30));

        menu.setBackground(new java.awt.Color(153, 153, 153));
        menu.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(51, 51, 51));
        menu.setText("Regresar al menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoDefecto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivoDefecto5ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoDefecto5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton menu;
    private javax.swing.JTextArea panelBFS;
    private javax.swing.JTextArea panelDfs;
    // End of variables declaration//GEN-END:variables
}
