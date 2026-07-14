package Array;
import java.util.Arrays;

public class DeletingElement {
    static int [] deleteElementAtLocation(int a[], int location)
    {
        int k = 0, i,b[] = new int[a.length-1];

        for(i = 0; i<a.length;i++){
            if(i == location)
                continue;
            b[k++]= a[i];
        }
        return b;
    }

public static void main(String s[])
{
    int a[] = {10,11,12,13,14,15};
    System.out.println(Arrays.toString(a));

    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 0)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 1)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 2)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 3)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 4)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 5)));

  }
}


/* For  delete all elements in an array
public class DeletingElement {
    static int [] deleteElementAtLocation(int a[], int location)
    {
        int k = 0, i,b[] = new int[a.length-1];

        for(i = 0; i<a.length;i++){
            if(i == location)
                continue;
            b[k++]= a[i];
        }
        return b;
    }
        static int [] deleteAll(int a[]){
            int b[] = new int[0];
        return b;
    }


public static void main(String s[])
{
    int a[] = {10,11,12,13,14,15};
    System.out.println(Arrays.toString(a));

    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 0)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 1)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 2)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 3)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 4)));
    System.out.println(Arrays.toString(DeletingElement.deleteElementAtLocation(a, 5)));

   System.out.println(Arrays.toString(DeletingElement.deleteAll(a)));
  }
}*/
