import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=0; i<t; i++){
            int q = scn.nextInt();
                
            if(q == 1){
                System.out.println(pq.size());
            }else if(q == 2){
                if(pq.size() == 0){
                    System.out.println(-1);
                }else{
                    pq.remove();
                }
            }else if(q == 3){
                int x = scn.nextInt();
                pq.add(x);
            }else{
                if(pq.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(pq.peek());
                }
            }
        }
    }
}