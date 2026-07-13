package Recursion;
import java.util.*;

public class Power {
    static int power(int a, int b){

        if(b>=1){
            return a*power(a,b-1);
        }else{
            return 1;
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        System.out.print(Power.power(a,b));
       sc.close();
    }
    
}
