import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations();
        int arr2[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        //int m = sc.nextInt();
        // int matrix[][] = new int[n][m];

        int n = 6;
        int m = 5;
        int matrix[][] =
                {   { 1, 2, 3, 4, 5 },
                    { 6, 7, 8, 9, 10 },
                    { 11,12,13,14,15 },
                    { 16,17,18,19,20 },
                    { 21,22,23,24,25 },
                    { 26,27,28,29,30 }
                };

        /*for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
           }
       }*/
       array.printMatrixSpiral(matrix,n,m);
    }
}