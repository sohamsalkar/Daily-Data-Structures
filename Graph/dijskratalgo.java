
import java.util.Scanner;

class Edge {
    int src;
    int dest;
    int weight;

    public Edge() {
        src = dest = weight = 0;
    }
}

class dijskratalgo {
    int V, E;
    Edge edge[];
    long dist[];

    public dijskratalgo(int v, int e) {
        V = v;
        E = 2 * e;
        edge = new Edge[E];
        for (int i = 0; i < E; i++) {
            edge[i] = new Edge();
        }
        dist = new long[V];
    }

    void addedge(int i, int source, int destination, int weight) {
        edge[i].src = source;
        edge[i].dest = destination;
        edge[i].weight = weight;

    }

    void dijskrata(int source) {
        for (int i = 0; i < V; i++) {
            dist[i] = Long.MAX_VALUE;
        }
        dist[source] = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < E; j++) {
                int u = edge[j].src;
                int v = edge[j].dest;
                int weight = edge[j].weight;
                if (dist[u] != Long.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }

            }
        }

    }

    public static void main(String[] args) {
        int V, E;
        Scanner ob = new Scanner(System.in);
        // test cases t
        int t = ob.nextInt();
        while (t != 0) {
            V = ob.nextInt(); // V
            E = ob.nextInt(); // K
            // int q = ob.nextInt();
            dijskratalgo obj = new dijskratalgo(V + 1, E);
            for (int i = 0; i < 2 * E; i = i + 2) {
                int r = ob.nextInt(); // a
                int s = ob.nextInt(); // b
                int we = ob.nextInt(); // c
                obj.addedge(i, r, s, we);
                obj.addedge(i + 1, s, r, we);
            }
            int src = ob.nextInt();
            obj.dijskrata(src);
            int dest = ob.nextInt();
            Long shortestpath = obj.dist[dest];
            if (shortestpath < Long.MAX_VALUE)
                System.out.println(shortestpath);
            else
                System.out.println("NO");
            t--;
        }
    }
}
