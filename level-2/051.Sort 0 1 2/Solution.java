import java.util.*;

public class Solution {

    public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    public static void sort012(int[] arr){
        int i=0; // 0 to i-1 -> area of 0
        int j=0; // i to j-1 -> area of 1
        int k = arr.length-1; // j to k-1 unkown area
        // k to end -> area of 2
        while(i <= k){
            if(arr[i] == 0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i] == 1){
                i++;
            }else{
                swap(arr,i,k);
                k--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        sort012(arr);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
