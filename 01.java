// A small, valid Java class for quick runtime testing.
// The class is intentionally package-private so the filename doesn't
// have to match the class name. Use this to verify your Java installation.
import java.util.*;
class Main {
static class edge {
    int src ,dest,wt;
    edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }   
}
	public static void main(String[] args) {
        ArrayList<edge> graph[] = new ArrayList[5];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
            
        }   
        graph[0].add(new edge(0,1,10));
        graph[0].add(new edge(0,2,15));
        graph[1].add(new edge(1,3,12));
        graph[2].add(new edge(2,4,10));
        graph[3].add(new edge(3,4,2));
        graph[1].add(new edge(1,2,1));
        //graph[4].add(new edge(4,3,5));
	}
}
