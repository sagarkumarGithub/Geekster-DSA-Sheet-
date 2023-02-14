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
        int n = scn.nextInt();
        String[] words = new String[n];
        for(int i=0; i<n; i++){
            words[i] = scn.next();
        }

        for(int i=0; i<n; i++){
            if(isPalindrome(words[i])){
                System.out.println(words[i]);
                break;
            }
        }
    }
}
