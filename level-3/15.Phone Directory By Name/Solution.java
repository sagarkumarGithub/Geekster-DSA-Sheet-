import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String,String> hm = new HashMap();
        
        while(true){
            int number = scn.nextInt();
            
            if(number == 1){
                String name = scn.next();
                String phoneNo = scn.next();
                hm.put(name,phoneNo);
            }else if(number == 2){
                String name = scn.next();
                if(hm.containsKey(name)){
                    System.out.println(hm.get(name));
                }else{
                    System.out.println(-1);
                }
            }else if(number == 3){
                String name = scn.next();
                hm.remove(name);
            }else{
                break;
            }
        }
    }
}