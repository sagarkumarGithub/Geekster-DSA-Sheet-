import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char char1 = scn.next().charAt(0);
        char char2 = scn.next().charAt(0);

        System.out.println(str.indexOf(char2) - str.indexOf(char1)-1);
    }
}
