import java.util.*;

public class Solution {

    public static void desiredString(String str){

        int count = 0;
        String longestSubStr = "";
        for(int st=0; st<str.length(); st++){
            for(int ed=st; ed<str.length(); ed++){
                String ss = str.substring(st, ed+1);
                if(ss.length()>1 && ss.charAt(0) == 'A' && ss.charAt(ss.length()-1) == 'A'){
                    count++;
                    if(ss.length()>longestSubStr.length()){
                        longestSubStr = ss;
                    }
                }
            }
        }
        if(count > 1){
            System.out.println(count);
            System.out.println(longestSubStr.length());
            System.out.println(longestSubStr);
        }else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        desiredString(str);
    }
}
