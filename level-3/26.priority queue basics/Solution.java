import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<t; i++){
            int n = scn.nextInt();
            pq.add(n);
            System.out.println(pq.peek());
        }
    }
}