package SapXep;

public class SortChen {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        sortChon(arr);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0) {
                if (x < array[pos - 1]) {
                    array[pos] = array[pos - 1];
                    pos--;
                }
            }
            array[pos] = x;
        }
    }

    public static boolean sortNoiBot(int[] array) {
        boolean check = true;
        for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = false;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }

    public static void sortChon(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortChen(int[] array) {
        int temp = 0;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int indexTemp = i - 1;
            while (indexTemp >= 0) {
                if (array[indexTemp] > temp) {
                    array[i] = array[indexTemp];
                    count = indexTemp;
                }
                indexTemp--;

            }
            array[count] = temp;


        }
    }
}
