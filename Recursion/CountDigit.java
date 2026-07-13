package Recursion;
import java.util.*;
public class CountDigit {

    static int c = 0;
    static int count(int n){

        if(n!=0){
            c++;
           return count(n/10);
        }else{
            return (c!=0) ? c : 1;//for 0 = 1
            //return c then for 0 it counts 0 only
            
        }
    }
    public static void main(String[] args)  
    { 
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.print(CountDigit.count(n));
    
   }
}
