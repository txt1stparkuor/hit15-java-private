package btvn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void sortByGpa() {
        studentList.sort(Comparator.comparing(Student::getGpa));
    }

    public static void inputList() {
        System.out.println("Nhap vao cac hoc sinh");
        while (true) {
            Student tam = new Student();
            boolean check = true;
            tam.input();
            for (Student student : studentList) {
                if (tam.getId() == student.getId()) {
                    check = false;
                    System.out.println("id hoc sinh khong duoc trung nhau");
                }
            }
            if (check) studentList.add(tam);
            if (tam.getId() == 555) break;
        }
    }

    public static void outputList() {
        System.out.println("Danh sach hoc sinh");
        for (Student student : studentList) student.output();
    }

    public static boolean removeById() {
        System.out.print("Nhap vao id hoc sinh can xoa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n----------------Menu------------------");
            System.out.println("1. Nhap thong tin cac sinh vien");
            System.out.println("2. In ra thong tin sinh vien theo dang bang");
            System.out.println("3. Sap xep danh sach sinh vien theo diem gpa");
            System.out.println("4. Xoa sinh vien theo id");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    inputList();
                    break;
                case 2:
                    outputList();
                    break;
                case 3:
                    sortByGpa();
                    System.out.println("Sau khi sap xep");
                    outputList();
                    break;
                case 4:
                    if(removeById()) {
                        System.out.println("Xoa thanh cong");
                        outputList();
                    }
                    else {
                        System.out.println("Khong ton tai sinh vien co id da nhap");
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong phu hop");
            }
        }
    }
}
