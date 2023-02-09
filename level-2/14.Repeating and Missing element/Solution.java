import java.util.*;

public class Solution {

    public static void printRepeatingAndMissing(int[] arr){

        //missing ele
        int n = arr.length+1;
        boolean[] check = new boolean[n];
        for(int i=1; i<n; i++){
            int idx = arr[i];
            check[idx] = true;
        }

        int missingEle = 0;
        for(int i=1; i<check.length; i++){
            if(check[i] == false){
                missingEle = i;
            }
        }

        //repeating ele
        Arrays.sort(arr);
        int repeatingEle = -1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                repeatingEle = arr[i];
                break;
            }
        }   
        
        System.out.println(missingEle);
        System.out.println(repeatingEle);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        printRepeatingAndMissing(arr);
    }
}
