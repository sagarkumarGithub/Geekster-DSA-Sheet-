import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
