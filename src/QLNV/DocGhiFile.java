package QLNV;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocGhiFile {
    public static void ghiFile() throws IOException {
        FileWriter fileWriter = null;
        File nhanVien = new File("nhanVien.txt");
        try {
            fileWriter = new FileWriter(nhanVien);
            fileWriter.write("1234");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            fileWriter.close();
        }
    }

    public static void docFile() throws IOException {
        FileReader fileReader = null;
        File nhanVien = new File("nhanVien.txt");
        try {
            fileReader = new FileReader(nhanVien);
            char line = ' ';
            while (true) {
                line = (char) fileReader.read();
                if (line == '\uFFFF') {
                    break;
                }
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            fileReader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        ghiFile();
        docFile();
    }
}
