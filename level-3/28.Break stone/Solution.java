import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        while(n-- > 0){
            int x = scn.nextInt();
            pq.add(x);
        }
        
        while(pq.size() > 1){
            int s1 = pq.remove();
            int s2 = pq.remove();
            
            int res = s1-s2;
            if(res != 0){
                pq.add(res);
            }
        }
        
        if(pq.size() == 0){
            System.out.println(0);
        }else{
            System.out.println(pq.peek());
        }
    }
}