import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i=0; i<n; i++){
            heights[i] = scn.nextInt();
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            //find leftmax
            int leftMax = heights[i];
            for(int j=i; j>=0; j--){
                if(heights[j] > leftMax){
                    leftMax = heights[j];
                }
            }

            //find rightMax
            int rightMax = heights[i];
            for(int j=i; j<n; j++){
                if(heights[j] > rightMax){
                    rightMax = heights[j];
                }
            }

            ans += Math.min(leftMax,rightMax) - heights[i];
        }

        System.out.println(ans);
    }
}
