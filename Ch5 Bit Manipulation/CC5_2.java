/*
CC5.2: Given a (decimal - e.g. 3.72) number that is passed in as a string, 
print the binary representation.If the number can not be represented accurately 
in binary, print “ERROR”.
*/

import java.util.*;

public class CC5_2 {
    public static void main (String[] args){
        long num = 13;
        System.out.println(Long.toBinaryString(num));
        
        String decimal = "3.72";
        long decimalToLong = Long.parseLong(decimal);
    }
}