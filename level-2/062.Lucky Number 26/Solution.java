import java.util.*;

public class Solution {

    public static int findLuckyNumber(int[] arr){
        int[] freq = new int[10];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        int largestLuckyNum = -1;
        int luckyNum = -1;
        for(int i=1; i<10; i++){
            if(freq[i] == i){
                luckyNum = i;
            }
            if(luckyNum > largestLuckyNum){
                largestLuckyNum = luckyNum;
            }
        }

        return largestLuckyNum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = findLuckyNumber(arr);
        System.out.println(ans);
    }
}
