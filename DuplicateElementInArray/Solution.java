/*

Find a duplicate element in the given array of integers. There will be only a single duplicate element in the array.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains size of the array - N and second line contains the elements of the array.

Constraints

2 <= N <= 100
0 <= ar[i] <= 109 


Output Format

Print the duplicate element from the given array.

Sample Input 0

6
5 4 10 9 21 10
Sample Output 0

10

*/


import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long a[] = new long[l];
        for(int i = 0; i < l; i++)
            a[i] = sc.nextLong();
        HashMap<Long,Integer> hm = new HashMap<Long, Integer>();
        for(int i = 0; i < l; i++) {
            if(hm.containsKey(a[i])) {
                int freq = hm.get(a[i]);
                freq ++;
                hm.put(a[i],freq);
                System.out.println(a[i]);
            } else
                hm.put(a[i],1);
        }
    }
}






