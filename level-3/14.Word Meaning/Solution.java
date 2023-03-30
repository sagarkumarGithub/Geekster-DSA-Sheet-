import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String,String> hm = new HashMap<>();
        
        while(true){
            int number = scn.nextInt();
            
            if(number == 1){
                String word = scn.next();
                String meaning = scn.next();  
                hm.put(word,meaning);
            }else if(number == 2){
                String word = scn.next();
                if(hm.containsKey(word)){
                    System.out.println(hm.get(word));
                }else{
                    System.out.println(-1);
                }
            }else if(number == 3){
                String word = scn.next();
                hm.remove(word);
            }else{
                break;
            }
        }
    }
}