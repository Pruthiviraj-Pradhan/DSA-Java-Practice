package Array;
import java.util.*;
public class MaxMin { 
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size :");
        int size = sc.nextInt();

        int a[] = new int[size];
        int max, min;
    
        System.out.println("Enetr "+size+" elements");
        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        max = a[0];
        for(int i = 1; i<a.length; i++)
            {
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println("max=" +max);

            min = a[0];
        for(int i = 1; i<a.length; i++)
            {
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("min=" +min);
    }
}




