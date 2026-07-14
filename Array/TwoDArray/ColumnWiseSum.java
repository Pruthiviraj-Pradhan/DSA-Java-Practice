package Array.TwoDArray;

import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr matrix row size: ");
        int rsize = sc.nextInt();
        System.out.println("Enetr matrix column size: ");
        int csize = sc.nextInt();

        int i, j, sum;
        int a[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one by one: ");
        for(i = 0; i<rsize; i++)
        {
            for(j = 0; j<csize; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i<rsize; i++){
            sum = 0;
            for(j = 0; j<csize; j++)
            {
                sum = sum+a[j][i];
            }
        
        System.out.println((i+1) + " Col Sum= "+sum);
        sc.close();
        }
    }
}



