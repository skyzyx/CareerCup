/*
CC1.8: Assume you have a method isSubstring which checks if one word is a 
substring of another Given two strings, s1 and s2, write code to check if s2 is 
a rotation of s1 using only one call to isSubstring (i e , <waterbottle> is a 
rotation of <erbottlewat>).
*/

import java.util.*;

public class CC1_8 {
    public static void main (String[] args){
        String test1 = "waterbottle";
        String test2 = "erbottlewat";
        String test2Out = "";
        int temp = 0;
        
        for (int i = 0; i < test2.length(); i++){
            if (test2.charAt(i) == test1.charAt(0)){
                temp = i;
            }
        }
        
        for (int i = temp; i < test2.length(); i++){
            test2Out += test2.charAt(i);
        }
        
        for (int i = 0; i < temp; i++){
            test2Out += test2.charAt(i);
        }
        
        if (test1.length() != test2.length()){
            System.out.println("They have different length.");
        } else {
            if (test1.compareTo(test2Out) != 0){
                System.out.println("They are different.");
            } else {
                System.out.println("They are the same.");
            }
        }
    }
}