/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import grafo.Grafo;
import grafo.Lista;
import grafo.Nodo;
import grafo.Producto;
import javax.swing.JOptionPane;
/**
 *
 * @author Liz
 */
public class GestionStock extends javax.swing.JFrame {
    Grafo grafo = Global.getGrafo();
    /**
     * Creates new form Inicio
     */
    public GestionStock() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Lista bfs = grafo.BFS(grafo, grafo.getVerts()[0].getName());
        this.panel.setText(bfs.printProductos());
        
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
        jLabel4 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        numAlmacen = new javax.swing.JTextField();
        producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        archivoDefecto5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Headline R", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Gestionar Stock");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        menu.setBackground(new java.awt.Color(153, 153, 153));
        menu.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(51, 51, 51));
        menu.setText("Regresar al menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 170, 20));

        numAlmacen.setBackground(new java.awt.Color(204, 204, 204));
        numAlmacen.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        numAlmacen.setForeground(new java.awt.Color(0, 0, 0));
        numAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(numAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 30, -1));

        producto.setBackground(new java.awt.Color(204, 204, 204));
        producto.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        producto.setForeground(new java.awt.Color(0, 0, 0));
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        jPanel1.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        jLabel5.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Almacen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        panel.setEditable(false);
        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setColumns(20);
        panel.setForeground(new java.awt.Color(0, 0, 0));
        panel.setRows(5);
        jScrollPane1.setViewportView(panel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 240, 320));

        jLabel8.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cantidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        archivoDefecto5.setBackground(new java.awt.Color(204, 153, 0));
        archivoDefecto5.setFont(new java.awt.Font("Headline R", 0, 12)); // NOI18N
        archivoDefecto5.setForeground(new java.awt.Color(51, 51, 51));
        archivoDefecto5.setText("Enviar");
        archivoDefecto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoDefecto5ActionPerformed(evt);
            }
        });
        jPanel1.add(archivoDefecto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //para regresar al menu
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu();
    }//GEN-LAST:event_menuActionPerformed

    private void numAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAlmacenActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoActionPerformed
    //para agregar nuevos o productos o modificar los que ya existen
    private void archivoDefecto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoDefecto5ActionPerformed
        // TODO add your handling code here:
        int cantidad1 = (int) cantidad.getValue();
        if(this.numAlmacen.getText() != null && this.producto.getText()!= null){
            int check_almacen = grafo.searchVertice(this.numAlmacen.getText());
            if(check_almacen != -1){
                Nodo<Producto> product = grafo.getVerts()[check_almacen].getProductos().getHead();
                boolean existencia_producto = false;
                for (int i = 0; i < grafo.getVerts()[check_almacen].getProductos().getSize(); i++) {
                    if(this.producto.getText().equalsIgnoreCase(product.getData().getNombre())){
                        existencia_producto = true;
                       product.getData().setCantidad(cantidad1 + product.getData().getCantidad());
                       JOptionPane.showMessageDialog(null, "El producto fue modificado con exito!");
                    }
                product = product.getNext();
                }
                if(!existencia_producto){
                    Producto produc = new Producto(this.producto.getText(),cantidad1);
                    grafo.getVerts()[check_almacen].getProductos().insertFinal(produc);
                    JOptionPane.showMessageDialog(null, "El producto fue agregado con exito");
                }
                Lista bfs = grafo.BFS(grafo, grafo.getVerts()[0].getName());
                this.panel.setText(bfs.printProductos());
                this.producto.setText("");
                this.numAlmacen.setText("");
                this.cantidad.setValue(0);
            }else{
                JOptionPane.showMessageDialog(null, "El almacen que ingresaste no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todas las casillas");
        }
    }//GEN-LAST:event_archivoDefecto5ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoDefecto5;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField numAlmacen;
    private javax.swing.JTextArea panel;
    private javax.swing.JTextField producto;
    // End of variables declaration//GEN-END:variables
}
