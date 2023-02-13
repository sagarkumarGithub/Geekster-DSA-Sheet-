import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int[] freq = new int[10];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - '0';
            freq[idx]++;
        }

        int maxFreqEle = -1;
        int maxFreq = 0;
        for(int i=0; i<10; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxFreqEle = i;
            }
        }

        System.out.println(maxFreqEle);
    }
}
