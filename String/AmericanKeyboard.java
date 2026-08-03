package String;

import java.util.*;
public class AmericanKeyboard {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String r1 = "qwertyuiop"; 
    String r2 = "asdfghjkl"; 
    String r3 = "zxcvbnm"; 

    int c1=0,c2=0,c3=0;
    
    for(int i=0;i<s.length();i++){
        if(r1.contains(s.charAt(i)+""))
            c1++; 
        if(r2.contains(s.charAt(i)+""))
            c2++;
        if(r3.contains(s.charAt(i)+""))
            c3++;
    }
    System.out.println(c1==s.length()||c2==s.length()||c3==s.length());
    sc.close();
  }
}

