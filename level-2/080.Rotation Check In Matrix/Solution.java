import java.util.*;

public class Solution {

    public static String checkRotation(int[][] mat){
        int n = mat.length;
        String s = "";
        for(int j=0; j<n; j++){
            s += mat[0][j];
        }

        s = s + s;

        for(int i=0; i<n; i++){
            String curr = "";
            for(int j=0; j<n; j++){
                curr += mat[i][j];
            }

            if(s.indexOf(curr) == -1){
                return "NO";
            }
        }

        return "YES";
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

        String ans = checkRotation(mat);
        System.out.println(ans);
    }
}
