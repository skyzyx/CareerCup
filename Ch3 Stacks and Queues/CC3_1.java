/*
CC3.1: Describe how you could use a single array to implement three stacks.
*/

public class CC3_1 {
    
    public static void main(String[] args) {
        int testStackNum_0 = 0;
        int testStackNum_1 = 1;
        int testStackNum_2 = 2;
        
        System.out.println(isFull(testStackNum_0));
        System.out.println(isEmpty(testStackNum_0));
        System.out.println(peek(testStackNum_0));        
        System.out.println(pop(testStackNum_0));
        
        for (int i = 0; i < stackSize; i++){ // Push 10 elements to stack
            push(testStackNum_0, i);
        }
   
        System.out.println(isFull(testStackNum_0));
        System.out.println(isEmpty(testStackNum_0));
        System.out.println(peek(testStackNum_0));
        
        System.out.print("stackNum_0: ");
        for (int i = 0; i < stackSize; i++){ // Print 10 elements in stack
            System.out.print(stackData[i] + " ");
        }
        System.out.println();
        push(testStackNum_0, 10); // Push an element to a full stack
        
        pop(testStackNum_0);
        System.out.println("After pop");
        System.out.print("stackNum_0: ");
        for (int i = 0; i < stackSize; i++){ // Print 10 elements in stack
            System.out.print(stackData[i] + " ");
        }
        System.out.println();
        System.out.println(peek(testStackNum_0));
        
        for (int i = 4; i < 8; i++){
            pop(testStackNum_0);
        }
        
        System.out.println("After pop");
        System.out.print("stackNum_0: ");
        for (int i = 0; i < stackSize; i++){ // Print 10 elements in stack
            System.out.print(stackData[i] + " ");
        }
        System.out.println();

        System.out.println(isFull(testStackNum_0));
        System.out.println(isEmpty(testStackNum_0));
        System.out.println(peek(testStackNum_0)); 
        
// The code above is testing the first stack: testStackNum_0 
        
        System.out.print("stackNum_1: ");
        for (int i = 0; i < stackSize; i++){            
            System.out.print(stackData[i + 10] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < stackSize; i++){ // Push 10 elements to stack
            push(testStackNum_1, i + 10);
        }

        System.out.println("After push");
        System.out.print("stackNum_1: ");
        for (int i = 0; i < stackSize; i++){            
            System.out.print(stackData[i + 10] + " ");
        }
        System.out.println();       

    }
    
    
    static int stackSize = 10;
    static Integer[] stackData = new Integer[stackSize * 3];
    static int[] stackPointer = {-1, -1, -1}; // Try without static 
    
    public static void push(int stackNum, int item) {
        if (!isFull(stackNum)){
            stackPointer[stackNum]++;
            stackData[stackPointer[stackNum] + stackSize * stackNum] = item;
        } else {
            System.out.println("The stack is already full");
        }
    }
    
    public static Integer pop(int stackNum) {
        if (!isEmpty(stackNum)){
            int item = stackData[stackPointer[stackNum] + stackSize * stackNum];
            stackData[stackPointer[stackNum] + stackSize * stackNum] =  null;
            stackPointer[stackNum]--;
            return item;
        }
        return null; // return null has to cooperate with Integer, not int  
    }
    
    public static boolean isEmpty(int stackNum) {
        if (stackPointer[stackNum] == -1)
            return true;
        return false;        
    }
    
    public static boolean isFull(int stackNum) {
        if (stackPointer[stackNum] == stackSize - 1)
            return true;
        return false;
    }
    
    public static Integer peek(int stackNum) {
        if (!isEmpty(stackNum))
            return stackData[stackPointer[stackNum] + stackSize * stackNum];
        return null;
    }
}