/*


Given the length and breadth of the rectangle. Print area of the rectangle.

Input Format

Input contains two positive integers L - length of the rectangle and B - breadth of the rectangle.

Constraints

1 <= L, B <=109

Output Format

Print area of the rectangle.

Sample Input 0

5 8
Sample Output 0

40

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextInt();
        long B = sc.nextInt();
        long area = L * B;
        System.out.print(area);
    }
}




