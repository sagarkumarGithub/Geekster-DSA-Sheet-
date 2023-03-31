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
        
        int v1 = pq.remove();
        int v2 = pq.remove();
        
        int res = (v1-1) * (v2-1);
        System.out.println(res);
    }
}