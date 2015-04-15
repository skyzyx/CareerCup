/*
CC2.2: Implement an algorithm to find the nth to last element of a singly 
linked list.
*/

import java.util.*;

public class CC2_2 {
    public static void main (String[] args) {
        LinkedList myList = new LinkedList();
        int nth = 3;
        
        char element = 'A';
        while (myList.size() < 26){
            myList.add(element);
            element++;
        }
        
        System.out.println(myList);
        
        int totalSize = myList.size();        
        while (myList.size() > (totalSize - nth)){
            myList.removeFirst();
        }
        
        System.out.println(myList);        

    }
}