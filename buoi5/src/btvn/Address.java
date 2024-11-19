package btvn;

import java.util.Scanner;
import java.util.SequencedCollection;

import static btvn.ClassRoom.scanner;

public class Address {

    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }
    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        System.out.print("nhap vao xa/phuong: ");
        this.commune=scanner.nextLine();
        System.out.print("nhap vao quan/huyen: ");
        this.district=scanner.nextLine();
        System.out.print("nhap vao thanh pho: ");
        this.city=scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                "commune='" + commune + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'';
    }

    public void output() {
        System.out.println(this.toString());
    }
}
