import java.util.*;

public class Solution {

    public static void transposeOfMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        transposeOfMatrix(mat);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
