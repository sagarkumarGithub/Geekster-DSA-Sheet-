import java.util.*;

public class Solution {

    public static String mergeAlternatively(String str1, String str2){
        String str = "";
        for(int i=0; i<str1.length(); i++){
                str += str1.charAt(i);
                str += str2.charAt(i);
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        String str = mergeAlternatively(str1,str2);
        System.out.println(str);
    }
}
