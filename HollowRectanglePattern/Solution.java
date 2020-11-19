/*


Print hollow rectangle pattern using '*'. See example for more details.

Input Format

Input contains two integers W and L. W - width of the rectangle, L - length of the rectangle.

Constraints

2 <= W <= 50 2 <= L <= 50

Output Format

For the given integers W and L, print the hollow rectangle pattern.

Sample Input 0

5 4
Sample Output 0

*****
*   *
*   *
*****


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int L = sc.nextInt();
        for(int i = 1; i <= L; i++) {
            if(i == 1 || i == L) {
                for(int j = 1; j <= W; j++) 
                    System.out.print("*");
            }
            else {
                for(int j = 1; j <= W; j++) {
                    if(j == 1 || j == W) 
                        System.out.print("*"); 
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}









