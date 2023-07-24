import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RecursionExamples recur =new RecursionExamples();
        String str ="QwertyKeyboard";


        //reverse a string
        //recur.reverseString(str, str.length()-1);

        //find first and last occurrence in a string
        //recur.findOccurence(str,0,'r');

        //check if array is sorted(strictly increasing) ex: 1,2,3,4,5
        /*  int arr[] ={1,2,3,4,5,10,9};
            System.out.println(recur.isSorted(arr,0));
        */
        //Move all 'x' to the end of rhr string
        // ex: axbxcdxxe =====> abcdexxxx
        String str2 = "axbxcdxxe";
        //recur.moveAllX(str2, 0, 0, "");

        // remove duplicates from string
        //recur.removeDuplicates(str2, 0, "");

        // print all subsequences of a string
        String str3 = "abc";
        //recur.subSequences(str3, 0, "");

        //print all unique Subsequences of a string
        String str4 = "aaa";
        HashSet<String> set = new HashSet<>();
        //recur.uniqueSubSequences(str4 , 0 , "",set );


        //print keypad combinations
        String str5 = "23";
        recur.printCombinations(str5,0,"");

        //Power of a number
        double x = 2.0000;
        int n =10;
        System.out.println(recur.myPow(x,n));;

    }
}