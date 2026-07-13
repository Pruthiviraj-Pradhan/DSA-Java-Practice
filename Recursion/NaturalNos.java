package Recursion;
import java.util.*;

public class NaturalNos {
    static void print(int n){
        if(n>=1){
            print(n-1);
            System.out.print(n+" "); //1,2,3,4......n
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NaturalNos.print(n);
    }
}
