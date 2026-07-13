/*
abc ----> abc 
hello --> hel*lo 
xxyy ---> x*xy*y 
*/
package Recursion;
import java.util.*;
public class Separated2 {
    static String newS(String s, int index){
        if(index<1)
            return s.substring(0,index+1);
        if(s.charAt(index-1)==s.charAt(index))
            return newS(s,index-1)+"*"+s.charAt(index);
        else
            return newS(s, index-1)+s.charAt(index);
    }
    public static void main(String[] args)  
{ 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine(); 
  System.out.println(Separated2.newS(s,s.length()-1));
}
}
