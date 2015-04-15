/*
CC1.3: Design an algorithm and write code to remove the duplicate characters in 
a string without using any additional buffer.
*/

import java.util.*;

public class CC1_3 {    
    public static void main (String args[]){
        String test1 = "cccbbbbdddAAAAddde2222fg_hij_";
        String test2 = "";
        String test3 = "AAAAbbcc";
        System.out.println("test1: " + removeDup2(test1));
        System.out.println("test2: " + removeDup(test2));
        System.out.println("test3: " + removeDup(test3));
    }
    
    public static String removeDup(String s){
        if (s == null || s.length() < 2)
            return s;
        
        char[] character = s.toCharArray();
        boolean[] flag = new boolean[256];
        int tail = 0;
        int cur = 0;
        
        while (cur < s.length()){
            if (!flag[character[cur]]){
                flag[character[cur]] = true;
                character[tail] = character[cur];
                cur++;
                tail++;
            } else {
                cur++;
            }
        }     
        return new String(character, 0, tail);        
    }
    
    public static String removeDup2(String s) { // This is a WRONG implementation.
        if (s == null || s.length() < 2)
            return s;
        
        String result = "";
        // LinkedHashSet can guarteen the order of output equals to the order of insertion.
        HashSet mySet = new HashSet(); // If using HashSet, we can NOT guarteen the order of output is the same as input.
        for (int i = 0; i < s.length(); i++) {
            mySet.add(s.charAt(i));
        }
        
        Iterator itr = mySet.iterator();
        while (itr.hasNext()) {
            result += itr.next();
        }
        return result; // Get string like: Abcdefghij_
        
        // mySet.toString() will return String like this: [A, b, c, d, e, f, g, h, i, j, _]
    }
}