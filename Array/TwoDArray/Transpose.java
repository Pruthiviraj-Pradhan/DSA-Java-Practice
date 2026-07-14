package Array.TwoDArray;
import java.util.*;
public class Transpose {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr matrix row size: ");
        int rsize = sc.nextInt();
        System.out.println("Enetr matrix column size: ");
        int csize = sc.nextInt();

        int i, j;
        int a[][]= new int[rsize][csize];
        int b[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one by one: ");
        for(i = 0; i<rsize; i++)
        {
            for(j = 0; j<csize; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i<rsize; i++){
            for(j = 0; j<csize; j++)
            {
                b[i][j]= a[j][i];
            
            }
        }
        System.out.println("Original Matrix: ");
        for(i = 0; i<rsize; i++)
        {
            for(j=0; j<csize; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose Matrix: ");
        for(i = 0; i<rsize; i++)
        {
            for(j=0; j<csize; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
