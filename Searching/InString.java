package Searching;
/*
Arrays.toString(array)
"["+e1+", "+e2+", "+e3+", "+...+"+en"]" ---> toString() 
11,12,13,14 ----> [11, 12, 13, 14]
*/
import java.util.*;
public class InString {
    public static void main(String s[]){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        int n = obj.nextInt(); 
 
        int i,a[]=new int[n];
        System.out.println("Enter "+n+" values:");
        for(i=0;i<n;i++) 
        a[i] = obj.nextInt(); 
 

    System.out.println("Array Elements one by one");
    for(i=0;i<n;i++)
        System.out.println(i+"===>"+a[i]); 
   
  System.out.println(Arrays.toString(a)); 
  obj.close();
 } 
}



/*import java.util.*;
//for dictionary - {   }
public class InString {
    public static void main(String s[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = obj.nextInt();

        int i, a[] = new int[n];
        System.out.println("Enter " + n + " values:");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        System.out.println("Array Elements one by one");
        for (i = 0; i < n; i++)
            System.out.println(i + "===>" + a[i]);

        String result = Arrays.toString(a).replace('[', '{').replace(']', '}');
        System.out.println(result);

        obj.close();
    }
}*/

