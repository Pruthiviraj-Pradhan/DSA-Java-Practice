package String;

import java.util.Scanner;

public class ReadStrPrintcharWithIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0; i<s.length(); i++){
        System.out.println("index="+i+" and char="+s.charAt(i));
        sc.close();
        }
    }
}
