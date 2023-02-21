/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Funciones {
    public void escribir_txt(Lista<Vertice> vertices,Lista<Arista> aristas){
        String vertices_actuales = "Almacenes;" + "\n";
        String aristas_actuales = "Rutas;" + "\n";
        String total = "";
        if(!vertices.isEmpty()){
            Nodo<Vertice> temp = vertices.getHead();
            for (int i = 0; i < vertices.getSize(); i++) {
                vertices_actuales += "Almacen " + temp.getData().getName()+ ":" + "\n";
                Nodo<Producto> aux = temp.getData().getProductos().getHead();
                for (int j = 0; j < temp.getData().getProductos().getSize(); j++) {
                    vertices_actuales += aux.getData().getNombre() + "," + aux.getData().getCantidad() + "\n";
                    aux = aux.getNext();
                }
                temp = temp.getNext();
            }
            Nodo<Arista> temp2 = aristas.getHead();
            for (int i = 0; i < aristas.getSize(); i++) {
                aristas_actuales += temp2.getData().getVertice1().getData().getName()+ "," + temp2.getData().getVertice2().getData().getName()+ "," +temp2.getData().getPeso()+"\n";
                temp2 = temp2.getNext();
            }
        }
        total += vertices_actuales + aristas_actuales;
        
        try{
            PrintWriter pw = new PrintWriter("test\\bd.txt");
            pw.print(total);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err);
        }
    }   
}
