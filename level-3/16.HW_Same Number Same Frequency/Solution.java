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
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:arr){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:hm.keySet()){
            if(Math.abs(ele) == hm.get(ele)){
                list.add(ele);
            }
        }
        
        Collections.sort(list);
        for(int ele: list){
            System.out.println(ele);
        }
    }
}