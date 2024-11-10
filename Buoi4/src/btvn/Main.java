package btvn;

import java.util.Scanner;

public class Main {
    static Book[] books = new Book[5];
    static int bookCount=5;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        books[0] = new Book(1, "Java Programming", "James Gosling", 1995, "An introduction to Java programming.", 49.99);
        books[1] = new Book(2, "Effective Java", "Joshua Bloch", 2008, "Best practices for Java programming.", 39.99);
        books[2] = new Book(3, "Clean Code", "Robert C. Martin", 2008, "Guide to writing clean, maintainable code.", 45.99);
        books[3] = new Book(4, "The Pragmatic Programmer", "Andrew Hunt", 1999, "Tips and techniques for programming.", 42.50);
        books[4] = new Book(5, "Design Patterns", "Erich Gamma", 1994, "Introduction to common software design patterns.", 54.95);
        while(true) {
            System.out.println("\n----------------Menu------------------");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. In ra danh sách các cuốn sách có trong mảng");
            System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
            System.out.println("5. In ra cuốn sách phù hợp với giá tiền người mua yêu cầu");
            System.out.println("6. Sắp xếp lại danh sách các cuốn sách( theo tên hoặc theo giá tiền)");
            System.out.println("7. Thoát chương trình");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Command.addBook();
                    System.out.println("Mảng sau khi thêm sách");
                    Command.printBookArray();
                    break;
                case 2:
                    Command.editBookById();
                    System.out.println("Mảng sau khi chỉnh sửa sách");
                    Command.printBookArray();
                    break;
                case 3:
                    Command.printBookArray();
                    break;
                case 4:
                    Command.printTheOldestBook();
                    break;
                case 5:
                    Command.findBookByPrice();
                    break;
                case 6:
                    System.out.println("Mảng sau khi sắp xếp");
                    Command.sortBooks();
                    Command.printBookArray();
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
