package Array;
import java.util.*;
public class SmallLarge {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();

        int i, a[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(i = 0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int low,high;
        low = 0;
        high = n-1;
        while(low<=high){
            System.out.print(a[low]+" "+a[high]+" ");
            low++;
            high--;
        }
    }
}
