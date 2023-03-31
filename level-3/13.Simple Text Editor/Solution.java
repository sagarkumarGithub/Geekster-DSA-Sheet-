import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        scn.nextLine();
        
        for(int i=0; i<t; i++){
            String q = scn.nextLine();
            int number = Integer.parseInt(q.split(" ")[0]);
            
            if(number == 1){
                st.push(sb.toString());
                String text = q.split(" ")[1];
                sb.append(text);
            }else if(number == 2){
                int k = Integer.parseInt(q.split(" ")[1]);
                st.push(sb.toString());
                sb.delete(sb.length()-k,sb.length());
            }else if(number == 3){
                int k = Integer.parseInt(q.split(" ")[1]);
                System.out.println(sb.charAt(k-1));
            }else{
                sb = new StringBuilder(st.pop());
            }
        }
    }
}