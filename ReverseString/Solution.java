/*

Given a string, reverse the given string.

Input Format

Input contains a String - S.

Constraints

1 <= len(s) <= 100

Output Format

Print the reversed string.

Sample Input 0

fdsrd

Sample Output 0

drsdf

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rs = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            rs.append(s.charAt(i));
        }
        System.out.print(rs);
    }
}









