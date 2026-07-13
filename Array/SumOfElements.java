package Array;
import java.util.*;
public class SumOfElements {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size :");
        int size = sc.nextInt();

        int a[] = new int[size];
        int sum = 0;

        System.out.println("Enetr "+size+" elements");
        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println(sum);
   }
}
