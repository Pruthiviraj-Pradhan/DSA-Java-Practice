package Recursion;
import java.util.Scanner;
public class RevString {
    static String revstring(String s){

        if(s==null || s.length()<=1)//BC
        return s;
        return revstring(s.substring(1))+s.charAt(0); 
      }  
 public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any String:"); 
  String s = obj.nextLine(); 
  System.out.println(RevString.revstring(s)); 
 } 
}

