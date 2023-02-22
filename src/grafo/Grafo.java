/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class Grafo {
    
    private int numVerts;
    private static int maxVerts = 20;
    private Vertice [] verts;
    private int[][] matAd;
    
    public Grafo(){
        this(maxVerts);
    }

    public Grafo(int max) {
        this.matAd = new int [max][max];
        this.verts = new Vertice[max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; i < max; i++) {
                this.matAd[i][j] = 0;
            }
        }
        this.numVerts = 0;
    }

    public int searchVertice(String nombre){
        Vertice vertice = new Vertice(nombre);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.getNumVerts()) && !encontrado;) {
            encontrado = verts[i].equals(vertice);

            if (!encontrado) {
                i++;
            }
        }
        return (i < getNumVerts()) ? i : -1;
    }

    public void newVertice(String nombre, Lista productos) {
        boolean esta = searchVertice(nombre) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nombre, productos);
            v.setNumVertice(getNumVerts());
            verts[numVerts++] = v;

        } else {
            JOptionPane.showMessageDialog(null, "El vertice ya existe");
        }
    }


    public void newArista(String a, String b, int peso) {
        int va,vb;
        va  = searchVertice(a);
        vb = searchVertice(b);
        if (va  < 0 || vb < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
        } else {
            this.matAd[va][vb] = peso;
        }

    }
    
    public boolean sonAdyacentes(String a, String b) {
        int va, vb;
        va  = searchVertice(a);
        vb = searchVertice(b);
        if (va  < 0 || vb < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
            return false;
        } else {
            return this.getMatAd()[va][vb] != 0;
        }
    }
    
    public void printMatriz() {
        for (int[] fila : getMatAd()) {
            for (int j = 0; j < fila.length; j++) {
                System.out.print(" " + fila[j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void BFS (Grafo g,String name) {
        int password = 200;
        int[] visitados;
        int verticePartida = g.searchVertice(name);
        if (verticePartida < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
        } else {
            Cola cola = new Cola();
            visitados = new int[g.getNumVerts()];
            for (int i = 0; i < g.getNumVerts(); i++) {
                visitados[i] = password;
            }
            visitados[verticePartida] = 0;
            cola.encolar(verticePartida);
            while (!cola.isEmpty()) {
                Integer cp = (Integer) (cola.despachar()).getData();
                int p = cp;
                System.out.println("Almacen " + g.verts[p].getName());
                Nodo<Producto> aux = g.verts[p].getProductos().getHead();
                for (int i = 0; i < g.verts[p].getProductos().getSize(); i++) {
                    System.out.println("Producto: " + aux.getData().getNombre() + "Cantidad: " + aux.getData().getCantidad());
                    aux = aux.getNext();;
                }
                for (int u = 0; u < g.getNumVerts(); u++) {
                    if (visitados[u] == password && g.verts[p] != null) {
                        visitados[u] = visitados[p] + 1;
                        cola.encolar(u);
                    }
                }
            }
        }
    }
    
    /**
     * @return the numVerts
     */
    public int getNumVerts() {
        return numVerts;
    }

    /**
     * @param numVerts the numVerts to set
     */
    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    /**
     * @return the maxVerts
     */
    public static int getMaxVerts() {
        return maxVerts;
    }

    /**
     * @param aMaxVerts the maxVerts to set
     */
    public static void setMaxVerts(int aMaxVerts) {
        maxVerts = aMaxVerts;
    }

    /**
     * @return the verts
     */
    public Vertice[] getVerts() {
        return verts;
    }

    /**
     * @param verts the verts to set
     */
    public void setVerts(Vertice[] verts) {
        this.verts = verts;
    }

    /**
     * @return the matAd
     */
    public int[][] getMatAd() {
        return matAd;
    }

    /**
     * @param matAd the matAd to set
     */
    public void setMatAd(int[][] matAd) {
        this.matAd = matAd;
    }
    
    
    
}