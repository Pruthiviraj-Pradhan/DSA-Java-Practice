package String;

import java.util.Scanner;

public class ValidEmailId {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));
        sc.close();
    }
}
