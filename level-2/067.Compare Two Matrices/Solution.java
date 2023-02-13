import java.util.*;

public class Solution {

    public static boolean compare(int[][] mat1, int[][] mat2){
        int m1 = mat1.length;
        int n1 = mat1[0].length;

        int m2 = mat2.length;
        int n2 = mat2[0].length;

        if(m1 != m2 || n1 != n2){
            return false;
        }

        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                if(mat1[i][j] != mat2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m1 = scn.nextInt();
        int n1 = scn.nextInt();

        int[][] mat1 = new int[m1][n1];
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                mat1[i][j] = scn.nextInt();
            }
        }

        int m2 = scn.nextInt();
        int n2 = scn.nextInt();

        int[][] mat2 = new int[m2][n2];
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                mat2[i][j] = scn.nextInt();
            }
        }

        boolean isEqual = compare(mat1,mat2);
        if(isEqual){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}
