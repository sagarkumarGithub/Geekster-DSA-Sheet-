import java.util.*;

public class Solution {

    public static boolean isPangram(String str){

        str = str.toLowerCase();
        str = str.replace(" ", "");
        
        if(str.length() < 26){
            return false;
        }

        for(char ch='a'; ch<='z'; ch++){
            if(str.indexOf(ch) < 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        boolean ans = isPangram(str);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
