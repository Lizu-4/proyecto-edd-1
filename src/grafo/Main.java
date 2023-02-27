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
     String path = "test\\almacenes.txt";
        Lector l = new Lector();
        String txt = l.readTxt(path);
     Grafo grafo = l.loadGrafo(txt);
//        
   //  Lista<Vertice> listafinal =grafo.BFS(grafo, "A");
    // System.out.println(listafinal.printProductos());
//        
       

        Lista<Vertice> lista2 = grafo.DFS(grafo, "A");
        System.out.println(lista2.printProductos());


        

        //Lista<Vertice> listafinal =grafo.BFS(grafo, "A");
       // System.out.println(listafinal.printProductosBFS());
       // Dijkstra dijkstra = new Dijkstra(grafo, grafo.searchVertice("C")); 
       // dijkstra.caminoMinimos(); 
       // dijkstra.printCamino(grafo.searchVertice("E"));
        

    
    }
    
}
