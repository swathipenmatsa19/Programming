/*

Print sum of all odd elements in an array.

Input Format

Input contains 2 lines, first line contains integer N - the size of the array and second line contains array elements.

Constraints

1 <= N <= 102 
-106 <= ar[i] <= 106 


Output Format

Print sum of all odd elements.

Sample Input 0

5
6 9 8 4 3
Sample Output 0

12

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long a[] = new long[l];
        for(int i = 0; i < l; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for(int i =0; i < l; i++) {
            if(a[i]%2 != 0) {
                sum += a[i];
            }
        }
        System.out.print(sum);
    }
}








