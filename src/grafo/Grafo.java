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
    private static int maxVerts = 10;
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
    //sirve para buscar un vertice(debes enviarle el nombre).retorna -1 si no lo encuentra
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
    //sirve para crear un vertice
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

    //sirve para crear una arista
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
    
    public int[][] matPeso() {
    int[][] matPeso = new int[numVerts][numVerts];
    for (int i = 0; i < numVerts; i++) {
        for (int j = 0; j < numVerts; j++) {
            if (matAd[i][j] != 0) {
                matPeso[i][j] = matAd[i][j];
            } else {
                matPeso[i][j] = 99999999;
            }
        }
    }
    return matPeso;
}
    //imprime el grafo
    public void printMatriz() {
        for (int[] fila : getMatAd()) {
            for (int j = 0; j < fila.length; j++) {
                System.out.print(" " + fila[j] + " ");
            }
            System.out.println("");
        }
    }
    //recorre el grafo en profundidad y retorna una lista
    public Lista DFS(Grafo grafo, String name) {
        Lista dfs = new Lista();
        int v = grafo.searchVertice(name);

        if (v < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
            return dfs;
        } else {
            grafo.verts[v].setVisitado(true);
            int u = grafo.getVerticeNoVisitado(v);
            if ((u != -1) && (!grafo.verts[u].isVisitado())) {
                DFS(grafo, (String) grafo.verts[u].getName());
            }

            for (int i = 0; i < grafo.numVerts; i++) {
                if (grafo.verts[i].isVisitado()) {
                    Vertice vertice = new Vertice(grafo.verts[i].getName(),grafo.verts[i].getProductos());
                    dfs.insertFinal(vertice);
                }

            }
            for (int i = 0; i < grafo.numVerts; i++) {
                if (!grafo.verts[i].isVisitado()) {
                    DFS(grafo, grafo.verts[i].getName());
                }
            }
            return dfs;
        }
    }
  //recorre el grafo en anchura y retorna una lista
    public Lista BFS (Grafo g,String name) {
        int password = 200;
        Lista listafinal = new Lista();
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
                Vertice vertice = new Vertice(g.verts[p].getName(),g.verts[p].getProductos());
                listafinal.insertFinal(vertice);
                for (int u = 0; u < g.getNumVerts(); u++) {
                    if (visitados[u] == password && g.verts[p] != null) {
                        visitados[u] = visitados[p] + 1;
                        cola.encolar(u);
                    }
                }
            }
        }
        return listafinal;
    }
    
    /**
     * @return the Vertice by index
     */
    
    public Vertice getVerticeByIndex(int index) {
        if (index >= 0 && index < numVerts) {
            return verts[index];
        } else {
            return null;
        }
}
    
        public int getVerticeNoVisitado(int v) {
        for (int j = 0; j < getNumVerts(); j++) {
            if ((matAd[v][j] != 0) && (!verts[j].isVisitado())) {
                return j;
            }
        }
        return -1;
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