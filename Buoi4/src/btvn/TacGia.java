package btvn;

public class TacGia {
    String tenTacGia;

    public TacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    @Override
    public String toString() {
        return "{" +
                "tenTacGia='" + tenTacGia + '\'' +
                '}';
    }
}
