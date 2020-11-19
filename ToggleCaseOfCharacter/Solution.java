/*

Given a string, toggle case of each character in the given string.

Input Format

Input contains a string - S.

Constraints

1 <= len(S) <= 100

Output Format

Print the toggled string.

Sample Input 0

abdBd
Sample Output 0

ABDbD


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        char A[] ={'A','B','C',
                  'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char B[] = {'a', 'b', 'c', 
                   'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for(int i = 0; i < s.length(); i++ ) {
            for(int j = 0; j < 26; j++) {
                if(s.charAt(i) == A[j])
                    sb.append(B[j]);
                else if(s.charAt(i) == B[j])
                    sb.append(A[j]);
            }
        }
        
        System.out.println(sb);
    }
}








