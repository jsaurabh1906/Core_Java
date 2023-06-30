import java.util.Scanner;

public class BitsManipulationDemo {
    public static void main(String args[]) {

        //Get Bit
    /*
        int n = 5; //0101
        int pos = 3;  // position starts from rhs with first pos as 0
        int bitMask = 1<<pos;


        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        }
        else {
            System.out.println("bit was one");
        }

    */
        //Set Bit
    /*
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;


        int newNumber = bitMask | n;
        System.out.println(newNumber);

    */

        // Clear bit to 0
    /*
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    */
        //Update bit

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
