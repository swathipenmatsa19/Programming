/*

Find maximum element from the given array of integers.

Input Format

First line of input contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= N <= 103 
-109 <= ar[i] <= 109

Output Format

Print the maximum element of array.

Sample Input 0

5
-2 -19 8 15 4
Sample Output 0

15

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long a[] = new long[l];
        for(int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        long max = a[0];
        for(int i = 0; i < l; i++) {
            if(a[i] > max)
                max = a[i];
        }
        
        System.out.println(max);
    }
}
