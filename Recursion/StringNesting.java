/*
"()" ----> true
"(())" --> true 
"((((" --> false 
*/
package Recursion;
import java.util.*;
public class StringNesting {
    static boolean newS(String s,int i, int j ){
        if(i>j)
            return true;
        if(s.charAt(i)=='(' && s.charAt(j)==')')
            return newS(s, i+1, j-1);
        else
            return false;
    }
    public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine(); 
  System.out.println(StringNesting.newS(s,0,s.length()-1));
  obj.close(); 
 }
}
