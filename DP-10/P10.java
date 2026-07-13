import java.util.*;
public class P10 {
     public void pattern10(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        }

         public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            P10 obj = new P10();
            obj.pattern10(n);
    }
}

/*

*
**
***
****
*****
****
***
**
*

*/