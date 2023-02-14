import java.util.*;

public class Solution {

    public static int findUniqueChar(String str){
        int[] freqArr = new int[10];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - '0';
            freqArr[idx]++;
        }

        int count = 0;
        for(int i=0; i<10; i++){
            if(freqArr[i] != 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int ans = findUniqueChar(str);
        System.out.println(ans);
    }
}
