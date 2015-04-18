/*
CC5.3: Given an integer, print the next smallest and next largest number that 
have the same number of 1 bits in their binary representation.
*/

/*
For the next largest, keep adding 1 to the number until find the number that 
has same number of 1 bits. For the next smallest, keep decreasing 1.
*/

public class CC5_3 {
    public static void main (String[] args){
        int data = 5;
        System.out.println(findNextSmallest(data));
        System.out.println(findNextLargest(data));
    }
    
    public static int findNextSmallest(int num){
        int result = num - 1;
        while (Integer.bitCount(result) != Integer.bitCount(num)){
            result--;
        }
        return result;
    }
    
    public static int findNextLargest(int num){
        int result = num + 1;
        while (Integer.bitCount(result) != Integer.bitCount(num)){
            result++;
        }
        return result;
    }
}