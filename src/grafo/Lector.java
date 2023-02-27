/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class Lector {
    //abre un archivo usando JFilechooser y retorna un txt
    public String openTxt() {
        String aux = "";
        String txt = "";
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abrir = file.getSelectedFile();
            if (abrir != null) {
                FileReader fr = new FileReader(abrir);
                BufferedReader br = new BufferedReader(fr);
                while ((aux = br.readLine()) != null) {
                    txt += aux + "\n";
                }
                br.close();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        return txt;
        
    }
    //le pasas la ruta del archivo y retorna un txt con sus datos
    public String readTxt(String path) {
        String line;
        String txt = "";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }
                }
            }
            return txt;
        } catch (Exception err) {
            return txt;
        }
    }    
   //sirve para cargar el grafo luego de recibir un txt     
    public Grafo loadGrafo(String txt){
        Grafo grafo = new Grafo();
        try{
            if (!"".equals(txt) && !txt.isEmpty()) {
                
                String[] split = txt.split("Rutas;");
                // Vertices
                String[] almacenes = split[0].split(";");
                    for (int i = 1; i < almacenes.length; i++) {
                        
                        if (almacenes[i].contains(":")) {
                                Lista<Producto> lista = new Lista();
                                String[] almacen = almacenes[i].split("\n");
                                for (int j = 2; j < almacen.length; j++) {
                                    String[] productos = almacen[j].split(",");
                                    Producto producto = new Producto(productos[0], Integer.parseInt(productos[1]));
                                    lista.insertFinal(producto);
                                }
                                String[] nombre = almacen[1].split(" ");
                                String letra = nombre[1].replace(":", "");
                                grafo.newVertice(letra, lista);
                            }
                    }
                // Rutas
                String[] rutas = split[1].split("\n");
                for (int i = 1; i < rutas.length; i++) {
                        String[] ruta = rutas[i].split(",");
                        grafo.newArista(ruta[0], ruta[1], Integer.parseInt(ruta[2])); 
                } 
            }
            return grafo;
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Error al leer archivo: "+ err);
            return null;
        }
    }
    //actualiza los datos en el archivo almacen.txt
    public void writeTxt(Grafo grafo) {
        Lista visitados = grafo.BFS(grafo, grafo.getVerts()[0].getName());
        String base_datos = "";
        
        if (grafo.getNumVerts() != 0) {
            base_datos += "Almacenes;";
            for (int i = 0; i < visitados.getSize(); i++) {
                base_datos += "\n" + "Almacen" + " " + grafo.getVerts()[i].getName() + ":";
                Lista productos = grafo.getVerts()[i].getProductos();
                Nodo<Producto> producto = productos.getHead();
                if(productos != null){
                    for (int j = 0; j < productos.getSize(); j++) {
                        base_datos += "\n" + producto.getData().getNombre() + "," + producto.getData().getCantidad();
                        producto = producto.getNext();
                    }
                }

            }
            base_datos += "\n" + "Rutas;";
            int[][] matAdy = grafo.getMatAd();
            for (int i = 0; i < visitados.getSize(); i++) {
                for (int j = 0; j < visitados.getSize(); j++) {
                    if (matAdy[i][j] != 0) {
                        //escribir la ruta
                        base_datos += "\n" + grafo.getVerts()[i].getName() + "," + grafo.getVerts()[j].getName() + "," + matAdy[i][j];
                    }
                }
            }
        }
        try {  
            PrintWriter pw = new PrintWriter("test\\almacenes.txt");
            pw.print(base_datos);
            pw.close();
            JOptionPane.showMessageDialog(null, "La informacion se ha guardado con éxito");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al guardar la informacion");
        }
    }
        
      
    
}
