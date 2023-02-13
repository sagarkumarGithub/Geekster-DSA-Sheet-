import java.util.*;

public class Solution {

    public static boolean isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        boolean ans = isAnagram(str1,str2);
        if(ans){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
