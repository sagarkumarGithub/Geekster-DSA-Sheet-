import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int left = scn.nextInt();
        int right = scn.nextInt();
        int k = scn.nextInt();

        for(int i=0; i<=left; i++){
            arr[i] += k;
        }

        for(int i=right; i<n; i++){
            arr[i] += k;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}