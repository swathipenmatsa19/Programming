/*



Given a string, print count of vowels and consonants of the string.

Input Format

Input contains a string of upperscase and lowercase characters - S.

Constraints

1 <= len(S) <= 100

Output Format

Print count of vowels and consonants for the given string, separated by space.

Sample Input 0

abxbbiaaspw
Sample Output 0

4 7

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int v = 0;
        int c = 0;
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                v ++;
            else
                c++;
                
        }
        System.out.print(v + " " + c);
    }
}











