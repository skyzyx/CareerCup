/*
CC1.6: Given an image represented by an NxN matrix, where each pixel in the 
image is 4 bytes, write a method to rotate the image by 90 degrees.
Can you do this in place?
*/

/* 
        int n = matrix.length;
        for (int i = 0; i < n; i++) { // Transpose in-place
            for (int j = i + 1; j < n; j++) {                
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
*/

public class CC1_6 {
    public static void main (String[] args){        
        int N = 5; // Define NxN matrix
        
        int[][] myMatrix = new int[N][N]; // NxN matrix
        int[][] myMatrix_Transpose = new int[N][N];
        
        int k = 1;        
        for (int i=0; i < N; i++){ // Initialize the matrix
            for (int j=0; j < N; j++){
                myMatrix[i][j] = k;
                k++;
            }
        }
        
        for (int i=0; i < N; i++){ // Print the matrix
            for (int j = 0; j < N; j++){
                System.out.print(myMatrix[i][j] + "  ");
            }
            System.out.println(); // Comparing with System.out.print()
        }
        
        for (int i = 0; i < N; i++){ // Transpose the matrix
            for (int j = 0; j < N; j++){ // Transpose can not realize by swap element, a new matrix is necessary
                myMatrix_Transpose[i][j] = myMatrix[j][i]; // Can not transpose the matrix in place, that's why a new matrix is needed
            }
        }
        
        System.out.println();
        for (int i=0; i < N; i++){ // Print the matrix
            for (int j = 0; j < N; j++){
                System.out.print(myMatrix_Transpose[i][j] + " ");
            }
            System.out.println(); // Comparing with System.out.print()
        }
        
        for (int i = 0; i < N; i++){ // Reverse each row of matrix
            for (int j = 0; j < N/2; j++){ // j < N/2, not j < N
                int temp = myMatrix_Transpose[i][j];
                myMatrix_Transpose[i][j] = myMatrix_Transpose[i][N - j - 1];
                myMatrix_Transpose[i][N - j - 1] = temp;
            }
        }
        
        System.out.println();
        for (int i=0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(myMatrix_Transpose[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}

/*
Rotate by +90:
    Transpose
    Reverse each row

Rotate by -90:
    Transpose
    Reverse each column

Rotate by +180:
    Method 1: Rotate by +90 twice
    Method 2: Reverse each row and then reverse each column

Rotate by -180:
    Method 1: Rotate by -90 twice
    Method 2: Reverse each column and then reverse each row
    Method 3: Reverse by +180 as they are same
*/