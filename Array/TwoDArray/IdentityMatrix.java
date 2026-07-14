package Array.TwoDArray;
import java.util.*;
public class IdentityMatrix {
    static boolean isIdentity(int a[][], int m, int n){
        int i, j;
        for(i = 0; i<n; i++)
        {
            for(j =0; j<m; j++){
                if(i!=j && a[i][j]!=0)
                    return false;
                if(i==j && a[i][j]!=1)
                    return false;
            }
        }
        return true;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr matrix row size: ");
        int rsize = sc.nextInt();
        System.out.println("Enetr matrix column size: ");
        int csize = sc.nextInt();

        int i, j;
        int a[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one by one: ");
        for(i = 0; i<rsize; i++)
        {
            for(j = 0; j<csize; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(IdentityMatrix.isIdentity(a,rsize,csize));
        sc.close();
    }
}
