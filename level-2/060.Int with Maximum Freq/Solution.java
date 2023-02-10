import java.util.*;

public class Solution {

    public static int findMaxFreqEle(int[] arr){
        int[] freq = new int[10];
        for(int i=0; i<arr.length; i++){
            int idx = arr[i];
            freq[idx]++;
        }

        int maxFreqEle = -1;
        int maxFreq = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxFreqEle = i;
            }
        }
        return maxFreqEle;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = findMaxFreqEle(arr);
        System.out.println(ans);
    }
}
