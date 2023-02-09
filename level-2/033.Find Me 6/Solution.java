import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(Math.abs(arr1[i]) == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
