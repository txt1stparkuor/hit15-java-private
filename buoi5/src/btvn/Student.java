package btvn;

import java.util.Scanner;

import static btvn.ClassRoom.scanner;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    public Student() {
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<0) throw new IllegalArgumentException("Khong duoc nhap so am");
        else this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if(gpa<0) throw new IllegalArgumentException("Khong duoc nhap so am");
        else this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void input() {
        System.out.print("Nhap vao id hoc sinh: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap vao ten lop hoc sinh: ");
        this.nameClass = scanner.nextLine();
        System.out.print("Nhap vao gpa hoc sinh: ");
        this.gpa = scanner.nextFloat();
        scanner.nextLine();
        super.input();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + ", " + super.toString() +
                ", nameClass='" + nameClass + '\'' +
                ", gpa=" + gpa +
                ", criteria=" + criteria+"}";
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    public boolean checkFall() {
        if(this.gpa<this.criteria) return true;
        else return false;
    }
}
