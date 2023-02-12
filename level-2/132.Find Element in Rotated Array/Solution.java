import java.util.*;

public class Solution {

    public static int findElementInRotatedArr(int[] arr, int k){
        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid] == k){
                return mid;
            }else if(arr[lo] <= arr[mid]){
                //lo to mid part is sorted
                if(k >= arr[lo] && k <= arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else if(arr[mid] <= arr[hi]){
                //mid to hi part is sorted
                if(k >= arr[mid] && k <= arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
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

        int idx = findElementInRotatedArr(arr,k);
        System.out.println(idx);
    }
}
