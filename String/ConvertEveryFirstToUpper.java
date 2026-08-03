package String;

import java.util.*;
public class ConvertEveryFirstToUpper {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer sb = new StringBuffer();
    
        System.out.println(s);
        while(st.hasMoreTokens()){
            String ss = st.nextToken();
            sb.append(ss.substring(0,1).toUpperCase()+ss.substring(1));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
