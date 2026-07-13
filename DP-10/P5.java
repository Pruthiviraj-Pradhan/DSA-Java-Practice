import java.util.Scanner;

public class P5 {
     public void pattern5(int n) {
        
        for(int i=n;i>=1;i--){
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

            P5 obj = new P5();
            obj.pattern5(n);
    }

    }

/*

*****
****
***
**
*

*/


