package Recursion;
import java.util.*;
public class PrimeNo {
    static boolean prime(int n, int i){

        if(i ==1){
            return true;

        }else if(n%i==0){
            return false;
        }else{
            return prime(n,--i);
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print(PrimeNo.prime(n,n/2));
    }
    
}
