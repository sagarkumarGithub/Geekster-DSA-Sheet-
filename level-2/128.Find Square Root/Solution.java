import java.util.*;

public class Solution {

    public static int findSquareRoot(int n){
        int lo = 0;
        int hi = n;
        int ans = -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid >n){
                hi=mid-1;
            }else{
                ans=mid;
                lo=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = findSquareRoot(n);
        System.out.println(ans);
        
    }
}
