/*

Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.

*/

import java.util.*;
public class Divisors {
    public int[] divisors(int n) {

        //first count how many divisors exist
        int count = 0;
        for(int i =1; i<=n; i ++){
            if(n%i == 0)
            {
                count++;
            }
        }
        //now, create an array of right size to fill it
        int [] result = new int[count];
        int index = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                result[index]=i;
                index++;
            }
        }
        return result;
        
    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        Divisors obj = new Divisors();
        int[] result = obj.divisors(n);
        System.out.print("Output : "+Arrays.toString(result));
        sc.close();
    }
    
}

/*optimal approach

import java.util.*;
public class Divisors {
    public int[] divisors(int n) {
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

        return result;
    }

    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Divisors obj = new Divisors();
        int[] result = obj.divisors(n);
        Arrays.sort(result);
        System.out.print("Output : " + Arrays.toString(result));
    }
}
*/
