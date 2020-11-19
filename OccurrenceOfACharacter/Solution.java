/*



Given a sentence and a character, count occurrence of the given character in the sentence. All characters in the sentence are lower case.

Input Format

First line of input contains a sentence - S and second line of input contains a lowercase character - ch.

Constraints

1 <= len(S) <= 100
'a' <= ch <= 'z'

Output Format

Print count of the given character in the sentence.

Sample Input 0

You're a good person.
o
Sample Output 0

4


*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch =  sc.next().charAt(0);
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            if(hm.containsKey(c)) {
                int freq = hm.get(c);
                freq ++;
                hm.put(c, freq);
            } else
                hm.put(c, 1);
        }
        
        if(hm.containsKey(ch))
            System.out.print(hm.get(ch));
        else
            System.out.print('0');
            
    }
}










