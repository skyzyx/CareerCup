/*
CC19.3: Write an algorithm which computes the number of trailing zeros in n 
factorial.
*/

// https://github.com/jiegzh/LeetCode/tree/master/172.%20Factorial%20Trailing%20Zeroes

public class CC19_3 {
    public static void main(String[] args) {
        int n = 104;
        System.out.println(numOfZeros(n));
    }
    
    public static int numOfZeros(int num) {        
        int res = 0;
        while (num > 0) {
            res += num / 5;
            num /= 5;
        }
        return res;
    }
}