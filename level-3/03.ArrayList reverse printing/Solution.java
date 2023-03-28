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
        
        //using for loop
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        //using forEach loop
        int idx = list.size()-1;
        for(Integer ele : list){
            System.out.print(list.get(idx) + " ");
            idx--;
        }
    }
}