package thuat_toan_tim_kiem;

import managerbook.Book;

import java.util.ArrayList;

public class TimKiemNhiPhan {

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(1, "toan1"));
        list.add(new Book(2, "toan2"));
        list.add(new Book(3, "toan3"));
        list.add(new Book(4, "toan4"));
        list.add(new Book(5, "toan5"));
        list.add(new Book(6, "toan6"));

        int index = timKiemNhiPhan(list,0,list.size() -1,5);
        System.out.println(index);

    }

    public static int timKiemNhiPhan(ArrayList<Book> list, int dau, int cuoi, int id) {
        int giua = (dau + cuoi) / 2;
        if (id > list.get(cuoi).getId() || id < list.get(dau).getId()) {
            return -1;
        } else if (cuoi < dau) {
            return -1;
        } else if (id == list.get(giua).getId()) {
            return giua;
        } else if (id > list.get(giua).getId()) {
            return timKiemNhiPhan(list, giua + 1, cuoi, id);
        } else return timKiemNhiPhan(list, dau, giua - 1, id);
    }
}
