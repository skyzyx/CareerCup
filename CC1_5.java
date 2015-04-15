/*
CC1.5: Write a method to replace all spaces in a string with %20.
*/

public class CC1_5 {
    public static void main(String[] args) {
        String testStr = "app le";
        System.out.println(replaceSpace(testStr));
    }
    
    public static String replaceSpace(String myStr) {
        if (myStr == null) {
            return null;
        }
        
        if (myStr.length() == 0) {
            return myStr;
        }
        
        String resStr = "";
        for (int i  = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == ' ') {
                resStr += "%20"; // '%20' does not work
            } else {
                resStr += myStr.charAt(i);
            }
        }
        return resStr;
    }
}

