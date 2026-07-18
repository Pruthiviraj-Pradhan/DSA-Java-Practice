package Array.ArrayRotations;
import java.util.*;
public class Temp1 {
    /*static int[] rotateLeft_TempM1(int a[], int r){
        r = r%a.length;
        int i,n = a.length;
        int temp[]=new int[r];

        for(i =0; i<r; i++){
            temp[i]=a[i];
        }
        for(i=r; i<n; i++){
            a[i-r]=a[i];
        }
        for(i = 0;i<r;i++){
            a[i+n-r]= temp[i];
        }
        return a;
    }*/
   static int[] rotateRight_TempM1(int a[], int r){
        r = r%a.length;
        int i,n = a.length;
        int temp[]=new int[r];

        for(i =0; i<r; i++){
            temp[i]=a[n-r+i];
        }
        for(i=n-r-1; i>=0; i--){
            a[i+r]=a[i];
        }
        for(i = 0;i<r;i++){
            a[i]= temp[i];
        }
        return a;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        int a[]={1,2,3,4,5};

        System.out.println("Enter Number of rotations(r): ");
        int r = sc.nextInt();

        System.out.println("Before Rotation==>" +Arrays.toString(a));
        //a = Temp1.rotateLeft_TempM1(a, r); 
        a = Temp1.rotateRight_TempM1(a, r);
        System.out.println("After Rotation==>" +Arrays.toString(a));
        sc.close();
    }
}
