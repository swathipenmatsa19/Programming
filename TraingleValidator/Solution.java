/*

Given sides of a triangle, check whether the triangle is valid.

Input Format

Input contains three integers A, B, C - Sides of the triangle.

Constraints

1 <= A, B, C <= 109

Output Format

Print "Yes" if you can construct a triangle with the given three sides, "No" otherwise.

Sample Input 0

4 3 5
Sample Output 0

Yes

*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        if((A + B > C) && (A + C > B) && (B + C > A))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}




