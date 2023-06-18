public class Patterns {
    /*
            *
            * *
            * * *
            * * * *
    */
    //right-angled Triangle
    public void rightAngledTrianglePattern(int num){
        for (int row=1; row<=num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        /*
                    *
                  * *
                * * *
              * * * *
         */
    public void mirrorRightAngledTrianglePattern(int num){
        for (int row = 1; row <= num; row++){
            int spaces = num-row;
            for (int s = 1; s <= spaces ; s++){
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
        * * * *
        * * *
        * *
        *

    */
    public void invertedRightAngledTriangle(int num){
        for (int row = 1; row <= num; row++){

            for (int col = 1; col <= num-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
            * * * *
              * * *
                * *
                  *

     */
    public void MirrorInvertedRightAngledTriangle(int num){
        for (int row = 1; row <= num; row++){
           // int spaces = row;
            for (int s = 1; s < row ; s++){
                System.out.print("  ");
            }
            for (int col = 1; col <= num-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
                                   *
                                  * *
                                 * * *
                                * * * *
*/

    public void equilateralTrianglePattern(int num){
        for (int row = 1; row <= num; row++){
            int spaces= num-row;
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
               * * * *
                * * *
                 * *
                  *
    */
    public void invertedEquilateralTrianglePattern(int num){

        for (int row = 1; row <= num; row++){
            int spaces= num-row;
            for (int s = num; s > spaces; s--){
                System.out.print(" ");
            }
            for(int col = num; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void filledBox(int num){
        for(int row= 1 ; row <= num; row++){
            for(int col = 1; col <= num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void hollowBox(int num){
        for(int row= 1 ; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row == 1 || col ==1  || row == num || col == num )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void hollowBoxWithCross(int num){
        for(int row= 1 ; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(row == 1 || col ==1  || row == num || col == num || row == col || row+col == num+1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void cross(int num){
        for(int row= 1 ; row <= num; row++){
            for(int col = 1; col <= num; col++){
                if(  row == col || row+col == num+1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void diamondStarPattern(int num){
        for(int row = 1; row <= 2 * num -1; row++){
            int cols=  row > num ? (2 * num - row) : (row);
            int spaces = num - cols;

            for(int s=1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void hollowDiamondStarPattern(int num){
        for (int row = 1; row <= 2 * num -1; row++){
            int cols=  row > num ? (2 * num - row) : (row);
            int  spaces = num - cols;

            for(int s=1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){

               if(col  == 1 || col == cols) {
                   System.out.print("* ");}
               else{
                   System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    /*
        1
        1 2
        1 2 3
        1 2 3 4
    */
    public void numberTrianglePattern(int num){
        for (int row = 1; row <= num; row++){
            int k=1;
            for (int col=1; col <= row; col++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

    */
    public void numberTrianglePattern2(int num){
        int k=1;
        for (int row = 1; row <= num; row++){

            for (int col=1; col <= row; col++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
   /*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

   */
   public void numberDiamondPattern(int num) {
       for (int row = 1; row <= num; row++) {
           int spaces = num - row;

           for (int s = 1; s <= spaces; s++) {
               System.out.print(" ");
           }
           for (int col = 1; col <= row; col++) {
               System.out.print(col + " ");
           }
           System.out.println();
       }

       for (int row = num - 1; row >= 1; row--) {
           int spaces = num - row;

           for (int s = 1; s <= spaces; s++) {
               System.out.print(" ");
           }
           for (int col = 1; col <= row; col++) {
               System.out.print(col + " ");
           }
           System.out.println();
       }
   }


   /*
    						1
				           121
                          12321
                         1234321
                          12321
                           121
                            1


   */
   public void numberDiamondPattern2(int num){
       int col= 0;
       for(int row = 1; row <= num; row++){
           int spaces=num-row;

           for(int s = 1; s <= spaces; s++){
               System.out.print(" ");
           }

           col++;           //col= 1   11   111   1111
           System.out.println(col*col);
           col=col*10;              // col= 10   110  1110  11110
       }
       col=col/10;
       for(int row = num-1; row >= 1; row--){
           int spaces= num-row;
           for(int s = 1; s <= spaces; s++){
               System.out.print(" ");
           }
           col=col/10; // 1111
           System.out.println(col*col);

       }
   }
   /*
            *           //1   for row1
           ***          //3   for row2
          *****         //5    for row 3
         *******        //7    for row 4
        *********       //9     for row 5

   */
    public void printTriangle(int n) {
        for(int row = 1; row <= n; row ++){
            int spaces = n - row;
            int cols = 2 * row - 1 ;
            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
                *********
                 *******
                  *****
                   ***
                    *

    */
    void printInvertedTriangle(int n) {
        for(int row = 1; row <= n; row ++){
            int spaces = row - 1;
            int cols =   2  * (n - row) + 1  ;
            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
    */
    void binaryNumberTriangle(int n) {
        for(int row = 1 ; row <= n ; row++){

            for(int col = 1; col <= row; col++){
                if((row + col) % 2 == 0){
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    /*
            1                 1
            1 2             2 1
            1 2 3         3 2 1
            1 2 3 4     4 3 2 1
            1 2 3 4 5 5 4 3 2 1

    */
    void mPattern(int n) {

        for(int row = 1; row <= n; row++){
            int k = 1;
            for(int col = 1; col <= row; col++){
                System.out.print(k +" ");
                k++;
            }
            int spaces = 2 * (n -  row);
            for(int s = 1; s <= spaces; s++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                k--;
                System.out.print(k +" ");

            }
            System.out.println();
        }
    }
    void charTriangle(int n) {
        for(int row = 1; row <= n; row++){
            char ch = 'A';
            for(int col = 1; col <= row; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    /*
        ABCDE
        ABCD
        ABC
        AB
        A
    */
    void invertedCharTriangle(int n) {
        for(int row = 1; row <= n; row++){
            char ch = 'A';
            int cols = n - row + 1;
            for(int col = 1; col <= cols; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    /*
        A
        BB
        CCC
        DDDD
        EEEEE
    */
    void charTrianglePattern(int n) {
        char ch = 'A';
        for(int row = 1; row <= n; row++){

            for(int col = 1; col <= row; col++){
                System.out.print(ch);

            }
            ch++;
            System.out.println();
        }
    }
    /*
            A
           ABA
          ABCBA
         ABCDCBA
    */
    void charEquiTriangle(int n) {
        for(int row = 1; row <= n; row++){
            char ch = 'A';
            int spaces = n - row;
            int cols = 2 * row -1;
            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){
                System.out.print(ch);
                if(col >= row)
                    ch--;
                else
                    ch++;
            }
            ch++;
            System.out.println();
        }
    }

    /*
            E
            E D
            E D C
            E D C B
            E D C B A
    */
    void printCharTriangle(int n) {
        for(int row = 1; row <= n; row++){
            char ch = (char) (n+'A'-1);
            for(int col = 1; col <= row; col++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }

    /*
                     **********
                     ****  ****
                     ***    ***
                     **      **
                     *        *
                     *        *
                     **      **
                     ***    ***
                     ****  ****
                     **********
    */
    void printTrianglePattern2(int n) {
        int spaces  = 0;
        for(int row = 1; row <= 2 * n; row++){

            int cols = row <= n ? n - row +1 : row-n ;
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }

            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");

            }
            spaces= row < n ? spaces+2 : (row == n ? spaces : spaces-2);
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
                 *        *
                 **      **
                 ***    ***
                 ****  ****
                 **********
                 ****  ****
                 ***    ***
                 **      **
                 *        *
    */
    void printStarPattern(int n) {
        for(int row = 1; row <= 2 * n - 1 ; row++){

            int cols = row <= n ? row : 2*n-row   ;
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }
            int spaces = row <= n ? 2 * (n - row) : 2 * (row - n);

            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");

            }
            for(int col = 1; col <= cols; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
