package hello.lectures.union_find.dynamic_connectivity;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    UF(int N){
        //initialize union-find data structure with N objects (0 to N – 1)
    }

    void union(int p, int q){
        //add connection between p and q
    }

    boolean connected(int p, int q){
        //are p and q in the same component?
        return false;
    }

    int find(int p){
        //component identifier for p (0 to N – 1)
        return 0;
    }

    int count(){
        //number of components
        return 0;
    }

    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)){
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
