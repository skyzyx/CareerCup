/*
CC9.5: Write a method to computer all permutations of a string of unique characters.
*/
import java.util.*;

public class CC9_5 {
    public static void main(String[] args) {
        String myStr = "abb";        
        System.out.println(findPermutation(myStr));
    }
    
    public static ArrayList<String> findPermutation(String s) {
        if (s == null) {
            return null;
        }
        
        ArrayList<String> resList = new ArrayList<String>();
        if (s.length() < 2) {
            resList.add(s);
            return resList;
        }
        
        char first = s.charAt(0);
        String remainder = s.substring(1);
        ArrayList<String> words = findPermutation(remainder);
        
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                if (!resList.contains(insertCharAtPosition(word, first, i))){
                    resList.add(insertCharAtPosition(word, first, i));
                }
            }
        }        
        return resList;
    }
    
    public static String insertCharAtPosition(String myStr, char myChar, int index) {
        String begin = myStr.substring(0, index);
        String end = myStr.substring(index);
        String resStr = begin + myChar + end;
        return resStr;
    }

}