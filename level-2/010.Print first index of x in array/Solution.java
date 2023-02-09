import java.util.*;

public class Solution {

    public static int findFirstIndex(int[] arr, int val){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                return i;
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

        int val = scn.nextInt();
        int firstIndex = findFirstIndex(arr,val);
        System.out.println(firstIndex);
    }
}
