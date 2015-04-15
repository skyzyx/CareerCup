/*
CC2.1: Write code to remove duplicates from an unsorted linked list. 
FOLLOW UP: How would you solve this problem if a temporary buffer is not 
allowed? 
*/

import java.util.*;

public class CC2_1 {
    
    public static void main (String[] args) {
        LinkedList inputList = new LinkedList();
        
        inputList.add("A");
        inputList.add("B");
        inputList.add("C");        
        inputList.addFirst("A");
        inputList.addLast("C");
        
        System.out.println("inputList: " + inputList);
        //System.out.println("outputList with temp buffer: " + 
                //removeDupwithTempBuffer(inputList));
        System.out.println("outputList without temp buffer: " + 
                removeDupwithoutTempBuffer(inputList));
        
        int data = 9;
        int res = data - '1';
        System.out.println(res);
        
    }
    
    public static LinkedList removeDupwithTempBuffer(LinkedList inputList){
        
        if (inputList == null){
            return null;
        }
        
        if (inputList.size() < 2){
            return inputList;
        }
        
        LinkedList outputList = new LinkedList();        
        while (inputList.size() > 0){
            if (!outputList.contains(inputList.getFirst())){
                outputList.add(inputList.getFirst());
            }
            inputList.removeFirst();
        }        
        return outputList;
    }
    
    public static LinkedList removeDupwithoutTempBuffer(LinkedList inputList){
        
        if (inputList == null){
            return null;
        }
        
        if (inputList.size() < 2){
            return inputList;
        }
        
        int cur = 0;
        while (cur < inputList.size()){
            while (inputList.indexOf(inputList.get(cur)) != 
                    inputList.lastIndexOf(inputList.get(cur))){
                inputList.remove(inputList.lastIndexOf(inputList.get(cur)));
            }
            cur++;
        }
        return inputList;
    }
 
}