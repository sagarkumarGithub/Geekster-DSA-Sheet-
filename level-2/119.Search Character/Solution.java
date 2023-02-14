import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        int n = scn.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.next().charAt(0);
        }

        for(int i=0; i<n; i++){
            if(arr[i] > ch){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
