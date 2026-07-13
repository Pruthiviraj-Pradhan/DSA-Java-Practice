package Recursion;
import java.util.*;
public class DecimalToBinary {
    static int convert(int n) {

    if(n==0) 
        return 0; 
    else 
        return (n%2+10*convert(n/2));     
}
public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  int n = obj.nextInt(); 
  System.out.println(DecimalToBinary.convert(n)); 
  obj.close();
 }
}

/*
import java.util.*; 
 
class DecimalToBinary 
{ 
 static void convert(int n) 
 { 
  if(n==0) 
  { 
   System.out.print(""); 
  } 
  else 
  { 
   convert(n/2); 
   System.out.print(n%2); 
  } 
 } 
} 
 
class Test  
{ 
 public static void main(String[] args)  
 { 
  Scanner obj = new Scanner(System.in); 
  int n = obj.nextInt(); 
  DecimalToBinary.convert(n); 
 } 
}
*/