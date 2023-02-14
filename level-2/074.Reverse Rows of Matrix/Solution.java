import java.util.*;

public class Solution {

    public static void reverseRows(int[][] mat){
        for(int i=0; i<mat.length; i++){
            int j=0;
            int k=mat[i].length-1;

            while(j<k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;

                j++;
                k--;
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

        reverseRows(mat);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
