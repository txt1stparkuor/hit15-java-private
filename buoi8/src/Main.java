import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.AccountService;
import service.AuthService;
import service.impl.AccountServiceImpl;
import service.impl.AuthServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountServiceImpl();
        AuthService authService = new AuthServiceImpl();
        while (authService.getCurrentAccount() == null) {
            authService.login(scanner);
        }
        Account currentAccount = authService.getCurrentAccount();
        if (currentAccount.getRole().equals(Role.ADMIN)) {
            while (true) {
                System.out.println("==== HỆ THỐNG QUẢN LÝ TÀI KHOẢN ====");
                System.out.println("Chọn một trong các chức năng sau:");
                System.out.println("1. Xem danh sách tài khoản");
                System.out.println("2. Tạo tài khoản mới");
                System.out.println("3. Tìm kiếm tài khoản theo username");
                System.out.println("4. Xóa tài khoản");
                System.out.println("5. Thay đổi trạng thái tài khoản (ACTIVE → BAN)");
                System.out.println("6. Xem thông tin cá nhân");
                System.out.println("0. Đăng xuất");
                System.out.println("---------------------------------");
                System.out.print("Nhập lựa chọn của bạn: ");
                int choice =scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        authService.logout();
                        break;
                    case 1:
                        List<Account> accounts= accountService.getAllAccount();
                        System.out.println("Xem danh sach tai khoan: ");
                        for (Account account: accounts) System.out.println(account);
                        break;
                    case 2:
                        Account testAccount = new Account("4", "nguyenhaiduy4", 20
                                , new Address("tan lap4", "phu tho4")
                                , "09-01-2005", "txt1stparkuor4", "123456789",
                                Role.USER, Status.ACTIVE);
                        accountService.createNewAccount(testAccount);
                        break;
                    case 3:
                        System.out.print("Nhap vao username muon tim: ");
                        Account foundAccount=accountService.getAccountByUsername(scanner.nextLine());
                        System.out.println("Tai khoan muon tim: " + foundAccount);;
                        break;
                    case 4:
                        System.out.print("Nhap vao username muon xoa: ");
                        accountService.getAccountByUsername(scanner.nextLine());
                        break;
                    case 5:
                        System.out.print("Nhap vao username muon thay doi status: ");
                        System.out.print("Nhap vao status moi: ");
                        Status status = Status.valueOf(scanner.nextLine());
                        accountService.changeStatus(scanner.nextLine(), status);
                        break;
                    case 6:
                        System.out.println(currentAccount);
                        break;
                }
            }
        }
        if(currentAccount.getRole().equals(Role.USER)) {
            while (true) {
                System.out.println("==== HỆ THỐNG NGƯỜI DÙNG ====");
                System.out.println("Xin chào USER: "+ currentAccount.getUsername());
                System.out.println("Chọn một trong các chức năng sau:");
                System.out.println("1. Đổi mật khẩu");
                System.out.println("2. Xem thông tin cá nhân");
                System.out.println("0. Đăng xuất");
                System.out.println("----------------------------------");
                System.out.print("Nhập lựa chọn của bạn:");
                int choice=scanner.nextInt();
                switch (choice) {
                    case 0:
                        authService.logout();
                        break;
                    case 1:
                        authService.changePassword("txt1stparkuor2","1234567","123465789");
                        break;
                    case 2:
                        System.out.println(currentAccount);
                        break;
                }
            }
        }
    }
}