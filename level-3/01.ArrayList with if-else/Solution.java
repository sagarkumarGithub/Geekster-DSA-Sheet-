import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int t = scn.nextInt();
        
        for(int i=0; i<t; i++){
            int q = scn.nextInt();
            
            if(q == 1){
                System.out.println(arr.size());
            }else if(q == 2){
                if(arr.size() == 0){
                    System.out.println("invalid-move ");
                }else{
                    Integer remEle = arr.remove(arr.size()-1);
                    System.out.println(remEle);
                }
            }else if(q == 3){
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(x);
            }else if(q == 4){
                if(arr.size() == 0){
                    System.out.println("invalid-move ");
                }else{
                    int remEle = arr.remove(0);
                    System.out.println(remEle);
                }
            }else if(q == 5){
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(0,x);
            }else {
                if(arr.size() == 0){
                    System.out.println("invalid-move ");
                }else{
                    for(int j=0; j<arr.size(); j++){
                        System.out.print(arr.get(j) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}