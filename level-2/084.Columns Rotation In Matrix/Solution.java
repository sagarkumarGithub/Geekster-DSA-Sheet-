import java.util.*;

public class Solution {

    public static boolean isColumnRotation(int[][] mat){
        String s = "";
        for(int row=0; row<mat[0].length; row++){
            s += mat[row][0];
        }

        s = s + s;
        for(int col=0; col<mat[0].length; col++){
            String curr = "";
            for(int row=0; row<mat.length; row++){
                curr += mat[row][col];
            }

            if(s.indexOf(curr) == -1){
                return false;
            }

        }
        return true;
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

        boolean ans = isColumnRotation(mat);
        System.out.println(ans);
    }
}
