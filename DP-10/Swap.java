/*
Logic1: using temp variable
 temp = a; 
  a = b; 
  b = temp;

Logic2: without temp variable using add and sub
  a = a + b; 
  b = a - b; 
  a = a - b; 

Logic3: without temp variable using mul and div
  a = a * b; 
  b = a / b; 
  a = a / b;  

Logic4: without using temp variable using bitwise operators
  a = a ^ b; 
  b = a ^ b; 
  a = a ^ b; 

Logic5: without using temp variable by using single line 
  a = (a+b) - (b=a);  
*/

import java.util.*;
public class Swap {
    static void swaping(int n1, int n2){

        System.out.println("Before swap n1 ="+n1+" and n2 = "+n2);
        //Logic 1
        /*int t; 
        t = n1;
        n1 = n2;
        n2 = t;*/

        //Logic 2
        /*n1 = n1 + n2;
        n2 = n1-n2;
        n1 = n1 - n2;*/

        //Logic 3
        /*n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;*/

        //logic 4
        /*n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;*/

        //Logic 5
        n1 = (n1+n2) - (n2=n1);  


        System.out.println("After swap n1 ="+n1+" and n2 = "+n2);
        
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        Swap.swaping(n1,n2);
    
    }
    
}


