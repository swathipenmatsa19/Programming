/*


Print multiplication table for given integer - N.

Input Format

Input contains integer - N.

Constraints

-105 <= N <= 105

Output Format

Print multiplication table.

Sample Input 0

9
Sample Output 0

9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
9 * 10 = 90


*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = "+ (N * i));
        }
    }
}






