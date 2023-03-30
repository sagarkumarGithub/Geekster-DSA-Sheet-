import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        Queue<String> que = new LinkedList<>();
        que.add("1");
        
        for(int i=0; i<n; i++){
            String rem = que.remove();
            System.out.print(rem + " ");
            
            que.add(rem + "0");
            que.add(rem + "1");
        }
    }
}