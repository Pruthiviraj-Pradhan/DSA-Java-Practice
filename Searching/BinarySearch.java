package Searching;
//Normal Implementation
import java.util.*;
public class BinarySearch {
    static int binarySearch(int a[], int key){
        int l=0, h = a.length-1, mid;

        while(l<=h){
            mid = (l+h)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
                l = mid + 1;
            else
                h = mid - 1;
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
        System.out.println("Enter the value to search: ");
        int key = sc.nextInt();

        Arrays.sort(a);
        System.out.println(BinarySearch.binarySearch(a, key));
        sc.close();
    }
}



/* Recursive

import java.util.*;
public class BinarySearch {
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
        System.out.println("Enter the value to search: ");
        int key = sc.nextInt();

        Arrays.sort(a);
        System.out.println(BinarySearch.binarySearch(a,0,a.length-1, key));
        sc.close();
    }
}
*/
