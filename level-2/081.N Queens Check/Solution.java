import java.util.*;

public class Solution {
    
    public static boolean isInDanger(int[][] A, int i, int j){
        //left
        for(int r=i, c=j-1; c>=0; c--){
            if(A[r][c] == 1){
                return true;
            }
        }
        
        //top left
        for(int r=i-1, c=j-1; c>=0 && r>=0; c--,r--){
            if(A[r][c] == 1){
                return true;
            }
        }
        
        //top
        for(int r=i-1, c=j; r>=0; r--){
            if(A[r][c] == 1){
                return true;
            }
        }
        
        //top right
        for(int r=i-1, c=j+1; r>=0 && c<A.length; r--,c++){
            if(A[r][c] == 1){
                return true;
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = scn.nextInt();
            }
        }
        
        boolean ans = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(A[i][j] == 1 && isInDanger(A,i,j) == true){
                    ans = true;
                    break;
                }
                
            }
        }
        
        if(ans == true){
            System.out.println("Danger");
        }else{
            System.out.println("N Queens");
        }
    }
}
