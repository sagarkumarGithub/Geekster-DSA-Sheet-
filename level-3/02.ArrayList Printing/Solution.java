import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            list.add(scn.nextInt());
        }
        
        //printing using for loop
        for(int i=0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        //printing using for each loop
        for(Integer ele : list){
            System.out.print(ele + " ");
        }
        
    }
}