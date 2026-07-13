package Array;
/*
version 1 - Sort the element in ascending order
version 2 - sort the element in descending order
version 3 - sorting an array by using predefined classes(Arrays.sort(a))
version 4 - sorting by using predefined only but desc
version 5 - customized sorting
*/
import java.util.*;
public class SortElements {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr array size: ");
        int i,j,t,n = sc.nextInt();

        int a[]= new int[n];
        System.out.println("Enter "+n+" Elemnts");
        for(i = 0; i<n; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Array elments before Sorting: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        /* Version 1
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
    }*/
        /*Version 2
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
    }*/
        /*Version 3==>using predefined class
        Arrays.sort(a);*/

        /*Version 4 ==> by using predefined methods ASC(Reverse)
        Arrays.sort(a);
        System.out.println();
        System.out.println("Array elements after Sorting:");
        for(i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");*/
        
        //version 5==>by using customized sorting
        //Arrays.sort(a,0,n/2);//starting location
        Arrays.sort(a,n/2,n); //ending location


   System.out.println();
    System.out.println("Array elements after Sorting:");
    for(i = 0; i<n; i++){
        System.out.print(a[i]+" ");
    }
  }
}
