/*

-----------------------
Stack Syntax Learning
-----------------------

1. Declare an Empty  .
2. Take Single Integer  as input.
3. For next  Lines format 
      *case 1.  Print the  of the  in a separate line.
      *case 2.  Remove an element from the stack. If the stack is empty then print  in a separate line.
      *case 3.  Add Integer  to the  .
      *case 4.  Print an element at the  of the . If stack is empty print  in a seperate line.

Input Format
--------------

* Single Integer T.
* T Lines of format (Case,x(optional)).

Constraints
-------------

 1<= T <= 10^4
 0<= T <= 10^8

Output Format
---------------

* According to case Print the information explained, if its not possible then -1.

Sample Input 0
----------------

10
3 1
3 2
4
4
2
4
3 4
2
4
1

Sample Output 0
-----------------

2
2
1
1
1

 */

 import java.io.*;
 import java.util.*;
 
 public class Solution {
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
         int t = scn.nextInt();
         for(int i=0; i<t; i++){
             int caseNumber = scn.nextInt();
             
             if(caseNumber == 1){
                 //print size of stack
                 System.out.println(st.size());
             }else if(caseNumber == 2){
                 //pop ele from stack
                 if(st.size() == 0){
                     System.out.println(-1);
                 }else{
                     st.pop();
                 }
             }else if(caseNumber == 3){
                 //push ele to stack
                 st.push(x);
             }else{
                 //print top of stack
                 if(st.size() == 0){
                     System.out.println(-1);
                 }else{
                     System.out.println(st.peek());
                 }
             }
         }
     }
 } 