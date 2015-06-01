import java.util.*;

public class DirectedGraph {

    private int numV;
    private boolean[][] adjMatrix;

    public DirectedGraph(int numV) {
        this.numV = numV;
        adjMatrix = new boolean[numV][numV];
        for (int i=0; i < numV; i++)
            for (int j=0; j < numV; j++)
                adjMatrix[i][j] = false;
    }

    public void addEdge(int v1, int v2) {
        adjMatrix[v1][v2] = true;
    }


    public void depthFirst(int v) {
        boolean[] visited = new boolean[numV];
        for (int i=0; i < numV; i++)
            visited[i] = false;
        depthFirst(v,visited);
    }
    
    private void depthFirst(int v, boolean[] visited) {
        
        if (visited[v])
            return;
        
        visited[v] = true;
        System.out.println("Visited " + v);
        // for each node j that vertex v connects to:
        for (int j=0; j < numV; j++)
            if (adjMatrix[v][j])
                depthFirst(j,visited);
    }
    

    public void breadthFirst(int v) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        boolean[] visited = new boolean[numV];
        
        for (int i=0; i < visited.length; i++)
            visited[i] = false;
        
        visited[v] = true;
        System.out.println("Visited " + v);
        queue.offer(v);
        
        while (queue.peek() != null) {
            
            int cur = queue.remove();

            // for each node j that vertex cur corrects to:
            for (int j=0; j < numV; j++)
                if (adjMatrix[cur][j]) {
                    
                    if (!visited[j]) {
                        visited[j] = true;
                        System.out.println("Visited " + j);
                        queue.offer(j);
                    }
                }
        }
    }
    

    public void shortestPath(int startV, int endV) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        int[] d = new int[numV];
        int[] p = new int[numV];
        
        for (int i=0; i < p.length; i++)
            p[i]=-1;
        
        d[startV] = 0;
        boolean done = false;
        queue.offer(startV);

        while (queue.peek() != null && !done) {
            
            int cur = queue.remove();

            // for each node i that vertex cur connects to:
            for (int i=0; i < numV; i++)
                if (adjMatrix[cur][i]) {
                    
                    if (p[i] == -1) {
                        d[i] =  d[cur] + 1;
                        p[i] =  cur;
                        queue.offer(i);
                    }
                    if  (i == endV)
                        done = true;
                }

        }

        int cur = endV;
        while (cur != -1) {
            System.out.println(cur);
            cur = p[cur];
        }

        System.out.println("Path length = " + d[endV]);
    }
    


    

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(10);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,4);
        g.addEdge(1,5);
        g.addEdge(4,7);
        g.addEdge(3,8);
        g.addEdge(3,9);
        g.addEdge(9,7);

        System.out.println("Depth-first:");
        g.depthFirst(0);
        System.out.println();
        System.out.println("Breadth-first:");
        g.breadthFirst(0);

        g.shortestPath(0,7);
    }
    

        
}

    
