import java.util.*;

public class Solution{

    public static int findMaxProductOf3Num(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        int max3 = max2;

        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        for(int i=0; i<arr.length; i++){
            //update max value
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] >= max2){
                max3 = max2;
                max2 = arr[i];
            }else if(arr[i] >= max3){
                max3 = arr[i];
            }
            
            //update min value
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] <= min2){
                min2 = arr[i];
            }
        }

        return Math.max(max1*max2*max3, min1*min2*max1);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = findMaxProductOf3Num(arr);
        System.out.println(ans);
    }
}