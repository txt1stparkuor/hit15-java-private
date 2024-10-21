import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so nguyen:");
        String s=scanner.nextLine();
        int res=1;
        if(s.charAt(0)!='-')
        for (int i=0;i<s.length();i++)
            res=res*(s.charAt(i)-'0');
        else for (int i=1;i<s.length();i++) res=res*(s.charAt(i)-'0');
        System.out.println("res = " + res);
    }
}