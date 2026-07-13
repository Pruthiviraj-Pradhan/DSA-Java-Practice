/*
Input: n1 = 4, n2 = 6
Output: 2
Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6
Greatest Common divisor = 2.

*/
import java.util.*;
public class GCD {
     public int GCD(int n1, int n2) {

        /*
        int Gcd = 1;
        for(int i = 1; i<=n1; i++){
            if(n1%i ==0 && n2%i ==0){
                Gcd = i;
            }
        }
        return Gcd;*/

        //Euclidean method

        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
            
        }
        return n1 == 0 ? n2 : n1;
    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n1  = sc.nextInt();
        int n2  = sc.nextInt();

        GCD obj = new GCD();
        int result = obj.GCD(n1, n2);
        System.out.print("Output : "+result);
    }
    
}
