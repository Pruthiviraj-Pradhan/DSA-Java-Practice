package Sorting;
import java.util.*;
public class QuickSort {
    static void quickSort(int a[],int lIndex,int hIndex){
        if(lIndex>=hIndex)
            return;
        int pivot,lp,rp,temp;

        pivot = a[hIndex];
        lp = lIndex;
        rp = hIndex;

        while(lp<rp){
            /*
            while(a[lp]<=pivot && lp<rp)
                lp++;
            while(a[rp]>=pivot && lp<rp)
                rp--; 
            */                //For Ascending Order
            while(a[lp]>=pivot && lp<rp)
                lp++;
            while(a[rp]<=pivot && lp<rp)
                rp--;         //For Descending Order
            temp = a[lp];
            a[lp]=a[rp];
            a[rp]=temp;
        }
        temp = a[lp];
        a[lp]=a[hIndex];
        a[hIndex]=temp;

        quickSort(a, lIndex, lp-1);
        quickSort(a, lp+1, hIndex);
    }
    public static void main(String s[]){
        Random r = new Random();
        int a[] = new int[10];
        for(int i = 0; i<a.length;i++)
            a[i] = r.nextInt(100);
        System.out.println("Before sorting==>"+ Arrays.toString(a));
        QuickSort.quickSort(a,0,a.length-1);
        System.out.println("After sorting==>"+ Arrays.toString(a));
    }
}
