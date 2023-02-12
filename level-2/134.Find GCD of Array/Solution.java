import java.util.*;

public class Solution {

    public static int findGCD(int min, int max){
        int gcd = 1;
        for(int i=2; i<=min; i++){
            if(min%i==0 && max%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i] < min){
                min=arr[i];
            }
        }

        int ans = findGCD(min,max);
        System.out.println(ans);
    }
}