import java.util.HashSet;

public class RecursionExamples {
    public static int first = -1;
    public static int last = -1;


    //reverse a string  O(n)
    public void reverseString(String str, int index){
        if (index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str,index-1);
    }

    //find first and last occurrence of an element in String
    public void findOccurence(String str, int index, char element){
        if (index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char ch = str.charAt(index);
        if (ch == element){
            if (first == -1){
                first = index;
            }
            else {
                last = index;
            }
        }

        findOccurence(str, index+1, element);
    }


    ////check if array is sorted(strictly increasing) ex: 1,2,3,4,5
    public boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index + 1]){
           return false;
        }
        return isSorted(arr, index + 1);
    }



    //Move all 'x' to the end of rhr string O(n+count) === O(n)
    // ex: axbxcdxxe =====> abcdexxxx
    public void moveAllX(String str, int index, int count, String newString){
        if (index == str.length()){
            for (int i = 0; i < count; i++) {
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(index);
        if(ch == 'x' ){
            count++;
            moveAllX(str,index + 1, count, newString);
        }
        else{
            newString += ch;
            moveAllX(str, index+1, count, newString);
        }

    }


    // remove duplicates from string O(n)
    public static boolean[] map = new boolean[26];
    public void removeDuplicates(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(index);
        if(map[ch - 'a']){
            removeDuplicates(str,index+1,newString);
        }
        else{
            newString += ch;
            map[ch - 'a'] = true;
            removeDuplicates(str,index+1,newString);
        }
    }

    // print all subsequences of a string  O(2^n)
    public void subSequences(String str, int index, String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(index);

        // to be added
        subSequences(str, index + 1, newString + ch);
        // not to be added
        subSequences(str, index + 1 , newString);
    }

    // print all unique subsequences
    public void uniqueSubSequences(String str, int index, String newString, HashSet<String> set){
        if (index == str.length()){
            if (set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char ch = str.charAt(index);

        // to be added
        uniqueSubSequences(str, index + 1, newString + ch, set);
        // not to be added
        uniqueSubSequences(str, index + 1 , newString, set);
    }


    //print keypad combinations

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno",
                                        "pqrs", "tu", "vwx", "yz"};
    public void printCombinations(String str, int index, String combination){  //combination = empty newString
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar= str.charAt(index);
        String mapping = keypad[currChar - '0'];   /// for "23"  ===> 2-0 == 2 i.e 'def'

        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, index + 1, combination+mapping.charAt(i));
        }
    }




}
