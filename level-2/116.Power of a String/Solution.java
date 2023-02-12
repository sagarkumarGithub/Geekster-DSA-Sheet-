import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = 1;
        int maxCount = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}    
