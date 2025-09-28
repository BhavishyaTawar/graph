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
        public static void bfs(ArrayList<edge> graph[]){
            Queue q=new LinkedList<>();
            q.add(0);
            boolean vis[]=new boolean[5];
            while(!q.isEmpty()){
                int curr=(int)q.remove();
                if(!vis[curr]){
                    System.out.print(curr+" ");
                    vis[curr]=true;
                    for(int i=0;i<graph[curr].size();i++){
                        edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }
        public static void main(String[] args) {
            ArrayList<edge> graph[] = new ArrayList[5];
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
            boolean vis[]=new boolean[5];
            bfs(graph);
            
        

            //graph[4].add(new edge(4,3,5));
        }
}