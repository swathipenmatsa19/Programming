/*

Implement linear search. Given an array, search key in the array. If key not found print "-1", otherwise print the index of the array.

Input Format

First line of input contains two integers N and K. N is the size of array and K is the key. Second line contains array elements.

Constraints

1 <= N <= 102 
0 <= ar[i] <= 109

Output Format

print the index of key.

Sample Input 0

5 15
-2 -19 8 15 4

Sample Output 0

3

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a[] = new int[N];
        int index = -1;
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if(a[i] == K)
                index = i;
        }
        System.out.println(index);
    }
}










