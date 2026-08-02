package String;

import java.util.*;
//import java.util.regex.*;
public class ValidATMpin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.matches("[0-9]{4}"));
        sc.close();
    }
}
