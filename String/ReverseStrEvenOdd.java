package String;

import java.util.*;

public class ReverseStrEvenOdd {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer sb = new StringBuffer();
    
        System.out.println(s);
        while(st.hasMoreTokens()){
            String ss = st.nextToken();
            if(ss.length()%2 == 0)
                sb.append(new StringBuffer(ss).reverse());
                else
                    sb.append(ss);
                sb.append(" ");
            }
            System.out.println(sb);
        }
   }

