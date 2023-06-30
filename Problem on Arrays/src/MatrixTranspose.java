import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();


        int matrix[][] = new int[n][m];
        //input
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //print given matrix
        System.out.println("The given matrix is:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<n ;j++) {
            for(int i=0; i<m; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
