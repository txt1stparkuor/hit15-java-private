package btvn;

import java.util.Scanner;

import static btvn.ClassRoom.scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address;

    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input() {
        System.out.print("Nhap vao ten: ");
        this.name = scanner.nextLine();
        System.out.print("Nhap vao tuoi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        if(this.address==null) this.address=new Address();
        this.address.input();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", " + address;
    }

    public void output() {
        System.out.println(this.toString());
    }
}
