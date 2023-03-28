import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = scn.nextInt();
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            int minVal = 0;
            
            if(arr1[i] < arr2[j]){
                //arr1[i] should be added
                minVal = arr1[i];
                i++;
            }else{
                //arr2[j] should be added
                minVal = arr2[j];
                j++;
            }
            
            if(ans.size() == 0){
                ans.add(minVal);
            }else{
                if(ans.get(ans.size()-1) != minVal){
                    ans.add(minVal);
                }
            }
        }
        
        while(i < n){
            if(ans.get(ans.size()-1) != arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        
        while(j < m){
            if(ans.get(ans.size()-1) != arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        
        for(Integer ele : ans){
            System.out.print(ele + " ");
        }
    }
}
