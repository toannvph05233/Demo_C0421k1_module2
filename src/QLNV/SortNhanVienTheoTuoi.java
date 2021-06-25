package QLNV;

import java.util.Comparator;

public class SortNhanVienTheoTuoi implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.getTuoi() > o2.getTuoi()) {
            return 1;
        } else if (o1.getTuoi() == o2.getTuoi()) {
            return o1.getTen().compareTo(o2.getTen());
        } else if (o1.getTen().equals(o2.getTen())) {
            return o1.getSdt().compareTo(o2.getSdt());
        }
        return -1;
    }
}
