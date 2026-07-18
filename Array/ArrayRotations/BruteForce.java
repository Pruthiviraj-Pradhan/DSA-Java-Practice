package Array.ArrayRotations;
import java.util.*;
public class BruteForce {

    /*static int[] rotateLeft(int a[], int r){
    
        int temp, prev,i,j;
        for(i =0; i<r; i++){
            prev = a[0];
            for(j = a.length-1;j>=0;j--){
                temp = a[j];
                a[j]=prev;
                prev = temp;
            }
        }
        return a;
    }*/

    static int[] rotateRight(int a[], int r){
        int temp, prev,i,j;
        for(i =0; i<r; i++){
            prev = a[a.length-1];
            for(j=0; j<a.length;j++){
                temp = a[j];
                a[j]=prev;
                prev = temp;
            }
        }
        return a;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        int a[]={1,2,3,4,5};

        System.out.println("Enter Number of rotations(r): ");
        int r = sc.nextInt();

        System.out.println("Before Rotation==>" +Arrays.toString(a));
        //a = BruteForce.rotateLeft(a, r); 
        a = BruteForce.rotateRight(a, r);
        System.out.println("After Rotation==>" +Arrays.toString(a));
        sc.close();
    }
}
