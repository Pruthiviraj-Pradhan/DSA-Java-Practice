package Array.TwoDArray;
import java.util.*;
public class InterhangeOfDiagonal{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row value: ");
        int row = sc.nextInt();
        System.out.println("Enter Column value: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        int i,j,t;

        System.out.println("Enter Matrix element: ");
        for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }

         System.out.println("Before swapping: ");
         for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
         for(i=0;i<row;i++){
            t = a[i][i];
            a[i][i]=a[i][row-i-1];
            a[i][row-i-1]= t;
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
