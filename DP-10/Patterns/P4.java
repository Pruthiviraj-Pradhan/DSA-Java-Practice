import java.util.Scanner;

public class P4 {
    public void pattern4(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        }
         public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            P4 obj = new P4();
            obj.pattern4(n);
            sc.close();
    }
}

/*

1
22
333
4444
55555

*/
    

