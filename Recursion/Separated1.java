/*
"hello" ----> "h*e*l*l*o" 
"abc" ------> "a*b*c" 
"ab" -------> "a*b"
*/

package Recursion;
import java.util.*;
public class Separated1 {
    static String newS(String s, int index){
        if(index<1)
            return s.substring(0,index+1); 
        return newS(s,index-1)+"*"+s.charAt(index);
    }
public static void main(String[] args)  
{ 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine(); 
  System.out.println(Separated1.newS(s,s.length()-1));
}
}
