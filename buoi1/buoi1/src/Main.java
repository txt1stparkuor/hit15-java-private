import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        if((a+b>c)&&(b+c>a)&&(a+c>b)) {
            System.out.println("la tam giac");
        }
        else System.out.println("khong la tam giac");
    }
}