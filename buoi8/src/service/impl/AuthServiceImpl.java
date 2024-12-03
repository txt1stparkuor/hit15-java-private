package service.impl;

import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.AccountService;
import service.AuthService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private List<Account> accountList=new ArrayList<>();
    private Account currentAccount;

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public AuthServiceImpl() {
        accountList.add(new Account("1","nguyenhaiduy1",20,new Address("tan lap", "phu tho")
        ,"03-01-2005","txt1stparkuor1","123456", Role.ADMIN, Status.ACTIVE));
        accountList.add(new Account("2","nguyenhaiduy2",20,new Address("tan lap2", "phu tho2")
                ,"05-01-2005","txt1stparkuor2","1234567", Role.USER, Status.ACTIVE));
        accountList.add(new Account("3","nguyenhaiduy3",20,new Address("tan lap3", "phu tho3")
                ,"09-01-2005","txt1stparkuor3","12345678", Role.USER, Status.BAN));
        currentAccount=null;
    }
    @Override
    public void login(Scanner scanner) {
        System.out.print("Nhap vao username cua ban: ");
        String username=scanner.nextLine();
        System.out.print("Nhap vao mat khau cua ban: ");
        String password=scanner.nextLine();
        for (Account account: accountList) {
            if(account.getUsername().equals(username) && account.getPassword().equals(password)) {
                System.out.println("Log in sucessfully");
                currentAccount=account;
                return;
            }
        }
        System.out.println("Invalid email or password");
    }
    @Override
    public void logout() {
        currentAccount=null;
        System.out.println("Logout sucessfully");
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        if(oldPassword.equals(newPassword)) {
            System.out.println("Mat khau moi phai khac mat khau cu");
            return;
        }
        for (Account account: accountList) {
            if (account.getUsername().equals(username)&&account.getPassword().equals(oldPassword)) {
                account.setPassword(newPassword);
                System.out.println("Thay doi mat khau moi thanh cong!");
                return;
            }
        }
    }
}
