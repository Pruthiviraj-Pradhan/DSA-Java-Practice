package String;

import java.util.Scanner;

public class ValidGivenData {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.matches("[0123][0-9]-[01][0-9]-202[3-9]"));
        sc.close();
    }
}
