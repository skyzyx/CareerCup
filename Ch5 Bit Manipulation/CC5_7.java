/*
CC5.7: An array A[1…n] contains all the integers from 0 to n except for one 
number which is missing. In this problem, we cannot access an entire integer in 
A with a single operation. The elements of A are represented in binary, and the 
only operation we can use to access them is “fetch the jth bit of A[i]”, which 
takes constant time. Write code to find the missing integer. Can you do it in 
O(n) time? 
*/

import java.util.Arrays;

public class CC5_7 {
    public static void main(String[] args) {
    int[] myArr = {0, 1, 4, 3, 6, 2};
    System.out.println(findMissingElement(myArr));
    }
    
    public static int findMissingElement(int[] testArr) { 
        Arrays.sort(testArr);
        int index = 1; // start from 1, not 0, since we have testArr[index - 1]
        int element = 0;
        while (index < testArr.length){
            if ((testArr[index] - testArr[index - 1]) == 1){
                index++;
            } else {
                element = testArr[index] - 1;
                break;
            }
        }
        return element;
    }    
}