import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.next().charAt(0);
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                System.out.println(i);
                break;
            }
        }
    }
}
