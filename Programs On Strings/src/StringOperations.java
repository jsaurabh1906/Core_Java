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
    public String reverseString3(String str){
        return "";
    }
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
        int n=26;
        if(str.length() < n) return false;
        
        return true;
    }
}
