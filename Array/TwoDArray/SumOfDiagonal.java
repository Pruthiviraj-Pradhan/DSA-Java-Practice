package Array.TwoDArray;
import java.util.*;
public class SumOfDiagonal {
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row value: ");
        int row = sc.nextInt();
        System.out.println("Enter Column value: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        int i,j, S;

        System.out.println("Enter Matrix element: ");
        for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }
        S = 0;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(i==j)
                    {
                    S= S+a[i][j];
                }
            }
        }
        System.out.println(S);
            sc.close();
         }
    }

