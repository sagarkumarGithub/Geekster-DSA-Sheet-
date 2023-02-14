import java.util.*;

public class Solution {

    public static void reverse(int[][] mat, int i, int j, int row){
        while(i<j){
            int temp = mat[row][i];
            mat[row][i] = mat[row][j];
            mat[row][j] = temp;

            i++;
            j--;
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

        int k = scn.nextInt();

        for(int row=0; row<n; row++){
            reverse(mat,0,k-1,row);
            reverse(mat,k,n-1,row);
            reverse(mat,0,n-1,row);
        }

        for(int i=0;  i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
