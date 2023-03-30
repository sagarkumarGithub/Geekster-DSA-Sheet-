import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Queue<Integer> que = new LinkedList();
        for(int i=0; i<t; i++){
            int q = scn.nextInt();
            
            if(q == 1){
                System.out.println(que.size());
            }else if(q == 2){
                if(que.size() == 0){
                    System.out.println(-1);
                }else{
                    que.remove();
                }
            }else if(q == 3){
                int x = scn.nextInt();
                que.add(x);
            }else if(q == 4){
                if(que.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(que.peek());
                }
            }
        }
    }
}