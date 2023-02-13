import java.util.*;

public class Solution {

    public static void interchangeRows(int[][] mat){
        for(int i=0; i<mat[0].length; i++){
            int temp = mat[0][i];
            mat[0][i] = mat[mat.length-1][i];
            mat[mat.length-1][i] = temp;
        }
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

        interchangeRows(mat);

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
