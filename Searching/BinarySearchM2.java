package Searching;
import java.util.*;
public class BinarySearchM2 {
    /*static int binarySearch(int a[], int key){
        int l=0, h = a.length-1, mid;
        while(l<=h){
            mid = (l+h)/2;
            if((a[mid]==key))
                return mid;
            else if(key<a[mid])
                h = mid -1;
            else
                l = mid +1;
        }
        return -1;
    }*/
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {10, 34, 23, 22, 56, 65, 77, 78, 87, 99};
        Arrays.sort(a); 
        System.out.println("Array="+Arrays.toString(a));
        System.out.println("Enetr key element to search: ");
        int key = sc.nextInt();
        //System.out.println(BinarySearchM2.binarySearch(a,key));
        System.out.println(BinarySearchM2.binarySearch( a,0,a.length-1,key));
        sc.close();
    }
}

