import java.util.*;

public class Solution {

    public static void printTargetSumElements(int[] arr, int tar){
        int i=0;
        int j=arr.length-1;

        Arrays.sort(arr);

        while(i<j){
            if(arr[i] + arr[j] == tar){
                while(i+1<j && arr[i] == arr[i+1]){
                    i++;
                }
                while(j-1>i && arr[j] == arr[j-1]){
                    j--;
                }
                System.out.println(arr[i] + " " +arr[j]);
                i++;
                j--;
            }else if(arr[i] + arr[j] > tar){
                j--;
            }else{
                i++;
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

        printTargetSumElements(arr,tar);
    }
}
