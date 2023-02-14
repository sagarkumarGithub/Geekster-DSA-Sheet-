import java.util.*;

public class Solution {

    public static boolean isPalindrome(int[][] mat, int row){
        int i=0;
        int j=mat[0].length-1;

        while(i<j){
            if(mat[row][i] != mat[row][j]){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] mat = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        int count = 0;
        for(int row=0; row<m; row++){
            if(isPalindrome(mat,row)){
                count++;
            }
        }

        System.out.println(count);
    }
}
