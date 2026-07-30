import java.util.*;
public class P11 {
    public void pattern11(int n){

        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++)
            {
                int val = (i+j+1)%2;
                System.out.print(val + " ");

            }
            System.out.println();
        }
    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        P11 o = new P11();
        o.pattern11(n);
        sc.close();
    }
}

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

*/
