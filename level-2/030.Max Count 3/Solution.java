import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int maxCount = 0;
        int maxCountEle = -1;
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                    maxCountEle = arr[i-1];
                }
                count = 1;
            }
        }
        System.out.println(maxCountEle);
    }
}
