package Recursion;
import java.util.*;
public class LCM {
    static int com = 1;
    static int lcm(int n1, int n2){

        if(com%n1 == 0 && com%n2 == 0){
            return com;
        }else{
            com++;
            lcm(n1,n2);
        }
        return com;
    }
    public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter n1 value:"); 
  int n1=obj.nextInt(); 
  System.out.println("Enter n2 value:"); 
  int n2=obj.nextInt(); 
  System.out.print(LCM.lcm(n1,n2));
 }
    
}
