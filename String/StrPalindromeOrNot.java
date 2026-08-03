package String;

public class StrPalindromeOrNot {
    public static void main(String[] args)
    {
        String s = "madam";
        String ss = new StringBuffer(s).reverse().toString();
        System.out.println(s.equals(ss));//true 
   }
}
