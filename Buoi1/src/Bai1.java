import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String digits="0123456789ABCDEF";
        String res="";
        int n;
        do {
            System.out.println("Nhap vao so can chuyen doi: ");
            n=scanner.nextInt();
            if (n==0) {
                System.out.println(0);
                System.exit(0);
            }
        }while(n<0);
        int coSo;
        do {
            System.out.println("Nhap vao co so >=2,<=16: ");
            coSo=scanner.nextInt();
        } while(coSo<2||coSo>16);
        while(n>0) {
            res=digits.charAt(n%coSo)+res;
            n/=coSo;
        }
        System.out.println("so chuyen doi la = " + res);
    }
}