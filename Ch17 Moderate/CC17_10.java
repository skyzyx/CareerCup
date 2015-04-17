/*
CC19.10: Write a method to generate a random number between 1 and 7, given a 
method that generates a random number between 1 and 5 (i.e., implement rand7() 
using rand5()).
*/

public class CC19_10 {
    public static void main(String[] args) {
        System.out.println(rand7());
    }
    
    public static int rand7() {
        int rand25 = 5 * (rand5() - 1) + rand5(); // Generate 0 ~ 25 with equivalent probability
        return rand25 % 7 + 1;
    }
    
    public static int rand5() {
        return (int)(Math.random() * 5) + 1;
    }
}
