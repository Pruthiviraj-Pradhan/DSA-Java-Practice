package Array;
/*
Version 1- Update all occurances 
Version 2- Only 1st occurance
version 3- Only 2nd occurance
Version 4- Last Occurance
*/
import java.util.*;
public class ReplaceOld {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int size = sc.nextInt();

        int i,a[] = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for(i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements before update: ");
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //logic
        int olde,newe;
        System.out.println("enter old element");
            olde = sc.nextInt();
        System.out.println("enter new element");
            newe = sc.nextInt(); 

        /*for(i=0; i<a.length;i++ ){
            if(olde == a[i]){
                a[i]=newe;  // For Version 1 upto this
                break;  // For Version 2 used break */

          /*Version 3      
          int c = 0;
          for(i=0; i<a.length;i++ ){
            if(olde == a[i]){
                c++;
                if(c == 2){
                a[i]=newe;
                break;
                }
            }
        } */

        //Version 4
           int c=0;
           for(i=a.length-1;i>=0;i--){
            if(olde==a[i]){
                a[i]=newe;
                break;
            }
        }  
        System.out.println("Array elements after update: ");
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
       }
   }

}


