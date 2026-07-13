/*
'x' --------> 'y' 
"codex" ----> "codey" 
"xxhixx" ---> "yyhiyy" 
"xbix" -----> "ybiy" 
*/
package Recursion;
import java.util.*;
public class OldChToNewCh {
    static String replace(String s, int index){

        if(index<0)
            return "";
        if(s.charAt(index)=='x')
            return replace(s, index-1)+"y";
        else
            return replace(s, index-1)+s.charAt(index);
    }
    public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine(); 
  System.out.println(OldChToNewCh.replace(s,s.length()-1)); 
  obj.close();
 }
}
