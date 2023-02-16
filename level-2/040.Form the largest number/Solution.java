import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                String ab = "" + arr[i] + arr[j];
                String ba = "" + arr[j] + arr[i];
                
                int abVal = Integer.parseInt(ab);
                int baVal = Integer.parseInt(ba);
                
                if(baVal > abVal){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        String ans = "";
        for(int i=0; i<n; i++){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
