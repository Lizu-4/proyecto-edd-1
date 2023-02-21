/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

/**
 *
 * @author Liz
 */
public class Vertice {
    private String name;
    private Lista productos;
    private int numVertice;
    private boolean visitado;

    public Vertice(String name) {
        this.name = name;
        this.productos = new Lista<Producto>();
        this.numVertice = -1;
        this.visitado = false;
    }
    
        public Vertice(String name, Lista productos) {
        this.name = name;
        this.productos = productos;
        numVertice = -1;
        this.visitado = false;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the productos
     */
    public Lista getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(Lista productos) {
        this.productos = productos;
    }

    /**
     * @return the numVertice
     */
    public int getNumVertice() {
        return numVertice;
    }

    /**
     * @param numVertice the numVertice to set
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    /**
     * @return the visitado
     */
    public boolean isVisitado() {
        return visitado;
    }

    /**
     * @param visitado the visitado to set
     */
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    /**
     * @param n vertice to compare
     */
    public boolean equals(Vertice n) {
        return getName().equals(n.getName());
    }
    
     /**
     * @return caracteristicas del vertice
     */
    public String toString(){
        return this.getName() + " (" + this.getNumVertice() + ")";
    }

    
    

}
