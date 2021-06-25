package QLNV;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    final String Nhan_Vien_Full_Time = "full";

    public void them(NhanVien nhanVien) {
        list.add(nhanVien);
    }

    public void sua(NhanVien nhanVien, int viTri) {
        list.set(viTri, nhanVien);
    }

    public void sua(String ten) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(ten)) {
                if (list.get(i) instanceof NhanVienFullTime) {
                    list.set(i, taoNhanVien("full"));
                } else list.set(i, taoNhanVien("part"));
            }
            break;
        }
    }

    public void doanhThuTheoTen(String ten) {
        for (NhanVien nv : list) {
            if (nv.getTen().equals(ten)) {
                System.out.println(nv.doanhThu());
            }
        }
    }

    public void xoa(String ten) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(ten)) {
                list.remove(list.get(i));
            }
        }
    }

    public void sapXep() {
        SortNhanVienTheoTuoi sortNhanVienTheoTuoi = new SortNhanVienTheoTuoi();
        list.sort(sortNhanVienTheoTuoi);
    }


    public NhanVien taoNhanVien(String kieuNV) {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập sđt:");
        String sdt = scanner.nextLine();
        System.out.println("Nhập lương nhân viên:");
        double luong = Double.parseDouble(scanner.nextLine());

        if (kieuNV.equals(Nhan_Vien_Full_Time)) {
            return new NhanVienFullTime(ten, tuoi, gioiTinh, sdt, luong);
        } else {
            System.out.println("Nhập số giờ làm:");
            double gio = Double.parseDouble(scanner.nextLine());
            return new NhanVienPasrtTime(ten, tuoi, gioiTinh, sdt, luong, gio);
        }
    }


}
