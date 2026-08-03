package String;
import java.util.*;
public class RotateString {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ss = obj.nextLine();
        System.out.println((s+s).contains(ss)); 
        obj.close();
 }
}
