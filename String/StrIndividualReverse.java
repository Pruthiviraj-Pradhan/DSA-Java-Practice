package String;

import java.util.*;

public class StrIndividualReverse {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
            System.out.println(new StringBuffer(st.nextToken()).reverse()+" ");
    }
}
