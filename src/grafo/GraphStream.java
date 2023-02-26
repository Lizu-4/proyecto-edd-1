/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

/**
 *
 * @author Liz
 */
public class GraphStream {
    
    String styles = "node { stroke-mode: plain; fill-color: pink ;shape: circle;size: 30px;text-size:17; padding: 8px, 12px;} edge {padding: 9px, 14px; text-size:18; arrow-size: 5px, 5px;}";
     public Graph Graphic(Grafo grafo) { 
         Graph graph = new SingleGraph("Grafo", false, true);
         graph.setAttribute("ui.stylesheet", styles);
         for (int i = 0; i < grafo.getNumVerts(); i++) {
            graph.addNode(grafo.getVerts()[i].getName()).setAttribute("ui.label", "Almacen " + grafo.getVerts()[i].getName());
            graph.getNode(i).setAttribute("ui.style", "text-alignment:left;");
        }
         int aux = 0;
        for (int i = 0; i < grafo.getMatAd().length; i++) {
            for (int j = 0; j < grafo.getMatAd()[i].length; j++) {
                if (grafo.getMatAd()[i][j] != 0) {
                    graph.addEdge(grafo.getVerts()[i].getName() + grafo.getVerts()[j].getName(), graph.getNode(i), graph.getNode(j), true);
                    graph.getEdge(aux).setAttribute("ui.label", Integer.toString(grafo.getMatAd()[i][j]));
                    graph.getEdge(aux).setAttribute("ui.style", "text-alignment:center;");
                    aux++;
                }
            }

        }
         
         return graph;
     }
}
