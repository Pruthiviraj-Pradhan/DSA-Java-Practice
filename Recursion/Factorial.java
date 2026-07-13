package Recursion;
import java.util.*;

public class Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.print(Factorial.fact(n));
    }
    
}
