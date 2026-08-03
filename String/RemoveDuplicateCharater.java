package String;

import java.util.*;

public class RemoveDuplicateCharater {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ss = "";
        for(int i=0;i<s.length();i++)
            {
                if(ss.indexOf(s.charAt(i))<0)
                    ss=ss+s.charAt(i);
                }
                System.out.println(ss);
                obj.close();
            }
        }
