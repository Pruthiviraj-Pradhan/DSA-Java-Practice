/*

Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

*/

import java.util.*;
public class Armstrong {
    public boolean isArmstrong(int n) {

        int sum =0;
        int dup = n;
        
        while(n>0){
        int ld = n%10; 
        sum = sum + (ld*ld*ld);
        n = n/10;
    }
    return sum == dup;
}
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        Armstrong obj = new Armstrong();
        boolean result = obj.isArmstrong(n);
        System.out.print("Output : "+result);
        sc.close();
    }
}
