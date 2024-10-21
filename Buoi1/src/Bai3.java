import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) max2 = a[i];
        }
        System.out.println("Hai so lon nhat la: " + max1 + " and " + max2);
    }
}