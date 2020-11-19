/*

Determine whether the given number is a Harshad number. A Harshad number is an integer, that is divisible by the sum of its digits.

Input Format

Input contains a integer - N.

Constraints

1 <= N <= 109

Output Format

Print "Yes" if the number is harshad number, "No" otherwise.

Sample Input 0

18
Sample Output 0

Yes
Explanation 0

18 / (1 + 8) = 2
As 18 is divisible by the sum of its digits, it is harshad number.

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int sum = 0;
        while(temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        
        if(N % sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}






