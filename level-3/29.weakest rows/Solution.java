import java.io.*;
import java.util.*;

public class Solution {
    
    public static int soildersInRow(int[][] A, int row){
        int count = 0;
        for(int j=0; j<A[0].length; j++){
            if(A[row][j] == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int[][] A = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j] = scn.nextInt();
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=0; i<m; i++){
            int count = soildersInRow(A,i);
            pq.add(count * 10000 + i);
        }
        
        while(k-- > 0){
            int rem = pq.remove();
            System.out.print(rem % 10000 + " ");
        }
    }
}