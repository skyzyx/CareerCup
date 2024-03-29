/*
CC1.2: Write code to reverse a C-Style String (C-String means that <abcd> is 
represent as five characters, including the null character).
*/

public class CC1_2 {
    public static void main(String[] args) {
        String cStr = "abcde\0";
        System.out.println(cStr);
        System.out.println(cStr.length());
        System.out.println(reverseString3(cStr));
        System.out.println(reverseString3(cStr).length());
        if (reverseString3(cStr).charAt(0) == '\0') { // Do not write like reverseString.charAt(0) == null
            System.out.println("The first character is a null character");
        }
    }
    
    public static String reverseString(String myStr) { // Solution 1: create a new string        
        if (myStr == null || myStr.length() < 2)
            return myStr;

        String res = "";
        for (int i = myStr.length() - 1; i >= 0; i--) {
            res += myStr.charAt(i);
        }
        return res;
    }
    
    public static String reverseString2(String myStr) { // Solution 2: without extra space        
        if (myStr == null || myStr.length() < 2)
            return myStr;
        
        char[] myArr = myStr.toCharArray();   
        for (int i = 0; i < myStr.length() / 2; i++) {
            char temp = myArr[i];
            myArr[i] = myArr[myStr.length() - i -1];
            myArr[myStr.length() - i - 1] = temp;
        }        
        return String.valueOf(myArr); // Do not use Arrays.toString(myArr), dose not work // String.valueOf(Char[] data); String.valueOf(int data)
    }
    
    public static String reverseString3(String s){ // Recursion
        if (s == null || s.length() < 2)
            return s;
        
        String res = "";
        res += s.charAt(s.length() - 1) + reverseString3(s.substring(0, s.length() - 1));
        return res;
    }
}