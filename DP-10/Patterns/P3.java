import java.util.*;
public class P3 {
     public void pattern3(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        }
         public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            P3 obj = new P3();
            obj.pattern3(n);
            sc.close();
    }
}

/*

1
12
123
1234
12345

*/