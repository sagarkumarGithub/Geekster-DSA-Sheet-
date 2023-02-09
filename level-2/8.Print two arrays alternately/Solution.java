import java.util.*;

public class Solution {
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

        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(arr1[i] + " ");
            }else{
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
