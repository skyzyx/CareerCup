/*
CC5.5: Write a function to determine the number of bits required to convert 
integer A to integer B. Input: 31, 14 Output: 2 
*/

public class CC5_5 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 15;
        System.out.println(bitSwapRequired(num1, num2));
    }

    public static int bitSwapRequired (int a, int b) {
        int count = 0;
        for (int c = a^b; c != 0; c = c >> 1){
            count += c & 1;
        }
        return count;
    }
    
}