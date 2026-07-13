import java.util.*;
public class P6 {
     public void pattern6(int n) {

        for(int i = n; i>=1; i--)
        {
            for(int j=1; j<=i; j++){

                System.out.print(j);
        }
        System.out.println("");
    }
     }
     public static void main(String s[])
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
    
        P6 obj = new P6();
        obj.pattern6(n);
    }
    
}
/*

12345
1234
123
12
1

*/
