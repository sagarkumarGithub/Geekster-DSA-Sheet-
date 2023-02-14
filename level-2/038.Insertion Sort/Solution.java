import java.util.*;

public class Solution {

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
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

        insertionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
