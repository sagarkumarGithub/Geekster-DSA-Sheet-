import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int k = scn.nextInt();
        str = str.replace(" ","");
        str = str.toLowerCase();
        
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        
        for(int i=1; i<=k; i++){
            int max = 0;
            int maxIdx = -1;
            for(int j=0; j<26; j++){
                if(freq[j] > max){
                    max = freq[j];
                    maxIdx = j;
                }
            }
            System.out.print((char)(maxIdx + 'a') + " ");
            freq[maxIdx] = -1;
        }
    }
}
