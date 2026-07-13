package Recursion;
import java.util.*;
public class SumOfDigit {
    static int sum(int n){

        if(n==0){
            return 0;
        }else{
            return (n%10)+sum(n/10);
        }
    }
public static void main(String s[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print(SumOfDigit.sum(n));
    }
    
}

