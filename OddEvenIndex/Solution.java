/*


Given a String, print all the letters present at odd index followed by the letters present at even index.

Input Format

Input contains a string - S.

Constraints

1 <= len(S) <= 100

Output Format

Print letters present at odd index followed by the letters present at even index.

Sample Input 0

afdg5tg
Sample Output 0

fgtad5g

*/



import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i = i + 2) {
            sb.append(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i = i + 2) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        
    }
}







