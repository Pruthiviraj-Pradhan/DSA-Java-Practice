package Searching;
import java.util.*;
public class LinearSearchM2 {
    static int linearSearch(int a[], int key){
        int i, index =1;
        for(i =0; i<a.length; i++){
            if(key == a[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {10,11,12,13,17,19,20};
        System.out.println("Array="+Arrays.toString(a));
        System.out.println("Enetr key element to search: ");
        int key = sc.nextInt();
        System.out.println(LinearSearchM2.linearSearch(a,key));
        sc.close();
    }
}

