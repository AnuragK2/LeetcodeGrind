import java.util.*;

class Graph {
    private List<List<int[]>> adj;
    private int n;
    
    public Graph(int n, int[][] edges) {
        this.n=n;
        adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] it:edges) {
            addEdge(it);
        }
    }
    
    public void addEdge(int[] edge) {
        int from=edge[0];
        int to=edge[1];
        int cost=edge[2];
        adj.get(from).add(new int[]{to,cost});
    }
    
    public int shortestPath(int node1, int node2) {
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[node1]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{node1,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int d=curr[1];
            if(u==node2) {
                return dist[node2];
            }
            if(d>dist[u]) {
                continue;
            }
            for(int[] edge:adj.get(u)){
                int v=edge[0];
                int cost=edge[1];
                if(dist[u]+cost<dist[v]) {
                    dist[v]=dist[u]+cost;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        return -1;
    }
}


/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */