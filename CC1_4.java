/*
CC1.4: Write a method to decide if two strings are anagrams or not.
*/

import java.util.*;

public class CC1_4 {
    public static void main (String[] args){
        String A = "apple";
        String B = "leapp";
        System.out.println(isAnagrams(A, B));
    }
    
    public static boolean isAnagrams(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        
        if (A.length() != B.length()) {
            return false;
        }
        
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        
        Arrays.sort(arrA);
        Arrays.sort(arrB); // Then I also can do Arrays.equals(arrA, arrB).
        
        System.out.println(String.valueOf(arrA));
        System.out.println(String.valueOf(arrB));
        
        if (String.valueOf(arrA).equals(String.valueOf(arrB))) { // Do not write code like String.valueOf(arrA) == String.valueOf(arrB)
            return true;
        }
        return false;
    }
}

// http://www.programcreek.com/2014/03/create-java-string-by-double-quotes-vs-by-constructor/