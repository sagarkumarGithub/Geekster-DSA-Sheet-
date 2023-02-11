import java.util.*;

public class Solution {

    public static void printIndexesOfVowels(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printIndexesOfVowels(str);
    }
}
