/*


Implement binary search. Given a sorted array, search key in the array. If key not found print "false", otherwise print "true".

Input Format

First line of input contains two integers N and K. N is the size of array and K is the key. Second line contains array elements.

Constraints

1 <= N <= 102 
0 <= ar[i] <= 109

Output Format

Print "true" if key is present in the array. Otherwise, print false.

Sample Input 0

5 19
2 19 23 35 38
Sample Output 0

true

*/



import java.io.*;
import java.util.*;

public class Solution {
    public static boolean binarySearch(int a[], int s, int e, int k) {
        int mid = s + (e - s ) / 2;
        
        if(s <= e) {
        if(k == a[mid])
            return true;
        else if(a[mid] > k)
            return binarySearch(a, s, mid - 1, k);
        else if(a[mid] < k)
            return binarySearch(a, mid + 1, e, k); 
        }
        
        return false;
    
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        System.out.println(binarySearch(a,0,N-1,K));
    }
}

















