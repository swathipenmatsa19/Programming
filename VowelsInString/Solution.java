/*



Given a string, check if it contains only vowels.

Input Format

Input contains a string of lowercase and uppercase characters- S.

Constraints

1 <= len(S) <= 100

Output Format

Print "Yes" if string contains only vowels, "No" Otherwise.

Sample Input 0

askhtwsflk
Sample Output 0

No


*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char vowels[] = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String S = sc.nextLine();
        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < 10; j++) {
                if(S.charAt(i) == vowels[j]) {
                    count ++;
                }
            }
        }
        
        if(count == S.length())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}










