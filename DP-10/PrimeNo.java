/*
Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

*/
import java.util.*;

public class PrimeNo {
    public boolean isPrime(int n) {
        
        /*if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;*/

         int f = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                f++;
            }
        }
        return f == 2;
    }
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeNo obj = new PrimeNo();
        boolean result = obj.isPrime(n);
        System.out.print("Output : " + result);
    }
}




/*import java.util.*;
public class PrimeNo {
    public boolean isPrime(int n) {
          
    // first pass: count divisors
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

     // create array and prepare to fill from both ends
        int[] result = new int[count];
        int left = 0;
        int right = count - 1;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result[left] = i;
                left++;

                if (n / i != i) {
                    result[right] = n / i;
                    right--;
                }
            }
        }

        return count == 2;
    }

    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeNo obj = new PrimeNo();
        boolean  result = obj.isPrime(n);
        System.out.print("Output : " +result);
    }
}*/