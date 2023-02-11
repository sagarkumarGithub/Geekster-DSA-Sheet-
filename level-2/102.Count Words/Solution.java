import java.util.*;

public class Solution {

    public static int countTotalWords(String str){
        int count = 1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = countTotalWords(str);
        System.out.println(count);
    }
}
