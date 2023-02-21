package graph;
import java.util.ArrayList;

public class DFS {
    int[][] adjacencyMatrix;
    ArrayList<ArrayList<Integer>> adjacencyList;

    public void DFSbyMatrix(int start,boolean[] visited){
        System.out.print(start+" ");
        visited[start]=true;
        for(int i=0;i<adjacencyMatrix.length;i++){
            if(i!=start && adjacencyMatrix[start][i]!=0 && !visited[i]){
                DFSbyMatrix(i,visited);
            }
        }
    }

    public void DFSbyLinkedList(int start,boolean[] visited){
        System.out.println(start);
        visited[start]=true;
        for(int i = 0; i< adjacencyList.get(start).size(); i++){
            if(!visited[adjacencyList.get(start).get(i)]){
                DFSbyLinkedList(adjacencyList.get(start).get(i),visited);
            }
        }
    }


    public static void main(String[] args) {
        DFS dfs=new DFS();
        dfs.adjacencyMatrix=new int[][]
                {{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        dfs.DFSbyMatrix(3,new boolean[dfs.adjacencyMatrix.length]);

    }
}

