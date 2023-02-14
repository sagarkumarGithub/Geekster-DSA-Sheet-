import java.util.*;

public class Solution {

    public static void printSpiral(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;

        int minrow = 0;
        int mincol = 0;
        int maxrow = m-1;
        int maxcol = n-1;
        int tne = m*n;
        int count = 0;

        while(count < tne){
            //top wall
            for(int i=minrow,j=mincol; j<=maxcol && count<tne; j++){
                System.out.print(mat[i][j] + " ");
                count++;
            }
            minrow++;

            //right wall
            for(int i=minrow,j=maxcol; i<=maxrow && count<tne; i++){
                System.out.print(mat[i][j] + " ");
                count++;
            }
            maxcol--;

            //bottom wall
            for(int i=maxrow,j=maxcol; j>=mincol && count<tne; j--){
                System.out.print(mat[i][j] + " ");
                count++;
            }
            maxrow--;

            //left wall
            for(int i=maxrow,j=mincol; i>=minrow && count<tne; i--){
                System.out.print(mat[i][j] + " ");
                count++;
            }
            mincol++;
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

        printSpiral(mat);
    }
}
