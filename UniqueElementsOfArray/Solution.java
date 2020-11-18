/*

Print unique elements of the array in the same order as they appear in the input. 
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains a single integer N - the size of array and second line contains array elements.

Constraints

1 <= N <= 100
0 <= ar[i] <= 109 


Output Format

Print unique elements of the array.

Sample Input 0

7
5 4 10 9 21 4 10
Sample Output 0

5 9 21

*/

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a[] = new int[l];
        for(int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new LinkedHashMap<Integer, Integer>();
        for(int i = 0; i < l; i++) {
            if(hm.containsKey(a[i])) {
                int freq = hm.get(a[i]);
                freq ++;
                hm.put(a[i], freq);
            }
            else 
                hm.put(a[i], 1);
        }
        
        for(Entry<Integer,Integer> val : hm.entrySet()) {
            if(val.getValue() == 1)
                System.out.print(val.getKey() + " ");
        }
    }
}



