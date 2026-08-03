package String;

import java.util.*;

public class ChessBoard {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        int x = s.charAt(0)-96;
        int y = s.charAt(1);
        System.out.println((x+y)%2!=0); 
        
        obj.close();
   } 
}
