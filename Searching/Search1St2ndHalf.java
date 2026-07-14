package Searching;
import java.util.*;
public class Search1St2ndHalf {
    static int binarySearch(int a[],int l,int h,int key){
    
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
              return binarySearch(a,mid+1,h,key);
            else
              return binarySearch(a,l,mid-1,key);
            }
        return -1;
    }
        public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int n = sc.nextInt();

        int i,a[] = new int[n];

        System.out.println("Enter "+n+" Elements");
        for(i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        System.out.println("Array elements after sorting: ");
        for(i = 0; i<n; i++)
            System.out.print(a[i]+" ");
        System.out.println();


        System.out.println("Enter the value to search: ");
        int key = sc.nextInt();

    
        //System.out.println(Search1St2ndHalf.binarySearch(a,0,(a.length-1)/2, key));  //For 1st half(0 to n/2)
        System.out.println(Search1St2ndHalf.binarySearch(a,(a.length-1)/2,a.length,key));  //for 2nd half(  n/2+1  to n)
        sc.close();
    }
}
