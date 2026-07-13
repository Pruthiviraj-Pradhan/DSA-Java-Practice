import java.util.*;
public class Functions {
    public void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String s[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter" +n+ "Elements:");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Functions obj = new Functions();
        obj.reverse(arr);
        System.out.print("Output: "+Arrays.toString(arr));

    }
}
