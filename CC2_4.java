/*
CC2.4: You have two numbers represented by a linked list, where each node 
contains a single digit. The digits are stored in reverse order, such that the 
1’s digit is at the head of the list. Write a function that adds the two numbers 
and returns the sum as a linked list. EXAMPLE Input: (3 -> 1 -> 5) + 
(4 -> 9 -> 2) Output: 7 -> 0 -> 8 
*/

import java.util.*;

public class CC2_4 {
    public static void main (String[] args) {
        
        LinkedList List1 = new LinkedList();
        LinkedList List2 = new LinkedList();
        LinkedList outputList = new LinkedList();
      
        List1.add(3);
        List1.add(1);
        List1.add(5);
        
        List2.add(4);
        List2.add(9);
        List2.add(2);
        
        Object[] List1Arr = List1.toArray();
        Object[] List2Arr = List2.toArray();
             
        int List1Arr_sum = 0;
        int List2Arr_sum = 0;
        int total_sum = 0;
        
        for (int i = 0; i < List1Arr.length; i++){
            List1Arr_sum += (int)List1Arr[i] * Math.pow(10, i);
        }
        
        for (int i = 0; i < List2Arr.length; i++){
            List2Arr_sum += (int)List2Arr[i] * Math.pow(10, i);
        }
        
        total_sum = List1Arr_sum + List2Arr_sum;
        System.out.println(total_sum);
        
        while (total_sum > 0){
            outputList.add(total_sum % 10);
            total_sum /= 10;
        }
        System.out.println(outputList);

    }
}