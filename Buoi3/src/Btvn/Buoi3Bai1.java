package Btvn;

import java.util.Scanner;

public class Buoi3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ma sinh vien: ");
        String studentCode = scanner.nextLine();

        System.out.println("Nhap vao ten sinh vien: ");
        String fullName = scanner.nextLine();

        System.out.println("Nhap vao tuoi sinh vien: ");
        byte age = scanner.nextByte();
        scanner.nextLine();

        System.out.println("Nhap vao gioi tinh sinh vien: ");
        String gender = scanner.nextLine();

        System.out.println("Nhap vao so dien thoai sinh vien: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhap vao email sinh vien: ");
        String email = scanner.nextLine();

        scanner.close();

        Student student=new Student(studentCode,fullName,age,gender,phoneNumber,email);

        student.display();
    }
}
