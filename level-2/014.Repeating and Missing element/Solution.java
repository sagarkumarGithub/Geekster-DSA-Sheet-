import java.util.*;

public class Solution {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int missingEle =  -1;
        boolean[] check = new boolean[n+1];
        for(int i=1; i<n; i++){
            int idx = arr[i];
            check[idx] = true;
        }
        
        for(int i=1; i<check.length; i++){
            if(check[i] == false){
                missingEle = i;
            }
        }
        
        int repeatingEle = -1;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                repeatingEle = arr[i];
            }
        }
        
        System.out.println(repeatingEle);
        System.out.println(missingEle);
    }
}
