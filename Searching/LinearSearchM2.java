package Searching;
import java.util.ArrayList;
import java.util.*;
public class LinearSearchM2 {
    /*static int linearSearch(int a[], int key){
        int i, index =1;
        for(i =0; i<a.length; i++){
            if(key == a[i]){
                index = i;
                break;
            }
        }
        return index;
    }*/
   static ArrayList linearSearch(int a[], int key){
        int i, c =0;
        ArrayList list = new ArrayList();
        for(i =0; i<a.length; i++){
            if(key == a[i]){
                list.add(i);
                c++;
                if(c>=2)
                break;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {10,11,12,11,13,17,19,20};
        System.out.println("Array="+Arrays.toString(a));
        System.out.println("Enetr key element to search: ");
        int key = sc.nextInt();
        System.out.println(LinearSearchM2.linearSearch(a,key));
        sc.close();
    }
}

