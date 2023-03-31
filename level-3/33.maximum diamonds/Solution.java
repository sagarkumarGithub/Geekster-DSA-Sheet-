import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        while(n-- > 0){
            int x = scn.nextInt();
            pq.add(x);
        }
        
        int ans = 0;
        while(k-- > 0){
            int rem = pq.remove();
            ans += rem;
            pq.add(rem/2);
        }
        
        System.out.println(ans);
    }
}