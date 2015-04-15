/*
CC3.6: Write a program to sort a stack in ascending order. You should not make 
any assumptions about how the stack is implemented. The following are the only 
functions that should be used to write this program: push | pop | peek | 
isEmpty.
*/

import java.util.*;
import java.util.Random;

public class CC3_6 {
    public static void main(String[] args) {
        Random ran = new Random();
        Stack<Integer> myStack = new Stack<Integer>();
        for (int i = 0; i < 100; i++){
            myStack.push(ran.nextInt(1000));
        }
        System.out.println("Before sorting: " + myStack);
        System.out.println("After sorting: " + sortStack(myStack));
    }
    
    public static Stack<Integer> sortStack(Stack<Integer> ori) {
        if (ori == null)
            return null;

        Stack<Integer> res = new Stack<Integer>();
        while (!ori.isEmpty()) {
            int ele = ori.pop();
            while (!res.isEmpty() && ele > res.peek()) {
                ori.push(res.pop());
            }
            res.push(ele);
        }
        return res;
    }    
}

