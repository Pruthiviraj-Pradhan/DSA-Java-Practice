import java.util.*;
public class P9 {
    public void pattern9(int n){

    //Upper half pyramid
        for(int i=0; i<n; i++)
        {
            for(int j = 0; j<(n-i-1); j++){

                System.out.print(" ");
         }
        for(int k = 0; k <(2 * i + 1); k++){

            System.out.print("*");

        }
        System.out.println("");
    }
    //Lower half pyramid
    for(int i=n-1; i>=0; i--)
        {
            for(int j = 0; j<(n-i-1); j++){

                System.out.print(" ");
         }
        for(int k = 0; k <(2 * i + 1); k++){

            System.out.print("*");

        }
        System.out.println("");
    }
}
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        P9 obj = new P9();
        obj.pattern9(n);
        sc.close();
    }
}

/*
    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
