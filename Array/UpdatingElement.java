package Array;
import java.util.Arrays;

/*
public class UpdatingElement {
    static int[] updateAtLocation(int a[], int location, int element){
        int b[] = new int[a.length];
        for(int i = 0; i<a.length; i++)
            b[i] = a[i];
        if(location>=0 && location<a.length)
            b[location]=element;
        return b;
    }
    public static void main(String s[]){
        int a[] = {10,11,12,13,14,15};

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,0,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,1,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,2,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,3,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,4,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateAtLocation(a,5,999)));

    }
}
    */

public class UpdatingElement {
    static int[] updateElement(int a[], int oldElement,int newElement)
    {
        
        int i,b[] = new int[a.length];
        for(i = 0; i<a.length; i++)
            b[i] = a[i];
        for(i = 0; i<b.length; i++){
            if(b[i]==oldElement)
            {
                b[i] = newElement;
                break;
            }
        }
        return b;
    }
    public static void main(String s[]){
        int a[] = {10,11,12,13,14,15};

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(UpdatingElement.updateElement(a,10,999)));
        System.out.println(Arrays.toString(UpdatingElement.updateElement(a,100,999)));
    }
}
