/*
CC19.7: You are given an array of integers (both positive and negative). Find 
the continuous sequence with the largest sum. Return the sum.

EXAMPLE
Input: {2, -8, 3, -2, 4, -10}
Output: 5 (i.e., {3, -2, 4}) 
*/

public class CC19_7 {
    public static void main(String[] args) {
        int[] testArr = {2, -8, 3, -2, 4, -10};
        System.out.println(findLargestSum(testArr));
        System.out.println(findLargestSum2(testArr));
    }
    
    public static Integer findLargestSum(int[] myArr) {
        if (myArr == null) {
            return null;
        }
        
        if (myArr.length == 1) {
            return myArr[0];
        }
        
        int maxSum = Integer.MIN_VALUE; // Or 1 >> 31
        int curSum = 0;
        for (int i = 0; i < myArr.length - 1; i++) {
            if (curSum < 0) {
                curSum = myArr[i];
            } else {
                curSum += myArr[i];
            }
            
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
        
    }
    
    public static int findLargestSum2(int[] myArr) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < myArr.length; i++) {
            curSum += myArr[i];
            if (curSum > maxSum) 
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }
}
