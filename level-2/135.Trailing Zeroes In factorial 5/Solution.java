import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        for(int i=5; n/i>=1; i*=5){
            count += n/i;
        }
        System.out.println(count);
    }
}
