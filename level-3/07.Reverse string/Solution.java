/*

----------------
Reverse string
----------------

Given a String Str. We have to Reverse the string Str with help of only stacks.
      
Input Format
--------------

* Single String Str.


Constraints
-------------

 1 <= Str.length() <= 10^5

Output Format
---------------

* Print the Reverse of the String Str.

Sample Input 0
----------------

abcdee

Sample Output 0
-----------------

eedcba


 */

 import java.io.*;
 import java.util.*;
 
 public class Solution {
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         String str = scn.next();
         
         Stack<Character> st = new Stack<>();
         String ans = "";
         
         for(int i=0; i<str.length(); i++){
             st.push(str.charAt(i));
         }
         
         while(st.size() > 0){
             ans += st.pop();
         }
         
         System.out.println(ans);
     }
 } 