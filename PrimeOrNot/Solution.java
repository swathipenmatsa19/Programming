/*

Given a positive integer - N. Check whether the number is prime or not.

Input Format

Input contains positive integer - N.

Constraints

1 <= N <= 109

Output Format

Print "Yes" if the number is prime, "No" otherwise.

Sample Input 0

11
Sample Output 0

Yes

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        if(N == 1)
            System.out.println("No");
        else {
        for(i = 2; i <= N / 2; i++) {
            if(N % 2 == 0)
                break;
        }
        if(i >= N/2)
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }
}




