/*


Given an integer - N, the letter 'o' must repeat for N times in the word Go...od.

Input Format

Input contains an integer - N.

Constraints

0 <= N<= 100

Output Format

Print the word Go..od with letter 'o' repeating for N times.

Sample Input 0

4
Sample Output 0

Gooood


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("G");
        for(int i = 1; i <= N; i++)
            sb.append("o");
        sb.append("d");
        System.out.println(sb);
    }
}










