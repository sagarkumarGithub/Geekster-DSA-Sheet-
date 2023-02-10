import java.util.*;

public class Solution {

    public static void reachTarget2(int[] arr, int tar){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i] + arr[j] > tar){
                j--;
            }else if(arr[i] + arr[j] < tar){
                i++;
            }else{
                System.out.println(i + " " + j);
                i++;
                j--;
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

        int tar = scn.nextInt();
        reachTarget2(arr,tar);
    }
}
