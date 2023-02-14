import java.util.*;

public class Solution{

    public static void bubbleSort(int[] arr){
        for(int itr=1; itr<=arr.length-1; itr++){
            for(int j=0; j<arr.length-itr; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
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

        bubbleSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}