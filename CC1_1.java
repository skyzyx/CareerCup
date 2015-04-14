/*
CC1.1: Implement an algorithm to determine if a string has all unique 
characters. What if you can not use additional data structures?
*/

public class CC1_1 {
    public static void main(String[] args) {
        String testStr = "Saatring";
        System.out.println(isUnique(testStr));
    }
    
    public static boolean isUnique(String myStr) {
        if (myStr == null) 
            return false;
        
        if (myStr.length() < 2)
            return true;
        
        boolean[] flag = new boolean[256]; // The default value is false.
        for (int i = 0; i < myStr.length(); i++) {
            if (flag[myStr.charAt(i)] == true) {
                return false;
            } else {
                flag[myStr.charAt(i)] = true;
            }
        }
        return true;
    }
}