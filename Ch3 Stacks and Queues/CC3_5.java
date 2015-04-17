/*
CC3.5: Implement a MyQueue class which implements a queue using two stacks.
*/

import java.util.*;

public class CC3_5 { // CC3_5 should be MyQueue
    public static void main(String[] args) {
        CC3_5 myQ = new CC3_5();
        Random ran = new Random();
        for (int i = 0; i < 30; i++){
            int x = ran.nextInt(100);
            System.out.print(x + ", ");
            myQ.enqueue(x);
        }
        System.out.println();


        System.out.println("After dequeue");
        for (int i = 0; i < 30; i++)
            System.out.print(myQ.dequeue() + ", ");
        System.out.println();
    }
    
    static Stack s1 = new Stack();
    static Stack s2 = new Stack();
    
    public static void enqueue(Object element) {
        s1.push(element);
    }
    
    public static Object dequeue() {
        if (s1.isEmpty()){
            return null;
        } else {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            Object item = s2.pop();
            
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return item;
        }
    }
    

}