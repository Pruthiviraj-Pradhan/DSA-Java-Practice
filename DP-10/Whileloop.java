import java.util.*;
public class Whileloop {
    public int whileLoop(int d) {
        
        int sum=0;
        int count = 0;
        int num =1;

        while(count<50)
        {
            if(num%10==d)
            {
                sum+=num;
                count++;
            }
            num++;
        }
        return sum;
    }
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ") ; 
        int n = sc.nextInt();
        Whileloop obj = new Whileloop();
        int result = obj.whileLoop(n);
        System.out.print("Result: " + result);
        }
}