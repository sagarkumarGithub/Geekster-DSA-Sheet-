import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean findUniqueOccurence(HashMap<Integer,Integer> hm){
        HashMap<Integer,Integer> ansMap = new HashMap<>();
        for(int ele : hm.keySet()){
            ansMap.put(hm.get(ele),1);
        }
        
        return hm.size() == ansMap.size();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        boolean uniqueOccurence = findUniqueOccurence(hm);
        System.out.println(uniqueOccurence);
    }
}