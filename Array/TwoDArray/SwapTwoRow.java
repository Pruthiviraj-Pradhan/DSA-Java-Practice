package Array.TwoDArray;
import java.util.*;
public class SwapTwoRow {
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row value: ");
        int row = sc.nextInt();
        System.out.println("Enter Column value: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        int i,j,m,n,t;

        System.out.println("Enter Matrix element: ");
        for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter m and n values: ");
         m = sc.nextInt();
         n = sc.nextInt();

         System.out.println("Before swapping: ");
         for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
         for(i=0;i<col;i++){
            t = a[m-1][i];
            a[m-1][i]=a[n-1][i];
            a[n-1][i]=t;
         }
         System.out.println("After Swapping: ");
         for(i=0; i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            sc.close();
         }
    }
}
