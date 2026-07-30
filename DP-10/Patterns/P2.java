import java.util.Scanner;

public class P2 {
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<=i; j++)
            {
                System.out.print("*"+"");
            }
            System.out.println();
        }

        }
         public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            P2 obj = new P2();
            obj.pattern2(n);
            sc.close();
    }
}
/*

*
**
***
****
*****

*/