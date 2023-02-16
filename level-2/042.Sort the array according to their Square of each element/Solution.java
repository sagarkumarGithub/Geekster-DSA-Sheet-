//40,42,47,81,82,83,87,103,104,108

import java.util.*;

public class Solution {

    public static int[] sortArr(int[] arr){
        int[] res = new int[arr.length];

        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;

        while(i<=j){
            int val1 = arr[i] * arr[i];
            int val2 = arr[j] * arr[j];

            if(val1 > val2){
                res[k] = val1;
                i++;
            }else{
                res[k] = val2;
                j--;
            }
            k--;
        }

        return res;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int[] res = sortArr(arr);
        for(int val:res){
            System.out.print(val + " ");
        }
    }
}
