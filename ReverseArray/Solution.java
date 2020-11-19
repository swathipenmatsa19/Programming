/*

Print array in reverse order.
Note: Try solving this using recursion. Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= N <= 100 
0 <= ar[i] <= 1018 


Output Format

Print array in reverse order.

Sample Input 0

5
2 19 8 15 4
Sample Output 0

4 15 8 19 2

*/

import java.io.*;
import java.util.*;

public class Solution {
    
    public static long[] reverseArray(long a[], int i, int j) {
        
        if(i < j) {
            long temp = a[i];
            a[i] = a[j];
            a[j] = temp;  
            reverseArray(a, ++i, --j);
        }
        
        return a;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long a[] = new long[l];
        for(int i = 0; i < l; i++) {
            a[i] = sc.nextLong();
        }
        long reverse[] = reverseArray(a, 0, l-1); 
        for(long i: reverse)
            System.out.print(i + " ");
        
    }
}




