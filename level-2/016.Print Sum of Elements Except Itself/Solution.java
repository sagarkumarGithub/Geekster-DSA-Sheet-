import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
            sum += arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.println(sum - arr[i] + " ");
        }
    }
}
