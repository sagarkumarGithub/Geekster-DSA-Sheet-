import java.util.*;

public class Solution {

    public static void sortInWaveForm(int[] arr){

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        sortInWaveForm(arr);
        for(int val:arr){
            System.out.print(val+ " ");
        }
    }
}
