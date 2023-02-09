import java.util.*;

public class Solution{

    public static int firstNonMatchingNum(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = scn.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = scn.nextInt();
        }

        int index = firstNonMatchingNum(arr1,arr2);
        System.out.println(index);
    }
}