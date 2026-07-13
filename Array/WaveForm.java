package Array;
import java.util.*;
public class WaveForm {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int n = sc.nextInt();

        int t,i, a[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
    System.out.print(a[0]+" ");

    for(i = 1; i<n-1;i = i+2){
        t = a[i];
        a[i]= a[i+1];
        a[i+1]= t;
        System.out.print(a[i]+" "+a[i+1]+" ");
    }
    if(n%2==0){
        System.out.print(a[i]);
    }
  }
}
