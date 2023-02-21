package graph;
public class MatrixRepresentation {
    int[][] graphMatrix;
    int edges;

    MatrixRepresentation(int edges){
        this.edges=edges;
        graphMatrix=new int[edges][edges];
    }

    public void addEdgeUndirected(int u,int v){
        graphMatrix[u][v]=1;
        graphMatrix[v][u]=1;
    }
    public void addEdgeDirected(int u,int v){
        graphMatrix[u][v]=1;
    }

    public void addEdgeWeighted(int u, int v, int weight){
        graphMatrix[u][v]=weight;
        graphMatrix[v][u]=weight;
    }

    public void printEdge(){
        for (int[] matrix : graphMatrix) {
            for (int j = 0; j < graphMatrix[0].length; j++) {
                System.out.print(matrix[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        MatrixRepresentation matrixRepresentation=new MatrixRepresentation(5);
        matrixRepresentation.addEdgeDirected(0,1);
        matrixRepresentation.addEdgeDirected(1,2);
        matrixRepresentation.addEdgeDirected(1,3);
        matrixRepresentation.addEdgeDirected(2,4);
        matrixRepresentation.addEdgeDirected(4,3);
        matrixRepresentation.addEdgeDirected(3,0);
        matrixRepresentation.printEdge();
    }
}
