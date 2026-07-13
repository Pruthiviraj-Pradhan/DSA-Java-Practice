package Array;
import java.util.*;
public class ReadElements {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size :");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enetr "+size+" elements");
        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        //While Loop
        System.out.println("Array elements by using while loop :");
        int index = 0;
        while(index<a.length){
            System.out.println("index="+index+" a["+index+"]="+a[index]); 
            index++;
        }
        //For Loop
        System.out.println("Array elements by using for loop.."); 
        for(int i=0;i<a.length;i++) 
            { 
                System.out.println("index="+i+" a["+i+"]="+a[i]); 
            }
        //Forecah Loop
        System.out.println("Array elements by using for each loop..");
        for(int item:a)
            {
                System.out.println("item="+item);
            } 
            sc.close();
    }
}
