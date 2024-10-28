import java.util.Scanner;

public class Buoi2Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),k=scanner.nextInt();
        int[] a =new int[1000];
        for (int i=0;i<n;i++) a[i]=scanner.nextInt();
        int l=0,r=n-1;
        while(l<=r) {
            int mid=(l+r)/2;
            if(a[mid]==k) {
                System.out.println(mid);
                System.exit(0);
            }
            else if(a[mid]<k) l=mid+1;
            else if(a[mid]>k) r=mid-1;
        }
        System.out.println(-1);
    }
}