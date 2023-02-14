import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = 0;
        int maxCount = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;                
            }
        }
        System.out.println(maxCount);
    }
}
