import java.util.*;

public class Solution {

    public static boolean reachTarget(String str1, String str2){
        String str = str1 + str1;
        return str.contains(str2);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        boolean ans = reachTarget(str1,str2);
        if(ans){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
     }
}
