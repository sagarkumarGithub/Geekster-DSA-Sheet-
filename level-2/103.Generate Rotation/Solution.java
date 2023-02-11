import java.util.*;

public class Solution {

    public static void GenerateRotation(String str){
        String currStr = str + str;
        int i=str.length();
        int j=currStr.length()-1;

        while(i>0){
            for(int k=i; k<=j; k++){
                char ch = currStr.charAt(k);
                System.out.print(ch);
            }
            System.out.println();
            i--;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        GenerateRotation(str);
    }
}
