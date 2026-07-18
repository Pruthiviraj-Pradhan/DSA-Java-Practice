package Array.ArrayRotations;
import java.util.*;
public class Temp2 {
    /*static int[] rotateLeft_TempM1(int a[], int r){
        r = r%a.length;
        int i,n = a.length;
        int temp[]=new int[n];

        for(i =0; i<n; i++){
            temp[i]=a[(i+r)%n];
        }
        for(i = 0;i<n;i++){
            a[i]= temp[i];
        }
        return a;
    }*/
   static int[] rotateRight_TempM1(int a[], int r){
        r = r%a.length;
        int i,n = a.length;
        int temp[]=new int[n];

        for(i =0; i<n; i++){
            temp[(i+r)%n]=a[i];
        }
        for(i = 0;i<n;i++){
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
        //a = Temp2.rotateLeft_TempM1(a, r); 
        a = Temp2.rotateRight_TempM1(a, r);
        System.out.println("After Rotation==>" +Arrays.toString(a));
        sc.close();
    }
}
