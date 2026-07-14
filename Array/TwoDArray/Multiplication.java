package Array.TwoDArray;
import java.util.*;
public class Multiplication {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  matrix-A row size: ");
        int rsize1 = sc.nextInt();
        System.out.println("Enter matrix-A column size: ");
        int csize1 = sc.nextInt();

        System.out.println("Enter  matrix-B row size: ");
        int rsize2 = sc.nextInt();
        System.out.println("Enter matrix-B column size: ");
        int csize2 = sc.nextInt();

        if(rsize1 == csize2){
            
            int i,j,k;
            int a[][] = new int[rsize1][csize1];
            int b[][] = new int[rsize2][csize2];
            int c[][] = new int[rsize1][csize2];


        System.out.print("Enter matrix-A element one by one: ");
        for(i = 0; i<rsize1; i++)
        {
            for(j=0; j<csize1; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter matrix-B element one by one: ");
        for(i = 0; i<rsize2; i++)
        {
            for(j=0; j<csize2; j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        for(i=0; i<rsize1; i++)
        {
            for(j = 0; j<csize1; j++)
            {
                c[i][j]= 0;
                for(k = 0; k<csize1; k++)
                {
                c[i][j]=c[i][j] + a[i][k]*b[k][j];
            }
        }
    }
        
        System.out.println("Matrix-A elements are: ");
        for(i = 0; i<rsize1; i++)
        {
            for(j=0; j<csize1; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix-B elements are: ");
        for(i = 0; i<rsize2; i++)
        {
            for(j=0; j<csize2; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix-C elements are: ");
        for(i = 0; i<rsize1; i++)
        {
            for(j=0; j<csize2; j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }else{
        System.out.println("Matrix Multiplication  is not possible: ");
    }
       sc.close();
    }
}

/*Scalar multiplication

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row size: ");
        int rows = sc.nextInt();
        System.out.println("Enter column size: ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter scalar value: ");
        int scalar = sc.nextInt();

        int c[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                c[i][j] = a[i][j] * scalar;

        System.out.println("Result after scalar multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
*/