
/* 

----------------------------------
Print the array elements linewise
----------------------------------

Take n as an integer input. Declare an array of size n that stores value of int data-type.
Then take n integer inputs and store them in the array one by one.
And print each integer in each line.

Input Format
-------------
Array length n n numbers

Constraints
------------
1<=arr.length<=1000000 1<=arr[i]<=1000000

Output Format
--------------
Print the array element in different line.

Sample Input 0
----------------
5
1
2
3
4
5

Sample Output 0
----------------
1
2
3
4
5

Explanation 0
---------------
given size of array n. we store all 5 elements in the array. And printed them in different line in given format.

*/
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}