package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListRepresentation {
    ArrayList<ArrayList<Integer>> graph;

    int edges;
    LinkedListRepresentation(int edges){
        this.edges=edges;
        this.graph=new ArrayList<>();
        for (int i=0;i<edges;i++){
            this.graph.add(new ArrayList<Integer>());
        }
    }

    void addEdgesDirected(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void addEdgesUndirected(int u, int v){
        graph.get(u).add(v);

    }


    void print(){
        for(int i=0;i<graph.size();i++) {
            System.out.print(i);
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print("->" + graph.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        LinkedListRepresentation linkedListRepresentation=new LinkedListRepresentation(5);
        linkedListRepresentation.addEdgesDirected(1,2);
        linkedListRepresentation.addEdgesDirected(2,3);
        linkedListRepresentation.addEdgesDirected(1,4);
        linkedListRepresentation.addEdgesDirected(2,4);
        linkedListRepresentation.addEdgesDirected(4,0);
        linkedListRepresentation.addEdgesDirected(3,0);



    }
}
