package btvn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static btvn.Main.books;
import static btvn.Main.bookCount;

public class Command {
    static Scanner scanner = new Scanner(System.in);
    public static void addBook() {
        System.out.print("Nhập mã sách: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.nextLine();
        TacGia tacGia=new TacGia(tenTacGia);
        System.out.print("Nhập năm xuất bản: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tóm tắt nội dung: ");
        String tomTatNoiDung = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double giaTien = scanner.nextDouble();

        Book newBook = new Book(maSach, tenSach, tacGia, namSanXuat, tomTatNoiDung, giaTien);

        books = Arrays.copyOf(books, bookCount + 1);
        books[bookCount] = newBook;
        bookCount++;
        System.out.println("Thêm sách thành công!");
    }
    public static void editBookById() {
        System.out.print("Nhập mã sách để chỉnh sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean found=false;
        for (int i=0;i<bookCount;i++) {
            if(books[i].getMaSach()==id) {
                found=true;
                System.out.print("Nhập tên mới (để trống để giữ nguyên): ");
                String tenSach = scanner.nextLine();
                if (!tenSach.isEmpty()) books[i].setTenSach(tenSach);

                System.out.print("Nhập tên tác giả mới (để trống để giữ nguyên): ");
                String tenTacGia = scanner.nextLine();
                TacGia tacGia=new TacGia(tenTacGia);
                if (!tacGia.getTenTacGia().isEmpty()) books[i].setTenTacGia(tacGia);

                System.out.print("Nhập năm mới (để trống để giữ nguyên): ");
                String namSanXuatInput = scanner.nextLine();
                if (!namSanXuatInput.isEmpty()) books[i].setNamSanXuat(Integer.parseInt(namSanXuatInput));

                System.out.print("Nhập tóm tắt mới (để trống để giữ nguyên): ");
                String tomTatNoiDung = scanner.nextLine();
                if (!tomTatNoiDung.isEmpty()) books[i].setTomTatNoiDung(tomTatNoiDung);

                System.out.println("Nhập giá mới (để trống để giữ nguyên: ");
                String giaTienInput=scanner.nextLine();
                if(!giaTienInput.isBlank()) books[i].setGiaTien(Double.parseDouble(giaTienInput));
                System.out.println("Cập nhật thông tin sách thành công!");
            }
        }
        if(!found) System.out.println("Không tìm thấy sách");
    }
    public static void printBookArray() {
        for (Book x: books) x.display();
    }
    public static void printTheOldestBook() {
        Book oldestBook=books[0];
        for (int i=1;i<bookCount;i++) {
            if(oldestBook.getNamSanXuat()<books[i].getNamSanXuat()) oldestBook=books[i];
        }
        System.out.println("Sách cổ nhất");
        for (int i=0;i<bookCount;i++) {
            if(oldestBook.getNamSanXuat()==books[i].getNamSanXuat()) books[i].display();
        }
    }
    public static void findBookByPrice() {
        System.out.print("Nhập giá tối đa: ");
        double maxPrice=scanner.nextDouble();
        boolean found=false;
        for (int i=0;i<bookCount;i++) {
            if(books[i].getGiaTien()<=maxPrice) {
                books[i].display();
                found=true;
            }
        }
        if(!found) System.out.println("Không tìm thấy cuốn sách nào");
    }
    public static void sortBooks() {
        System.out.print("Sắp xếp theo (1) Tên hoặc (2) Giá: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1) {
            Arrays.sort(books, Comparator.comparing(Book::getTenSach));
            System.out.println("Sắp xếp sách theo tên thành công.");
        } else if (option == 2) {
            Arrays.sort(books, Comparator.comparingDouble(Book::getGiaTien));
            System.out.println("Sắp xếp sách theo giá thành công.");
        } else {
            System.out.println("Tùy chọn không hợp lệ.");
        }
    }

}
