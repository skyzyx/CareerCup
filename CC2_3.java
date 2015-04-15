/*
CC2.3: Implement an algorithm to delete a node in the middle of a single linked 
list, given only access to that node. 

EXAMPLE Input: the node ‘c’ from the linked list a->b->c->d->e 
Result: nothing is returned, but the new linked list looks 
like a->b->d->e 
*/

import java.util.*;

public class CC2_3 {
    public static void main (String[] args) {
        LinkedList testList = new LinkedList();
        
        char element = 'a';
        while (testList.size() < 5){
            testList.add(element);
            element++;
        }
        
        System.out.println(testList);      
        removeMiddle(testList);        
        System.out.println(testList);
    }
    
    public static void removeMiddle(LinkedList myList) {
        if (myList == null) {
            System.out.println("List == null");
            return;
        }
        
        if (myList.size() == 0) {
            System.out.println("size == 0");
            return;
        }
        
        myList.remove(myList.get(myList.size() / 2));
    }
}