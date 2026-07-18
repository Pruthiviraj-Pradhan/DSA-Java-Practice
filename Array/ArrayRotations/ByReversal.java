package Array.ArrayRotations;
import java.util.*;
public class ByReversal {
    static void reverse(int a[], int s, int e){
        int temp;
        while(s<e){
            temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
   /*static int[] rotateLeft_Reversal(int a[], int r){
        r = r%a.length;
        reverse(a,0,r-1);
        reverse(a,r,a.length-1);
        reverse(a,0,a.length-1);
        return a;
    }*/
    static int[] rotateRight_Reversal(int a[], int r){
        r = r%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,r-1);
        reverse(a,r,a.length-1);
        return a;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        int a[]={1,2,3,4,5};

        System.out.println("Enter Number of rotations(r): ");
        int r = sc.nextInt();

        System.out.println("Before Rotation==>" +Arrays.toString(a));
        //a = ByReversal.rotateLeft_Reversal(a, r); 
        a = ByReversal.rotateRight_Reversal(a, r);
        System.out.println("After Rotation==>" +Arrays.toString(a));
        sc.close();
    }
}
