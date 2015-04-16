/*
CC19.1: Write a function to swap a number in place without temporary variables.
*/

public class CC19_1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        swap2(a, b);
    }
    
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
