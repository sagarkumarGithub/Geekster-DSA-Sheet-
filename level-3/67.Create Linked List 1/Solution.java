import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<n; i++){
            int val = scn.nextInt();
            list.addLast(val);
        }
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}