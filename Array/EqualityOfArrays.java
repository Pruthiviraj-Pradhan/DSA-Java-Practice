package Array;
import java.util.Arrays;
/*Normal comparison
public class EqualityOfArrays {
    static boolean equals(int a[],int b[])
    {
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
            }
            return true;
        }
 public static void main(String[] args)
 {
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{1,2,3}));//true 
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{4,5,6}));//false 
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{3,2,1}));//false
}
}*/

/* Changing position and using Arrays.sort()

public class EqualityOfArrays {
    static boolean equals(int a[],int b[])
    {
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
            }
            return true;
        }
 public static void main(String[] args)
 {
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{1,2,3}));//true
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{4,5,6}));//false 
    System.out.println(EqualityOfArrays.equals(new int[]{1,2,3},new int[]{3,2,1}));//false
    int a[] = {1,2,3};
    int b [] = {3,2,1};
    System.out.println(EqualityOfArrays.equals(a, b));//false
    Arrays.sort(a);
    Arrays.sort(b);
    System.out.println(EqualityOfArrays.equals(a, b));//true

 }
}*/

//predefined Method
public class EqualityOfArrays {
public static void main(String[] args)  
 { 
  int a[] = {1,2,3}; 
  int b[] = {3,2,1}; 
  System.out.println(Arrays.equals(a,b));//false 
  Arrays.sort(a); 
  Arrays.sort(b); 
  System.out.println(Arrays.equals(a,b));//true 
 } 
}

