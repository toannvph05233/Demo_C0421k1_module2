package QLNV;

public class NhanVienPasrtTime extends NhanVien{
    private double gio;

    public NhanVienPasrtTime() {
    }

    public NhanVienPasrtTime(String ten, int tuoi, String gioiTinh, String sdt, double luong,double gio) {
        super(ten, tuoi, gioiTinh, sdt, luong);
        this.gio = gio;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }

    @Override
    public double doanhThu() {
        return getLuong()*gio;
    }

    @Override
    public String toString() {
        return "NhanVienPasrtTime{" +
                "gio=" + gio +
                '}' + super.toString();
    }
}
