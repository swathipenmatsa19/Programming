/*


Print pyramid pattern. See example for more details.

Input Format

First line of input contains a single integer N - the size of the pyramid.

Constraints

1 <= N <= 50

Output Format

For the given integer, print pyramid pattern.

Sample Input 0

5
Sample Output 0

    *
   ***
  *****
 *******
*********



*/




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <=N; i++) {
            for(int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i + count; k++) {
                System.out.print("*");
            }
            count ++;
            System.out.println();
        }
    }
}











