/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

/**
 *
 * @author Kevin
 */
public class Arista {
    private Nodo<Vertice> vertice1;
    private Nodo<Vertice> vertice2;
    private int peso;

    public Arista(Nodo<Vertice> vertice1, Nodo<Vertice> vertice2, int peso) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.peso = peso;
    }

    /**
     * @return the vertice1
     */
    public Nodo<Vertice> getVertice1() {
        return vertice1;
    }

    /**
     * @param vertice1 the vertice1 to set
     */
    public void setVertice1(Nodo<Vertice> vertice1) {
        this.vertice1 = vertice1;
    }

    /**
     * @return the vertice2
     */
    public Nodo<Vertice> getVertice2() {
        return vertice2;
    }

    /**
     * @param vertice2 the vertice2 to set
     */
    public void setVertice2(Nodo<Vertice> vertice2) {
        this.vertice2 = vertice2;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    

}
