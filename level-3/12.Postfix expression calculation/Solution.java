import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                //digit
                st.push(ch-'0');
            }else{
                //operator -> calculate
                int v2 = st.pop();
                int v1 = st.pop();
                int res = -1;
                
                if(ch == '+'){
                    res = v1 + v2;
                }else if(ch == '-'){
                    res = v1 - v2;
                }else if(ch == '*'){
                    res = v1 * v2;
                }else{
                    res = v1 / v2;
                }
                
                st.push(res);
            }
        }
        System.out.println(st.peek());
    }
}