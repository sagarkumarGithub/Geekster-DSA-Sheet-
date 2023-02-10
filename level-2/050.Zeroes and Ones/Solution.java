import java.util.*;

public class Solution {

   public static void sort01(int[] arr){
    int i=0;
    int j=0;

    while(i<arr.length){
        if(arr[i] == 1){
            i++;
        }else{
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j++;
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

    sort01(arr);
    for(int val:arr){
        System.out.print(val + " ");
    }
   } 
}
