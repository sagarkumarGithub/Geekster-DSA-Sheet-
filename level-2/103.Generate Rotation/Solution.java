import java.util.*;

public class Solution {

    public static void GenerateRotation(String str){
        String currStr = str + str;
        int i=str.length();
        int j=currStr.length()-1;

        for(int k=i; k<=j; k)
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        GenerateRotation(str);
    }
}
