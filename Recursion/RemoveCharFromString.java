package Recursion;
import java.util.*;
public class RemoveCharFromString {
    static String nox(String s, int index){

        if(index<0) //Base Condition 
          return ""; 
        if(s.charAt(index)=='x') //RC1: if char is 'x', i.e. remove 
          return nox(s,index-1); //Recursion, ignoring char 
        else                     //RC2: if char is not 'x', i.e. it should be stored 
          return nox(s,index-1)+s.charAt(index); //recursion, store char in stack 
 } 
   
 public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  System.out.println("Enter any string:"); 
  String s = obj.nextLine(); 
  System.out.println(RemoveCharFromString.nox(s,s.length()-1));  //axbx,4-1=3 
  obj.close();
 } 
}


