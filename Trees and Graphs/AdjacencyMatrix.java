package GayleLaakmann;

public class AdjacencyMatrix {
    public static void main(String[] args){
        int v = 5;
        int[][] matrix = new int[v][v];
        for(int i =0;i < v;i++){
            for(int j = 0;j < v;j++){
                matrix[i][j] = 0;
            }
        }
        addEdge(matrix,0,1);
        addEdge(matrix,0,4);
        addEdge(matrix,1,2);
        addEdge(matrix,1,3);
        addEdge(matrix,1,4);
        addEdge(matrix,2,3);
        addEdge(matrix,3,4);

        printGraph(matrix,v);
    }
    public static void addEdge(int[][] matrix,int x,int y){
        matrix[x][y] = 1;
        matrix[y][x] = 1;
    }
    public static void printGraph(int[][] matrix, int v){
        for(int i = 0;i < v;i++){
            for(int j = 0;j < v;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
