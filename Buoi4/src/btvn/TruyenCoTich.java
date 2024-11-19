package btvn;

public class TruyenCoTich extends Book {
    String country;

    public TruyenCoTich() {
    }

    public TruyenCoTich(int maSach, String tenSach, TacGia tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien, String country) {
        super(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString()+",TruyenCoTich{" +
                "country='" + country + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        this.toString();
    }
}
