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
        
        //create frequency map
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        //fill hashmap
        for(int ele: arr){
            hm.put(ele,hm.getOrDefault(ele,0) + 1);
        }
        
        //check freq>1
        boolean ans = false;
        for(int key: hm.keySet()){
            if(hm.get(key) > 1){
                ans = true;
                break;
            }
        }
        
        System.out.println(ans);
    }
}