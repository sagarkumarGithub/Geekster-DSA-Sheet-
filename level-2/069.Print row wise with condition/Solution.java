import java.util.*;

public class Solution {
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

        for(int r=0; r<m; r++){
            if(r%2==0){
                for(int c=0; c<n; c++){
                    System.out.print(mat[r][c] + " ");
                }    
            }else{
                for(int c=n-1; c>=0; c--){
                    System.out.print(mat[r][c] + " ");
                }   
            }
            System.out.println();
        }
    }
}
