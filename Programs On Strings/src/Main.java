import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.nextLine();
        //System.out.println("Enter the second String: ");
        //String str2 = sc.nextLine();
        StringOperations so = new StringOperations();

        //System.out.println(so.removeSpaces3(str1));
        //System.out.println(so.reverseString(str1));
        //System.out.println(so.reverseString2(str1));
        //System.out.println(so.toMyLowerCase(str1));
        //System.out.println(so.toMyUpperCase(str1));
        //System.out.println(so.sortASC(str1));
        //System.out.println(so.sortDESC(str1));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*          //check Anagrams
        if(so.areAnagrams(str1,str2)) System.out.println("Strings are Anagrams");
        else System.out.println("Strings are Not Anagrams");
            */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          /*       //check Pangrams
        if(so.isPangram(str1)) System.out.println("String is Pangram");
        else  System.out.println("String is Not Pangram");
        */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //so.isPalindrome(str1);

        /*  if(so.isPalindrome2(str1)) System.out.println("Palindrome");
            else System.out.println("not palindrome");
        */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println(so.countChars2(str1));
        //System.out.println(so.countChars3(str1));
        //System.out.println(so.countChars(str1));
        //System.out.println(so.sumOfNumbersInString(str1));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // remove duplicates
            //so.removeDuplicateChars(str1);
            //so.removeDuplicateChars2(str1);
            //so.removeDuplicateChars3(str1);
            //so.removeDuplicateChars4(str1);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //so.countCharsOccurance(str1);
        //so.countCharsInEachWord(str1);
        //so.countWords(str1);
        so.countAllSeparately(str1);
    }
}