import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        
        if(i==s.length()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
