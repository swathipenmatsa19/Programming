/*

Given a string, check if it contains only digits.

Input Format

Input contains a string - S.

Constraints

1 <= len(S) <= 100

Output Format

Print "Yes" if string contains only digits, "No" otherwise.

Sample Input 0

123456786543
Sample Output 0

Yes

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char digits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < 10; j++) {
                if(S.charAt(i) == digits[j]) {
                    count ++;
                }
            }
        }
        if(count == S.length()) {
            System.out.print("Yes");
        }
        else
            System.out.print("No");
    }
}













