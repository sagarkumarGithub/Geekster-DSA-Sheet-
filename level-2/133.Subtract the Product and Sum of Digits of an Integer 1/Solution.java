import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        int prod = 1;
        while(n>0){
            int d = n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        System.out.println(prod-sum);
    }
}
