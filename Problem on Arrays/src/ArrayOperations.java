public class ArrayOperations {
    public void printMatrixSpiral(int[][] matrix, int p, int q) {
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = p-1;
        int colStart = 0;
        int colEnd = q-1;


        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}

