import java.util.*;
class ForLoop {
    public int forLoop(int low, int high) {
        
        int sum = 0;
        for(int i=low; i<=high; i++)
        {  
            System.out.println("i="+i);
            sum += i;
        }
        return sum;
    }
    
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low: ");
        int low = sc.nextInt();
        System.out.print("Enter high: ");
        int high = sc.nextInt();
        ForLoop obj = new ForLoop();
       int result = obj.forLoop(low, high);
       System.out.println("Sum="+result);
       sc.close();
    }
}
