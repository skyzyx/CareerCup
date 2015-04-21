/*
CC1.8: Assume you have a method isSubstring which checks if one word is a 
substring of another. Given two strings, s1 and s2, write code to check if s2 is 
a rotation of s1 using only one call to isSubstring (i e , <waterbottle> is a 
rotation of <erbottlewat>).
*/

import java.util.*;

public class CC1_8 {
    public static boolean isRotated(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length())
            return false;

        return isSubstring(s1+s2, s2);
    }

    public static boolean isSubstring(String str, String subStr) {
        return str.contains(subStr);
        // return str.indexOf(subStr) != -1;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotated(args[0], args[1]));
    }
}