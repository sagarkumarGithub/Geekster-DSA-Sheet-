import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int sum = 0;
        for(int st=0; st<str.length(); st++){
            for(int ed=st; ed<str.length(); ed++){
                sum += Integer.parseInt(str.substring(st,ed+1));
            }
        }
        System.out.println(sum);
    }
}
