import java.util.*;
public class P1 {
    public void pattern1(int n){
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++){
                System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        P1 obj = new P1();
        obj.pattern1(n);
}
}
/*

*****
*****
*****
*****
*****

*/