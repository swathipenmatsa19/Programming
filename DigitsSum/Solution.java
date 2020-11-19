/*


Given non-negative integer - N, print the sum of digits of the given number.

Input Format

Input contains non-negative integer - N.

Constraints

0 <= length(N) <= 103

Output Format

Print the sum of digits of the given number.

Sample Input 0

164
Sample Output 0

11

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        } 
        System.out.print(sum);     
    }
}


