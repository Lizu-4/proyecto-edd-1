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
        
      
    
}
