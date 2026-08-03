package String;

import java.util.*;

public class StrAlternativeReverse {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        StringTokenizer st = new StringTokenizer(s);
        int i = 0;
        System.out.println(s);
        while(st.hasMoreTokens()){
            if(i%2 == 0)
                System.out.print(st.nextToken()+" ");
            else
            System.out.print(new StringBuffer(st.nextToken()).reverse()+" ");
        i++;
}
    }
}
