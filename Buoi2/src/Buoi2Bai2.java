import java.util.Scanner;

public class Buoi2Bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),k=scanner.nextInt();
        int[] a =new int[100005];
        int m=Integer.MIN_VALUE;
        for (int i=1;i<=n;i++) a[i]=scanner.nextInt();
        for (int i=k;i<=n;i++) {
            int tam=0;
            for (int j=1;j<=i;j++) tam=tam+a[j];
            m=Math.max(m,tam);
            for (int j=2;j<=n-i+1;j++) {
                tam=tam-a[j-1]+a[j+i-1];
                m=Math.max(m,tam);
            }
        }
        System.out.println("m = " + m);
    }
}