import java.util.*;

class Solution {
    public void printNumber(Scanner scanner) {
        int n = scanner.nextInt();
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.printNumber(sc);
    }
}