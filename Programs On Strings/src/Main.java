import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String str2 = sc.nextLine();
        StringOperations so = new StringOperations();

        //System.out.println(so.removeSpaces3(str1));
        //System.out.println(so.reverseString2(str1));
        //System.out.println(so.toMyLowerCase(str1));
        //System.out.println(so.toMyUpperCase(str1));
        //System.out.println(so.sortASC(str1));
        //System.out.println(so.sortDESC(str1));
        /*          //check Anagrams
        if(so.areAnagrams(str1,str2)){
            System.out.println("Strings are Anagrams");
        }
        else {
            System.out.println("Strings are Not Anagrams");
        }*/



    }
}