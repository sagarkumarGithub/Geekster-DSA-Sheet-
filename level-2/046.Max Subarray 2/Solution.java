import java.util.*;

public class Solution {

    public static int findMaxSumOfSubarray(int[] arr){
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = findMaxSumOfSubarray(arr);
        System.out.println(ans);
    }
}
