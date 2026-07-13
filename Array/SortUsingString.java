package Array;
import java.util.*;
public class SortUsingString {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String: ");
        String S = sc.nextLine();

        char t,a[] = S.toCharArray();

       // Arrays.sort(ch);

        for(int i = 0; i<a.length; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    t = a[i];
                    a[i]=a[j];
                    a[j]= t;
                }
            }
        }
        System.out.println(new String(a));
    }
}
