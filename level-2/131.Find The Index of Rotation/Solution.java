import java.util.*;

public class Solution {

    public static int indexOfRotation(int[] arr){
        int lo=0;
        int hi=arr.length-1;

        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[lo] <= arr[mid]){
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

        int idx = indexOfRotation(arr);
        System.out.println(idx);
    }
}
