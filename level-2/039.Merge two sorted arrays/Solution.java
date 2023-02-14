import java.util.*;

public class Solution {
    
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] a = new int[n];
      for(int i = 0 ; i < n; i++){
        a[i] = scn.nextInt();
      }
        
      int m = scn.nextInt();
      int[] b = new int[m];
      for(int i = 0 ; i < m; i++){
        b[i] = scn.nextInt();
      }
        
      int i = 0, j =0, k = 0;
      int[] ans = new int[a.length + b.length];
      while(i < a.length && j < b.length){
          if(a[i] <= b[j]){
            ans[k] = a[i];
            i++;
            k++;
          }else{
            ans[k] = b[j];
            j++;
            k++;
          }
      }
  
      while(i < a.length){
        ans[k] = a[i];
        k++;
        i++;
      }
  
      while(j < b.length){
        ans[k] = b[j];
        k++;
        j++;
      }
        
      for(int val:ans){
          System.out.print(val + " ");
      }  
    }
  
  }
