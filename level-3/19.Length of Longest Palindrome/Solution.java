import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
        }
        
        int ans = 0;
        int extra = 0;
        
        for(char ele : hm.keySet()){
            int val = hm.get(ele);
            
            if(val % 2 == 0){
                ans += val;
            }else{
                extra = 1;
                ans += val-1;
            }
        }
        ans += extra;
        System.out.println(ans);
    }
}