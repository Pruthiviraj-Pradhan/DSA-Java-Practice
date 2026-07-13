/*import java.util.*;

class Fibonacci {
    public ArrayList<Integer> fib(int n) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        if (n <= 0) return al;

        int a = 0, b = 1;
        al.add(a);
        if (n == 1) return al;

        al.add(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            al.add(c);
            a = b;
            b = c;
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        ArrayList<Integer> result = obj.fib(n);

        System.out.println(result);
    }
}*/
import java.util.Scanner;

public class Fibonacci {

    static void sequence(int n) {
        int[] arr = new int[n];

        arr[0] = 5;
        arr[1] = 6;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sequence(n);
        sc.close();
    }
}