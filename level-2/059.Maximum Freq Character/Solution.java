import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        int maxFreq = 0;
        char maxFreqChar = str.charAt(0);
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if(freq[idx] > maxFreq){
                maxFreq = freq[idx];
                maxFreqChar = ch;
            }
        }

        System.out.println(maxFreqChar);
    }
}
