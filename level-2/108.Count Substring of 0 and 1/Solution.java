import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int prev = 0;
        int curr = 1;
        int ans = 0;
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                curr++;
            }else{
                ans += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }
        }
        
        ans += Math.min(prev,curr);
        System.out.println(ans);
    }
}
