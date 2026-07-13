/*

Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.

*/

import java.util.*;
public class Reverse {
    public int reverseNumber(int n){


        int revN=0;

        while(n>0){
        int ld=n%10;
        n = n/10;
        revN= (revN*10)+ld;
        }
        return revN;

    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        Reverse obj = new Reverse();
        int result = obj.reverseNumber(n);
        System.out.print("Output : "+result);
    }
    
}
