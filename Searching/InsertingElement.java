package Searching;
import java.util.Arrays;

/* For last position
public class InsertingElement {
    static int[] insertAtLast(int a[], int element) {

        int i, b[] = new int[a.length + 1];
        b[0] = element;
        for (i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[a.length] = element;
        return b;
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(InsertingElement.insertAtLast(a, 60))); 
    }
}*/

/*  for Fast position
public class InsertingElement {
    static int[] insertAtFast(int a[], int element) {

        int i, b[] = new int[a.length + 1];
        b[0] = element;
        for (i = 0; i < a.length; i++) {
            b[i+1] = a[i];
        }
        return b;
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(InsertingElement.insertAtFast(a, 5))); 
    }
} */

    public class InsertingElement {
    static int[] insertAtLocation(int a[], int element, int location) {

        int i, k = 0, b[] = new int[a.length + 1];
        for (i = 0; i < location; i++) 
            b[k++] = a[i];
        b[k++]= element;
        for(i = location;i<a.length;i++)
            b[k++]= a[i];
        return b;  
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(InsertingElement.insertAtLocation(a, 999,0)));
        System.out.println(Arrays.toString(InsertingElement.insertAtLocation(a, 999,1)));
        System.out.println(Arrays.toString(InsertingElement.insertAtLocation(a, 999,2)));
        System.out.println(Arrays.toString(InsertingElement.insertAtLocation(a, 999,3)));
        System.out.println(Arrays.toString(InsertingElement.insertAtLocation(a, 999,4)));
    }
}

/*from user input
import java.util.*;
public class InsertingElement {
    static int[] insertAtLast(int a[], int element) {

        int i, b[] = new int[a.length + 1];
        for (i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[a.length] = element;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(a));

        System.out.println("Enter element to insert at last: ");
        int element = sc.nextInt();

        int result[] = InsertingElement.insertAtLast(a, element);
        System.out.println("Array after insertion: " + Arrays.toString(result));

        sc.close();
    }
}*/

