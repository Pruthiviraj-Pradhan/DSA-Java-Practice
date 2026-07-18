package Array.ArrayRotations;
import java.util.*;
public class UsingTemp {

    /*static int[] rotateLeft_Temp(int a[],int r){
        r = r%a.length;
        int temp,i, j;
        for(i = 0; i<r; i++)
            {
            temp = a[0];
            for(j=0;j<a.length-1;j++){
                a[j] = a[j+1];
            }
            a[a.length-1]= temp;
        }
        return a;
    }*/

    static int[] rotateRight_Temp(int a[],int r){

        r = r%a.length;
        int temp,i, j;
        for(i = 0; i<r; i++)
            {
            temp = a[a.length-1];
            for(j=a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0]= temp;
        }
        return a;
    }
  public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        int a[]={1,2,3,4,5};

        System.out.println("Enter Number of rotations(r): ");
        int r = sc.nextInt();

        System.out.println("Before Rotation==>" +Arrays.toString(a));
        //a = UsingTemp.rotateLeft_Temp(a, r); 
        a = UsingTemp.rotateRight_Temp(a, r);
        System.out.println("After Rotation==>" +Arrays.toString(a));
        sc.close();
    }
}
