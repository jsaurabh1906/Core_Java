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

}
