/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import grafo.Grafo;
import grafo.Lector;

/**
 *
 * @author Liz
 */
public class Global {
    private static Grafo grafo;

    /**
     * @return the grafo
     */
    public static Grafo getGrafo() {
        return grafo;
    }

    /**
     * @param aGrafo the grafo to set
     */
    public static void setGrafo(Grafo aGrafo) {
        grafo = aGrafo;
    }
}
