/*
Input: n = 14
Output: 2
Explanation: There are 2 digits in 14.

Time complexity = O(logbase10(n))
*/

import java.util.Scanner;

 class CountDigit {
    public int countDigit(int n) {

        int count = 0;

        while(n>0){
        n = n / 10;
        count++;
        }
        return count;

        /*
        
        if (n == 0) {
            return 1;
        }
        return (int) Math.log10(n) + 1;

        */
        
    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CountDigit obj = new CountDigit();
        int result = obj.countDigit(n);
        System.out.println("Output: " + result);
    }
}

