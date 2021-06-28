package docGhiFile;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<NhanVien> list = new ArrayList<>();
    static File nhanVien = new File("nhanVien.txt");

    public static void main(String[] args) throws IOException {
        docFile();
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
        list.add(new NhanVien("Nam5555555", 18, "nam", "0988788", 10));
        ghiFile();


    }

    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(nhanVien);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (NhanVien nv : list) {
                bufferedWriter.write(nv.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    public static void docFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(nhanVien);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 5) {
                    list.add(new NhanVien(str[0], Integer.parseInt(str[1].trim()), str[2], str[3], Double.parseDouble(str[4].trim())));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }


    }
}
