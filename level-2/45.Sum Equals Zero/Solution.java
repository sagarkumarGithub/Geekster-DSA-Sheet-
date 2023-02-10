import java.util.*;

public class Solution {

    public static boolean isSumEqualsZero(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        boolean ans = isSumEqualsZero(arr);
        System.out.println(ans);
    }
}
