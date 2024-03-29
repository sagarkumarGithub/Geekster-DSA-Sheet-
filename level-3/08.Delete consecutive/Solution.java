import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<t; i++){
            String str = scn.next();
            
            if(st.size() != 0 && st.peek().equals(str)){
                st.pop();
            }else{
                st.push(str);
            }
        }
        
        System.out.println(st.size());
    }
}