import java.util.*;

public class Solution{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int total = (int)Math.pow(2,str.length());
        for(int i=total-1; i>=0; i--){
            int temp = i;
            String ans = "";
            
            for(int j=str.length()-1; j>=0; j--){
                int rem = temp%2;
                temp = temp/2;
                
                if(rem == 1){
                    ans = str.charAt(j) + ans;
                }
            }
            System.out.print(ans + " ");
        }
    }
}
