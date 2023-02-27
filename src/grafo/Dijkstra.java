/**
 *
 * @author Liz
 */
package grafo;

public class Dijkstra {
    private int[][] Pesos;
    private int[] ultimo;
    private int[] distancia;
    private boolean[] F;
    private int s, n; // vértice origen y número de vértices

    public Dijkstra(Grafo gp, int origen) {
        n = gp.getNumVerts();
        s = origen;
        Pesos = gp.matPeso();
        ultimo = new int[n];
        distancia = new int[n];
        F = new boolean[n];
    }

    public void caminoMinimos() {
        // valores iniciales
        for (int i = 0; i < n; i++) {
            F[i] = false;
            distancia[i] = Pesos[s][i];
            ultimo[i] = s;
        }
        F[s] = true;
        distancia[s] = 0;

        for (int i = 1; i < n; i++) {
            int v = minimo(); 

            F[v] = true;
            // actualiza distancia de vértices no marcados
            for (int w = 1; w < n; w++) {
                if (!F[w]) {
                    if ((distancia[v] + Pesos[v][w]) < distancia[w]) {
                        distancia[w] = distancia[v] + Pesos[v][w];
                        ultimo[w] = v;
                    }
                } 
            } 
            
        }
    }

    private int minimo() {
        int mx = 99999999;
        int v = 1;
        for (int j = 1; j < n; j++) {
            if (!F[j] && (distancia[j] <= mx)) {
                mx = distancia[j];
                v = j;
            }
        }
        return v;
    }
    
    public void printCaminoo(int v){
        int anterior = ultimo[v];
        if (v != s){
            printCaminoo(anterior); // vuelve al último del último

            System.out.print(" -> V" + v);
        }else{
          System.out.print("V" + s);
        }
    }
    
    public String getCamino(int v) {
        int anterior = ultimo[v];
        if (v != s) {
            return getCamino(anterior) + " -> V" + v;
        } else {
            return "V" + s;
        }
}
    
    

}
