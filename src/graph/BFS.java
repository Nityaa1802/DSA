package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    int[][] adjacencyMatrix ;
    ArrayList<ArrayList<Integer>> adjacencyList;


    boolean[] visited;

    public void BFSbyMatrix( int start,boolean[] visited){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        visited[start]=true;

        while (!queue.isEmpty()){
            int currentNode=queue.poll();
            System.out.println(currentNode);
            for(int i=0;i<adjacencyMatrix.length;i++){
                if (!visited[i] && adjacencyMatrix[currentNode][i]!=0 ) {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }

    }


    public void BFSbyLinkedList(int start, boolean[] visited ){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        visited[start]=true;
        while (!queue.isEmpty()){
            int currentNode=queue.poll();
            System.out.println(currentNode);
            for(int i = 0; i< adjacencyList.get(currentNode).size(); i++){
                if(!visited[adjacencyList.get(currentNode).get(i)]){
                    queue.add(adjacencyList.get(currentNode).get(i));
                    visited[adjacencyList.get(currentNode).get(i)]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BFS bfs=new BFS();
        bfs.adjacencyMatrix=new int[][]
                {{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        bfs.BFSbyMatrix(0,new boolean[bfs.adjacencyMatrix.length]);


    }
}
