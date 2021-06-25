package QLNV;

import java.util.Scanner;

public class MainQLNV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLNV qlnv = new QLNV();

        while (true) {
            System.out.println("QUản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xoá");
            System.out.println("3. Sắp xếp");
            System.out.println("4. Show");
            System.out.println("5. doanh thu theo tên");

            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    System.out.println("1. Thêm nhân viên Full");
                    System.out.println("2. Thêm nhân viên Part");

                    int choise2 = Integer.parseInt(scanner.nextLine());
                    if (choise2 == 1) {
                        NhanVien nhanVien = qlnv.taoNhanVien("full");
                        qlnv.them(nhanVien);
                    } else {
                        NhanVien nhanVien = qlnv.taoNhanVien("part");
                        qlnv.them(nhanVien);
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên cần xoá");
                    String ten = scanner.nextLine();
                    qlnv.xoa(ten);
                    break;
                case 3:
                    qlnv.sapXep();
                    break;

                case 4:
                    for (NhanVien nv : qlnv.list) {
                        System.out.println(nv);
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên cần tính doanh thu");
                    String tenDoanhThu = scanner.nextLine();
                    qlnv.doanhThuTheoTen(tenDoanhThu);
                    break;
                case 6:
                    System.out.println("Nhập vị trí cần sửa");
                    int viTri = Integer.parseInt(scanner.nextLine());
                    System.out.println("1. sửa nhân viên Full");
                    System.out.println("2. sửa nhân viên Part");
                    int sua = Integer.parseInt(scanner.nextLine());
                    if (sua == 1) {
                        NhanVien nhanVien = qlnv.taoNhanVien("full");
                        qlnv.sua(nhanVien, viTri);
                    } else {
                        NhanVien nhanVien = qlnv.taoNhanVien("part");
                        qlnv.sua(nhanVien, viTri);
                    }
                    break;

            }
        }
    }
}
