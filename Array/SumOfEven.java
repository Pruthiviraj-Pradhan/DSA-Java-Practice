package Array;
import java.util.*;
public class SumOfEven {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size :");
        int size = sc.nextInt();

        int a[] = new int[size];
    
        System.out.println("Enetr "+size+" elements");
        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
            int sum = 0;
            for(int i=0; i<a.length;i++){
                if(a[i]%2 == 0){
                    sum = sum + a[i];
                }
        }
        System.out.println("Sum of even numbers: " + sum);
        sc.close();
    }
}

