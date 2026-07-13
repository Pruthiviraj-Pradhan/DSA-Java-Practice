package Recursion;
import java.util.*;
public class Reverse {
    static int reverse(int n, int len ){
        
        if(n==0){
            return 0;
        }else{
            return ((n%10)*(int)Math.pow(10,len-1)) + reverse(n/10,--len); 
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print(Reverse.reverse(Integer.parseInt(n), n.length()));
        sc.close();
    }
    
}
