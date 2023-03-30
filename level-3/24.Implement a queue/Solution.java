import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        int[] que = new int[100000];
        int front = 0;
        int rear = 0;
        
        for(int i=0; i<t; i++){
            String q = scn.next();
            if(q.equals("enqueue")){
                int val = scn.nextInt();
                que[rear] = val;
                rear++;
            }else if(q.equals("dequeue")){
                if(front != rear){
                    front++;
                }
            }else if(q.equals("size")){
                System.out.println(rear-front);
            }else if(q.equals("display")){
                for(int j=front; j<rear; j++){
                    System.out.print(que[j] + " ");
                }
                System.out.println();
            }
        }
    }
}