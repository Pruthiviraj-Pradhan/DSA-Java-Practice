package Sorting;
import java.util.*;
public class ShellSorting {
    static void shellSort(int[] a,int n){
        int i,j,gap,temp;
        for(gap=n/2;gap>=1;gap = gap/2)
            {
            for(j=gap;j<n;j++)
                {
                    for(i=j-gap;i>=0;i=i-gap){
                //if(a[i+gap]>a[i])    //For Ascending order
                if(a[i+gap]<a[i])      //For Descending order
                    break;
                else{
                    temp = a[i+gap];
                    a[i+gap]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}
    public static void main(String s[])
    {
        Random r = new Random();
        int a[] = new int[10];
        for(int i = 0; i<a.length;i++)
            a[i] = r.nextInt(100);

        System.out.println("Before sorting==>"+ Arrays.toString(a));
        ShellSorting.shellSort(a,a.length);
        System.out.println("After sorting==>"+ Arrays.toString(a));
    }
}
