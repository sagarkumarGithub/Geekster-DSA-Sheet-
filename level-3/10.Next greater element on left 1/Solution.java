import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] nextGreaterToTheLeft(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            while(st.size() != 0 && arr[i] > st.peek()){
                st.pop();
            }
            
            if(st.size() == 0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int[] ans = nextGreaterToTheLeft(arr);
        for(int val:ans){
            System.out.print(val + " ");
        }
    }
}