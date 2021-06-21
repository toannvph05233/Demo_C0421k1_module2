package BTVN;

import java.util.Arrays;

public class MainPhoneSort {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        ComperatorPhone comperatorPhone = new ComperatorPhone();
        phones[0] = new Phone(8,"toan6","123456");
        phones[1] = new Phone(3,"toan3","123456");
        phones[2] = new Phone(2,"toan7","123456");

        Arrays.sort(phones,comperatorPhone);

        for (Phone p: phones) {
            System.out.println(p);
        }
    }
}
