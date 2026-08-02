package String;

import java.util.Scanner;

public class ValidBikeRegnNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.matches("OD[12][0-9][A-Z]{2}[0-9]{4}"));
        sc.close();
    }
}
