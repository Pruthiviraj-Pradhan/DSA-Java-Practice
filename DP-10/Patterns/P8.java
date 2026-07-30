import java.util.*;
public class P8 {
    public void pattern8(int n){

        for(int i=n-1; i>=0; i--)
        {
        //print leading spaces
            for(int j = 0; j<(n-i-1); j++){

                System.out.print(" ");
         }
         //print stars
        for(int k = 0; k <(2 * i + 1); k++){

            System.out.print("*");

        }
        System.out.println("");
    }
}
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        P8 obj = new P8();
        obj.pattern8(n);
        sc.close();
    }
}
/*
*********
 *******
  *****
   ***
    *
*/