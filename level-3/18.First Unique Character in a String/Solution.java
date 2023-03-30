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
        
        int idx = -1;
        for(int i=0; i<str.length(); i++){
            if(hm.get(str.charAt(i)) == 1){
                idx = i;
                break;
            }
        }
        
        System.out.println(idx);
    }
}
