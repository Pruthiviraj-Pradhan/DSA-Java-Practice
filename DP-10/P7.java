import java.util.*;
public class P7 {
    public void pattern7(int n){

        for(int i=0; i<n; i++)
        {
            for(int j = 0; j<(n-i-1); j++){

                System.out.print(" ");
         }
        for(int k = 0; k <(2 *i + 1); k++){

            System.out.print("*");

        }
        System.out.println("");
    }
}
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        P7 obj = new P7();
        obj.pattern7(n);
        sc.close();
    }
}
/*
    *
   ***
  *****
 *******
*********
*/
