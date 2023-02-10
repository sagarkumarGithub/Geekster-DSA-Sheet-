import java.util.*;

public class Solution {

    public static void printPair(int[] arr, int k){
        
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        printPair(arr,k);
    }
}
