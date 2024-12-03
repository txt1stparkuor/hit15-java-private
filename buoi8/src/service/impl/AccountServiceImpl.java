package service.impl;

import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private List<Account> accountList=new ArrayList<>();
    private Account currentAccount;
    public AccountServiceImpl() {
        accountList.add(new Account("1","nguyenhaiduy1",20,new Address("tan lap", "phu tho")
                ,"03-01-2005","txt1stparkuor1","123456", Role.ADMIN, Status.ACTIVE));
        accountList.add(new Account("2","nguyenhaiduy2",20,new Address("tan lap2", "phu tho2")
                ,"05-01-2005","txt1stparkuor2","1234567", Role.USER, Status.ACTIVE));
        accountList.add(new Account("3","nguyenhaiduy3",20,new Address("tan lap3", "phu tho3")
                ,"09-01-2005","txt1stparkuor3","12345678", Role.USER, Status.BAN));
        currentAccount=null;
    }
    public Account getCurrentAccount() {
        return currentAccount;
    }
    @Override
    public List<Account> getAllAccount() {
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        for (Account acc: accountList) {
            if (acc.getUsername().equals(account.getUsername())) {
                System.out.println("Username nhap vao da ton tai, vui long chon username khac");
                return;
            }
        }
        accountList.add(account);
        System.out.println("Tao tai khoan moi thanh cong");
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account: accountList) {
            if(account.getUsername().equals(username)) return account;
        }
        System.out.println("Khong tim thay tai khoan");
        return new Account();
    }

    @Override
    public void deleteAccount(String username) {
        for (Account account: accountList) {
            if(account.getUsername().equals(username)) {
                accountList.remove(account);
                System.out.println("Xoa tai khoan thanh cong");
                return;
            }
        }
    }

    @Override
    public void changeStatus(String username, Status status) {
        for (Account account: accountList) {
            if(account.getUsername().equals(username)) {
                account.setStatus(status);
                System.out.println("Chuyen trang thai tai khoan thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay tai khoan co username da nhap vao");
    }
}
