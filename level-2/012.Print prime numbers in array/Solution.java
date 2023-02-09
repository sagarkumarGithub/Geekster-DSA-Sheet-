import java.util.*;

public class Solution {

    public static boolean isPrime(int n){
        int count = 0;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
