package TrenLop;

import java.util.Scanner;

public class Buoi3Bai4TrenLop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[1000005];
        for (int i=1;i<=n;i++) a[i]=scanner.nextInt();
        int[] prefixSum=new int[1000005];
        for (int i=1;i<=n;i++) {
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        int q=scanner.nextInt();
        for (int k=1;k<=q;k++) {
            int l=scanner.nextInt(),r=scanner.nextInt();
            System.out.println(prefixSum[r]-prefixSum[l-1]);
        }
    }
}
