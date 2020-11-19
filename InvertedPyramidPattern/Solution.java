/*


Print hollow half inverted pyramid pattern. See example for more details.

Input Format

First line of input contains a single integer N - the size of the pyramid.

Constraints

1 <= N <= 50

Output Format

For the given integer, print hollow half inverted pyramid pattern.

Sample Input 0

5
Sample Output 0

* * * * *
*     *
*   *
* *
*


*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {  
            for(int j = 1; j <= N - i + 1; j++) {
                if(i == 1)
                    System.out.print("*" + " ");
                else {
                    if(j == 1) 
                        System.out.print("*" + " ");
                    if(j > 1 && j < N - i + 1)
                        System.out.print(" " + " ");
                    if(j != 1 && j == N - i + 1)
                        System.out.print("*");
                }
            }
            
            System.out.println();    
        }
    
    }
}









