import java.util.*;

public class Solution {

    public static int firstNonRepeatingChar(String str){
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int idx = firstNonRepeatingChar(str);
        if(idx==-1){
            System.out.println(-1);
        }else{
            System.out.println(str.charAt(idx));
        }
    }
}
