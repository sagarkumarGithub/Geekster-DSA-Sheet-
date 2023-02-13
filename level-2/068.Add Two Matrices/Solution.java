import java.util.*;

public class Solution {
    
    public static int[][] sumOfMat(int[][]mat1, int[][]mat2){
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        
        int r2 = mat2.length;
        int c2 = mat2[0].length;
        
        int[][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
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
        
        
        if(m1!=m2 || n1!=n2){
            System.out.println("-1");
        }else{
            int[][]sum = sumOfMat(mat1,mat2);
            for(int i=0; i<m2; i++){
                for(int j=0; j<n2; j++){
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}