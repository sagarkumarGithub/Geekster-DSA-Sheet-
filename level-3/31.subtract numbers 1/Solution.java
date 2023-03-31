import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        HashSet<Integer> set = new HashSet();
        for(int ele : arr){
            if(ele > 0){
                set.add(ele);
            }
        }
        
        System.out.println(set.size());
    }
}