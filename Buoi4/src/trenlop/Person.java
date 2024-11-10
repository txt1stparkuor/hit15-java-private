package trenlop;

public class Person {
    private String maCanCuocCongDan;
    private String ten;
    private String diaChi;
    private String soDienThoai;
    private int tuoi;

    public Person() {
    }

    public Person(String maCanCuocCongDan, String ten, String diaChi, String soDienThoai, int tuoi) {
        this.maCanCuocCongDan = maCanCuocCongDan;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tuoi = tuoi;
    }

    public String getMaCanCuocCongDan() {
        return maCanCuocCongDan;
    }

    public void setMaCanCuocCongDan(String maCanCuocCongDan) {
        this.maCanCuocCongDan = maCanCuocCongDan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void display() {
        System.out.printf("%s | %s | %s | %s | %d |\n"
                ,maCanCuocCongDan,ten,diaChi,soDienThoai,tuoi);
    }
}
