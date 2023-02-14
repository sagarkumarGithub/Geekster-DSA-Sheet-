import java.util.*;

public class Solution {

    public static int findLastIndex(int[] arr, int k){
        int lo=0;
        int hi=arr.length-1;
        int lastIdx = -1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid] == k){
                lastIdx = mid;
                lo=mid+1;
            }else if(arr[mid]<k){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return lastIdx;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int ans = findLastIndex(arr,k);
        System.out.println(ans);
    }
}
