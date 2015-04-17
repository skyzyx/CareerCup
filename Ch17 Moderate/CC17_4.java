/*
CC19.4: Write a method which finds the maximum of two numbers. You should not 
use if-else or any other comparison operator.
*/

public class CC19_4 {
    public static void main(String[] args) {
        int num1 = -1000;
        int num2 = -200;
        System.out.println(findMax(num1, num2));
        System.out.println(findMax(num1, num2));
    }
    
    public static int findMax(int A, int B) {
        int result = A - B;
        int sign = (result >> 31) & 1;
        return A - sign * result;
    }
    
    public static int findMax2(int A, int B) {
        int[] myArr = {A, B};
        int sign = (A - B) >> 31 & 1;
        return myArr[sign];
    }
}
