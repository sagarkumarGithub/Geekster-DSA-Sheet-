import java.util.*;

public class Solution {

    public static void searchInSortedMatrix(int[][] mat, int k){
        int i=0;
        int j=mat[0].length-1;
        boolean flag = false;

        while(i<mat.length && j >=0){
            if(mat[i][j] == k){
                System.out.println(i);
                System.out.println(j);
                flag = true;
                break;
            }else if(mat[i][j] < k){
                i++;
            }else{
                j--;
            }
        }

        if(flag == false){
            System.out.println("Not Found");
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

        int k = scn.nextInt();

        searchInSortedMatrix(mat,k);
    }
}
