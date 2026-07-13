/*
xpix ----> x3.147x 
pip -----> 3.147p 
abc -----> abc 
ab ------> ab 
a -------> a 
*/

package Recursion;
import java.util.*;
public class ReplaceString {
    static String replacestr(String s, int index){
        if(index<1)
            return s.substring(0,index+1);
        if(s.substring(index-1,index+1).equals("pi"))
            return replacestr(s, index-2)+"3.147";
        else
            return replacestr(s, index-1)+s.charAt(index);
    }
    public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine();//very,3 
  System.out.println(ReplaceString.replacestr(s,s.length()-1)); 
 }
}
