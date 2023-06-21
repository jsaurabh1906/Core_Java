import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringOperations {
    String removeSpaces(String str){
        char ch[]=str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            if(c != ' '){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    String removeSpaces2(String str){
        char ch[]=str.toCharArray();
        String newStr="";
        for (char c : ch){
            if(c != ' '){
                newStr += c;
            }
        }
        return newStr;
    }
    String removeSpaces3(String str){
        String newStr = str.replaceAll("\\s+","");
        return newStr;
    }
    public String reverseString(String str){
        char []ch = str.toCharArray();
        String newStr = "";
        for (int i = ch.length - 1; i >= 0; i-- ){
            newStr += ch[i];
        }
        return newStr;
    }
    public String reverseString2(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    /*public String reverseString3(String str){
        return "";
    }*/
    public String toMyLowerCase(String str){
        char []ch = str.toCharArray();
        String newStr="";
        for (char c: ch) {
            if(c >= 'A' && c <= 'Z'){
                newStr = newStr + ((char)(c + 32));
            }
            else {
                newStr += c;
            }
        }
        return newStr;
    }
    public String toMyUpperCase(String str){
        char []ch = str.toCharArray();
        String newStr="";
        for (char c: ch) {
            if(c >= 'a' && c <= 'z'){
                newStr = newStr + ((char)(c - 32));
            }
            else {
                newStr += c;
            }
        }
        return newStr;
    }
    public String sortASC(String str){
        char []ch = str.toCharArray();
        for (int i = 0; i < ch.length ; i++) {
            for (int j = i + 1 ; j < ch.length ; j++) {
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String newStr = new String(ch);
        return newStr;
    }
    public String sortDESC(String str){
        char []ch = str.toCharArray();
        for (int i = 0; i < ch.length ; i++) {
            for (int j = i + 1 ; j < ch.length ; j++) {
                if(ch[i] < ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String newStr = new String(ch);
        return newStr;
    }

    /*  An anagram of a string is another string that contains the same characters,
        only the order of characters can be different.
        For example, “abcd” and “dabc” are an anagram of each other.
    */
    public boolean areAnagrams(String str1, String str2){
        str1 = removeSpaces3(str1);
        str2 = removeSpaces3(str2);

        if(str1.length() != str2.length())
            return false;

        str1 = toMyLowerCase(str1);
        str2 = toMyLowerCase(str2);
        str1 = sortASC(str1);
        str2 = sortASC(str2);
        System.out.println("s1:"+str1);
        System.out.println("s2:"+str2);
        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

   /* A pangram is a sentence containing every letter in the English Alphabet.*/
    public boolean isPangram(String str){
        str = removeSpaces3(str);
        str = toMyLowerCase(str);
        int n=26;
        if(str.length() < n) return false;
        for (char c = 'a'; c <= 'z' ; c++) {
            if (str.indexOf(c) < 0)
                return false;
        }
        return true;
    }
    public void isPalindrome(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        String newStr = new String(ch);

        if(newStr.equalsIgnoreCase(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
    public boolean isPalindrome2(String str){
        String newStr = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left = 0;
        int right = newStr.length()-1;
        while (left < right){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public int countChars(String str){
        char ch[] = str.toCharArray();
        int charCount = 0;
        for (char c : ch) {
            if(c >= 'A' && c <= 'Z' ||                  //65-90
               c >= 'a' && c <= 'z' ||                  //97-122
               c >= '0' && c <= '9' &&                  //48-57
               c != ',' && c !='.'  && c != ' ')        // space= 32
            {charCount++;}
        }
        return charCount;
    }
    public int countChars2(String str){
        return str.length();
    }
    public int countChars3(String str){
        char ch[] = str.toCharArray();
        int charCount = 0;
        for (char c : ch) {
            charCount++;
        }
        return charCount;
    }
    //to find the sum of numbers in an ALPHA NUMERIC STRING
    public int sumOfNumbersInString(String str){
        char ch[] = str.toCharArray();
        int sumOfNums = 0;
        for ( char c : ch) {
            if (c >= '0' && c <= '9'){
                sumOfNums += (c - '0');
            }
        }
        return sumOfNums;
    }

    //remove duplicates in a string
    //1. using java 8 feature
    public void removeDuplicateChars(String str){
        StringBuilder sb= new StringBuilder();
        str.chars().distinct().forEach( c -> sb.append((char) c));
        System.out.println(sb);
    }
    //2. using indexOf
    public void removeDuplicateChars2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i+1 );  //search and return index of first occurence of ch from i+1 position if not returns -1
            //if index = -1 means ch is not repeated
            if(index == -1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    //3. using charArray
    public void removeDuplicateChars3(String str) {
        str = toMyLowerCase(str);
        StringBuilder sb =new StringBuilder();
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean repeated = false;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);

    }
    //4. using set interface
    public void removeDuplicateChars4(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        for (char c : charSet) {
            sb.append(c);
        }
        System.out.println(sb);
    }
    public void countCharsOccurance(String str){
        Map<Character, Integer> omap = new LinkedHashMap<>();
        char []ch = str.toCharArray();
        for(char c : ch){
            if(!omap.containsKey(c))
                omap.put(c,1);
            else{
                int count = omap.get(c);
                omap.put(c, count+1);
            }
        }
        System.out.println(omap);
        for(Map.Entry<Character, Integer> ele : omap.entrySet()){
            char key = ele.getKey();
            int value = ele.getValue();
            System.out.println(key +"...."+value);
        }
    }
    public void countCharsInEachWord(String str){
        for (int i = 0; i < str.length(); i++) {
            String newStr = "";
            while( i < str.length()  && str.charAt(i) != ' '){
                newStr += str.charAt(i);
                i++;
            }
            if (newStr.length() > 0){
                System.out.println(newStr+"..."+newStr.length());
            }
        }
    }
    public void countWords(String str){
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length()-1){
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
    //number of LOWERCASE, UPPERCASE,SPECIAL SYMBOLS, SPACES and DIGITS in a STRING
    public void countAllSeparately(String str){
        char []ch = str.toCharArray();
        int ucCount = 0;
        int lcCount = 0;
        int spacesCount = 0;
        int spSymbolCount = 0;
        int digitsCount = 0;
        for (char c: ch) {
            if (c >= 'A' && c <= 'Z') ucCount++ ;
            else if (c >= 'a' && c <= 'z') lcCount++ ;
            else if (c >= '0' && c <= '9') digitsCount++ ;
            else if (c == ' ') spacesCount++ ;
            else spSymbolCount++;
        }
        System.out.println("No. of upper-case characters: " + ucCount );
        System.out.println("No. of lower-case characters: " + lcCount );
        System.out.println("No. of digit characters: " + digitsCount);
        System.out.println("No. of spaces characters: " + spacesCount );
        System.out.println("No. of Special-symbol characters: " + spSymbolCount );
    }












}
