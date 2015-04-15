/*
CC1.7: Write an algorithm such that if an element in an MxN matrix is 0, its 
entire row and column is set to 0.
*/

import java.util.*;

public class CC1_7 {
    public static void main (String[] args){
        int M = 3;
        int N = 3; 
        int k = 0;
        
        Vector rowVec = new Vector();
        Vector colVec = new Vector();
        
        int[][] myMatrix = new int[M][N];
        for (int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                myMatrix[i][j] = k;
                k++;
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                if (myMatrix[i][j] == 0){
                    if (!rowVec.contains(i)){
                        rowVec.addElement(i);
                    }
                    if (!colVec.contains(j)){
                        colVec.addElement(j);
                    }                    
                }
            }
        }
               
        Object[] rowArr = rowVec.toArray();
        Object[] colArr = colVec.toArray();
        
        for (int i = 0; i < rowArr.length; i++){
            int row = (int)rowArr[i]; // Cast object to integer
            for (int j = 0; j < N; j++){
                myMatrix[row][j] = 0;
            }
        }
        
        for (int i = 0; i < colArr.length; i++){
            int col = (int)colArr[i]; // Cast object to integer
            for (int j = 0; j < M; j++){
                myMatrix[j][col] = 0;
            }
        }
        
        System.out.println();
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}