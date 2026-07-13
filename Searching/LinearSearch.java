package Searching;
import java.util.*;
public class LinearSearch {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size :");
        int i,n = sc.nextInt();

        int a[] = new int[n];
    
        System.out.println("Enetr "+n+" elements");
        for( i = 0; i<n; i++){
            a[i]=sc.nextInt();
        }
            System.out.println("Enter the element to search: ");
            int key = sc.nextInt();

            int index = -1;
            for(i = 0; i<n; i++){
                if(key == a[i]){
                    index = i;
                    break;
                }
            }
            System.out.print(index); 
            sc.close();
   }
}
