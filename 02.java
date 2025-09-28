import java.util.*;
class GraphMain {
   static class edge {
        int src ,dest,wt;
        edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        }
        public static void bfs(ArrayList<edge> graph[],int v,boolean vis[]){
            System.out.println(v);
            vis[v]=true;
            for(int i=0;i<graph[v].size();i++){
                edge e=graph[v].get(i);
                if(!vis[e.dest]){
                    bfs(graph,e.dest,vis);
                }
            }
        }
        public static void main(String[] args) {
            ArrayList<edge> graph[] = new ArrayList[5];
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
                
            }   
            System.out.println("Hello, World!");
            graph[0].add(new edge(0,1,10));
            graph[1].add(new edge(1,0,10));
            graph[0].add(new edge(0,2,15));
            graph[1].add(new edge(1,3,12));
            graph[1].add(new edge(1,2,1));
            graph[2].add(new edge(2,4,10));
            graph[3].add(new edge(3,4,2));
            graph[1].add(new edge(1,2,1));
            //graph[4].add(new edge(4,3,5));
        }
}