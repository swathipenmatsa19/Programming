/*

Given two integers a and b. compute a power b.

Input Format

Input contains two positive integers a and b.

Constraints

1 <= a <=100 
0 <= b <=9

Output Format

Print a power b.

Sample Input 0

2 3
Sample Output 0

8

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long power = 1;
        if(b == 0)
            System.out.print(1);
        else {
            for(int i = 1; i <= b; i++)
                power = power * a;
            System.out.print(power);
        }
    }
}






