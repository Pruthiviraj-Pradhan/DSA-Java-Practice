package Array;
import java.util.*;
public class ReplaceIndex {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();

        int i, a[]= new int[size];

        System.out.println("Enter "+size+" elements");
        for(i = 0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements Before Update: ");
        for(i = 0 ; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        //logic
        int index,newe;
        System.out.println("Enter index value: ");
        index = sc.nextInt();

        if(index>=0 && index<a.length){
            System.out.println("Enter new element");
            newe = sc.nextInt();
            a[index]=newe;
        }else{
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Array Elements after Update: ");
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
