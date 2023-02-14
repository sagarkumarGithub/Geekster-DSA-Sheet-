import java.util.*;

public class Solution {

    public static boolean isPresentInRow(String str,String row){
        for(int i=0; i<str.length(); i++){
            if(row.indexOf(str.charAt(i)) == -1){
                return false;
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

        boolean isPresent = false;
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        for(int i=0; i<n; i++){
            String currStr = words[i];
            boolean r1 = isPresentInRow(currStr,row1);
            boolean r2 = isPresentInRow(currStr,row2);
            boolean r3 = isPresentInRow(currStr,row3);

            if(r1 || r2 || r3){
                System.out.print(currStr + " ");
                isPresent = true;
            }
        }

        if(!isPresent){
            System.out.println(-1);
        }
    }
}
