package Sorting;
import java.util.*;
public class BubbleSort {
    static void bubbleSort(int a[]){
        int i,j,t;
        for(i = 0; i<a.length-1; i++){
            //bubble sort
        for(j =0;j<a.length-i-1; j++)
            {
            //if(a[j]>a[j+1])  //For Ascending Order
            if(a[j]<a[j+1])    //For Descending Order
                {
                t = a[j];
                a[j]= a[j+1];
                a[j+1]=t;
            }
        }
    }
}
    public static void main(String s[]){
        int a[] =  {1,9,3,8,7,5,2,6,4}; 
        System.out.println("Before sorting==>"+ Arrays.toString(a));
        BubbleSort.bubbleSort(a);
        System.out.println("After sorting==>"+ Arrays.toString(a));
    }
}
