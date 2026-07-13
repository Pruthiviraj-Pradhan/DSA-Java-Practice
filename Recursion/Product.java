package Recursion;
import java.util.*;

public class Product {
    static int product(int a, int b){
        
        /*if(a>=1){
            return a*b;
        }else{
            return 1;
        }*/
         if(a<b) 
            return product(b,a); 
        else if(b!=0) 
            return a+product(a,b-1); 
        else 
            return 0; 
 }
    

public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        System.out.print(Product.product(a,b));
        sc.close();
       
    }
    
}

