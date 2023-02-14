import java.util.*;

public class Solution {

    public static boolean isIsogram(String str){
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        for(int i=0; i<26; i++){
            if(freq[i] > 1){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = str.toLowerCase();

        boolean ans = isIsogram(str);
        if(ans){
            System.out.println("Isogram");
        }else{
            System.out.println("Not an Isogram");
        }
    }
}
