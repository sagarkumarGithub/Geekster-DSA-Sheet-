import java.util.*;

public class Solution {

    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        boolean ans = isPalindrome(str);
        if(ans){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
