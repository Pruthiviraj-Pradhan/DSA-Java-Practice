/*

Input: n = 121
Output: true
Explanation: When read from left to right : 121.
When read from right to left : 121.

*/

import java.util.*;
public class Palindrome {
    public boolean isPalindrome(int n) {

        int revN=0;
        int dup = n;
        
        while(n>0){
        int ld=n%10;
        n = n/10;
        revN= (revN*10)+ld;
        }
        return revN == dup;
    }
public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        Palindrome obj = new Palindrome();
        boolean result = obj.isPalindrome(n);
        System.out.print("Output : "+result);
        sc.close();
    }
    
}

