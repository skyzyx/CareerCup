/*
CC5.6: Write a program to swap odd and even bits in an integer with as few 
instructions as possible. (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 
are swapped, etc). 
*/

public class CC5_6 {
    public static void main(String[] args) {
        System.out.println(swapOddEvenBits(10));
        System.out.println(swapOddEvenBits(5));
    }
    
    // Mask the odd bits (keep the odd bits and turn off all the even bits).
    // Mask the even bits (keep the even bits and turn off all the odd bits).
    // Then OR the two results, combine them together and output the final num.
    public static int swapOddEvenBits(int a) {
        return (((a & 0xAAAAAAAA) >> 1) | ((a & 0x55555555) << 1));
    }
}
