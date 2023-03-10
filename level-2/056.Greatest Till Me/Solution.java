import java.util.*;

public class Solution {

    public static void printGreatestTillMe(int[] arr){
        int leftMax = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > leftMax){
                leftMax = arr[i];
            }
            System.out.println(leftMax);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        printGreatestTillMe(arr);
    }
}
