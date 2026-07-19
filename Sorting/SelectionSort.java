package Sorting;
import java.util.*;
public class SelectionSort {
static void selectionSort(int a[]){
        int i,j,min,temp,n = a.length;
        
        for(i =0; i<n-1; i++){
            min = i;
            for(j=i+1; j<n;j++){
               if(a[j]<a[min])   //For Ascending order
               //if(a[j]>a[min]) //For Descending order
                    {
                min = j;
            }
        }
        if(min!=i)
            {
            temp = a[i];
            a[i]= a[min];
            a[min]= temp;
        }
    }
}
    public static void main(String s[]){
        int a[] =  {1,9,3,8,7,5,2,6,4}; 
        System.out.println("Before sorting==>"+ Arrays.toString(a));
        SelectionSort.selectionSort(a);
        System.out.println("After sorting==>"+ Arrays.toString(a));
    }
}
