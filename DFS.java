DFS of graph
import java.util.*;
class DFS {
    public static void dfsOfGraph(int I) {


        Stack < Integer > q = new Stack<>();


        q.add(I);
        vis[I] = true;


        while (!q.isEmpty()) {
            Integer node = q.pop();
            dfs.add(node);
            for(Integer it : adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.push(it);
                }
            }
        }
    }


    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    static ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
    static boolean vis[] = new boolean[9];
    static ArrayList < Integer > dfs = new ArrayList < > ();




    static void addEdge(int a, int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }


    public static void main(String args[]) {


       
        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList < > ());
        }
       
        addEdge(1,2);
        addEdge(2,3);
        addEdge(2,7);
        addEdge(3,5);
        addEdge(7,5);
        addEdge(4,6);
        addEdge(0,5);
        addEdge(0, 8);
        System.out.println(adj);
        for(int i=0;i<8;i++){
            if(!vis[i])
                dfsOfGraph(i);
        }
        printAns(dfs);
    }
}
