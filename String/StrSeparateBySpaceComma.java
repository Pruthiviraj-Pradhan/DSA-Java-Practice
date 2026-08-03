package String;
import java.util.*;
//import java.util.regex.*;
public class StrSeparateBySpaceComma {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
