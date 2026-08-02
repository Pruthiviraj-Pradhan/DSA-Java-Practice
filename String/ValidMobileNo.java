package String;

import java.util.*;
//import java.util.regex.*;
public class ValidMobileNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.matches("[6-9][0-9]{9}"));
        sc.close();
    }
}
