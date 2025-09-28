import java.util.*;
class dfs {
   static class edge {
        int src ,dest,wt;
        edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        }
        public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){
            System.out.print(curr+" ");
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    dfs(graph,e.dest,vis);
                }
            }
         
        }
        public static void main(String[] args) {
            ArrayList<edge> graph[] = new ArrayList[7];
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
                
            }   
          graph[0].add(new edge(0,1,1));
            graph[0].add(new edge(0,2,1));
            graph[1].add(new edge(1,0,1));
            graph[1].add(new edge(1,3,1));
            graph[2].add(new edge(2,0,1));
            graph[2].add(new edge(2,4,1));
            graph[3].add(new edge(3,4,1));
            graph[3].add(new edge(3,1,1));
            graph[4].add(new edge(4,3,1));
            graph[4].add(new edge(4,2,1));
            graph[4].add(new edge(4,5,1));
            graph[5].add(new edge(5,4,1));
            graph[5].add(new edge(5,6,1));
            graph[5].add(new edge(5,3,1));
            graph[3].add(new edge(3,5,1));
            graph[6].add(new edge(6,5,1));
            boolean vis[]=new boolean[7];
            dfs(graph,0,vis);
            //graph[4].add(new edge(4,3,5));
        }
}