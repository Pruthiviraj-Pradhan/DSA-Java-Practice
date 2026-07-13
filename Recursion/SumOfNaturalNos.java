package Recursion;
import java.util.*;

public class SumOfNaturalNos {
    static int sum(int n){
        if(n == 1){
            return 1;
        }else{
            return n+sum(n-1);
        }
     }
        public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(SumOfNaturalNos.sum(n));
            sc.close();
    }
}
    

