import java.util.*;

public class Solution {

    public static void printPrefixSumBetweenLeftAndRight(int[] arr, int left, int right){
        int left = arr[0];
        for(int i=0; i<arr.length; i++){

        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int left = scn.nextInt();
        int right = scn.nextInt();

        printPrefixSumBetweenLeftAndRight(arr,left,right);
    }
}
