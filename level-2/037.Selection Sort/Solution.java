import java.util.*;

public class Solution {

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int mi = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[mi]){
                    mi = j;
                }
            }
            int temp = arr[mi];
            arr[mi] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        selectionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
