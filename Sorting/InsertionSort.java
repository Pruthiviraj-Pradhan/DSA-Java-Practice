package Sorting;
import java.util.*;
public class InsertionSort {
    static void insertionSort(int a[]){
        int i,j,temp,n=a.length;

        for(i=1;i<n;i++){
            temp = a[i];
            j = i - 1;
           // while(j>=0 && a[j]>temp)  //For Ascending Order
             while(j>=0 && a[j]<temp)   //For Descending Order
                {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    public static void main(String s[]){
        Random r = new Random();
        int a[] = new int[10];
        for(int i = 0; i<a.length;i++)
            a[i] = r.nextInt(100);
        System.out.println("Before sorting==>"+ Arrays.toString(a));
        InsertionSort.insertionSort(a);
        System.out.println("After sorting==>"+ Arrays.toString(a));
    }
}
