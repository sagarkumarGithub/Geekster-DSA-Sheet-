/*

----------------
Reverse Number
----------------

1. Given Single Integer T. Next  lines will have a Single Integer N.

2. Print the Reverse of the Integer N.

3. (Note: You have to use stack to perform this operation)
      
Input Format
--------------

* Single Integer T.
* Next T Lines have Single Integer N.


Constraints
-------------

 1<= T <= 10^4
 0<= T <= 10^8

Output Format
---------------

* T Lines of Reverse of N Integers.

Sample Input 0
----------------

4
1234
1001
1000
2340

Sample Output 0
-----------------

4321
1001
1
432


 */

 import java.io.*;
 import java.util.*;
 
 public class Solution {
     
     public static int reverse(int n){
         //create stack
         Stack<Integer> st = new Stack<>();
         
         //fill stack
         while(n>0){
             st.push(n%10);
             n/=10;
         }
         
         //make ans
         int ans = 0;
         int mul = 1;
         while(st.size() > 0){
             int d = st.pop();
             if(ans == 0 && d == 0){
                 continue;
             }else{
                 ans += d * mul;
                 mul *= 10;
             }
         }
         return ans;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int t = scn.nextInt();
         
         for(int i=0; i<t; i++){
             int n = scn.nextInt();
             System.out.println(reverse(n));
         }
     }
 }
