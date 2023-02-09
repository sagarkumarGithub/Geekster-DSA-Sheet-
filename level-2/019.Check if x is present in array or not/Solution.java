import java.util.*;

public class Solution {

    public static boolean isPresent(int[] arr, int val){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                return true;
            }
        }    
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int val = scn.nextInt();
        boolean ans = isPresent(arr,val);
        if(ans){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
