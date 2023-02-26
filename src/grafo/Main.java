package grafo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Liz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Grafo matriz = new Grafo();
//        Vertice vertice1 = new Vertice("A");
//        Producto producto1 = new Producto("ram",3);
//        vertice1.getProductos().insertFinal(producto1);
//        matriz.newVertice(vertice1.getName(),vertice1.getProductos());
//        
//        Vertice vertice2 = new Vertice("B");
//        Producto producto2 = new Producto("pantalla",3);
//        vertice2.getProductos().insertFinal(producto2);
//        Producto producto3 = new Producto("pan",3);
//        vertice2.getProductos().insertFinal(producto3);
//        matriz.newVertice(vertice2.getName(),vertice2.getProductos());
//        
//        Vertice vertice3 = new Vertice("C");
//        matriz.newVertice(vertice3.getName(),vertice3.getProductos());
//        
//        Lista<Vertice> listafinal =matriz.BFS(matriz, "A");
//        System.out.println(listafinal.printProductosBFS());
//        
       
       
     
      
     String path = "test\\almacenes.txt";
        Lector l = new Lector();
        String txt = l.readTxt(path);
        System.out.println(txt);
        System.out.println("hola");
        Grafo grafo = l.loadGrafo(txt);
        grafo.printMatriz();
        
        //Lista<Vertice> listafinal =grafo.BFS(grafo, "A");
       // System.out.println(listafinal.printProductosBFS());
       // Dijkstra dijkstra = new Dijkstra(grafo, grafo.searchVertice("C")); 
       // dijkstra.caminoMinimos(); 
       // dijkstra.printCamino(grafo.searchVertice("E"));
        

    
    }
    
}
