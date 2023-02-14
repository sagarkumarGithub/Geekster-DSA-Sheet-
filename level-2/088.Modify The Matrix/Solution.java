import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] mat = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        int[] R = new int[rows];
        int[] C = new int[cols];
    
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 1){
                    R[i] = 1;
                    C[j] = 1;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(R[i] == 1 || C[j] == 1){
                    mat[i][j] = 1;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
