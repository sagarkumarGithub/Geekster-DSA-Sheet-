import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] mat = new int[r][c];
        int idx=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                mat[i][j] = arr[idx++];
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
