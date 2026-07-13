package Recursion;
import java.util.*;
public class HCF {
    static int hcf(int a, int b){

        while(a!=b){
            if(a>b){
                return hcf(a-b,b);
            }else{
                return hcf(a,b-a);
            }
        }
        return a;
        //return b;
    }
    public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter a value:"); 
  int a=obj.nextInt(); 
  System.out.println("Enter b value:"); 
  int b=obj.nextInt(); 
  System.out.print(HCF.hcf(a,b));
  obj.close();
 }
    
}
