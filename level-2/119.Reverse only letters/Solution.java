import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }else if(!Character.isLetter(arr[j])){
                j--;
            }else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        for(char val:arr){
            System.out.print(val);
        }
    }
}
