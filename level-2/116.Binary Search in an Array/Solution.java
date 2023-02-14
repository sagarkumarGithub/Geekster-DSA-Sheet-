import java.util.*;

public class Solution {

    public static int binarySearch(int[] arr, int k){
        int lo=0;
        int hi=arr.length;

        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int idx = binarySearch(arr,k);
        System.out.println(idx);
    }
}
