package TrenLop;

import java.util.Scanner;

public class Buoi3Bai2TrenLop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=s.length();

        for (int i=0;i<n;i++) {
            if(s.charAt(i)>= (int)'0'&&s.charAt(i)<=(int)'9') {
                System.out.print(s.charAt(i));
                if(i+1<n)
                if(s.charAt(i+1)<(int)'0'||s.charAt(i+1)>(int)'9') {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            if(s.charAt(i)>=(int)'A'&&s.charAt(i)<=(int)'z') {
                System.out.print(s.charAt(i));
                if(i+1<n)
                    if(s.charAt(i+1)<(int)'A'||s.charAt(i+1)>(int)'z') {
                    System.out.print(" ");
                }
            }
        }
    }
}
