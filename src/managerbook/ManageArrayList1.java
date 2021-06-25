//package managerbook;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ManageArrayList1 {
//    static ArrayList<Book> books = new ArrayList<>();
//    static Scanner scanner = new Scanner(System.in);
//
//
//    public static void insert() {
//        Book book = create();
//        books.add(book);
//    }
//
//    public static int fillByName(String name){
//        for (int i = 0; i < books.size(); i++) {
//            if (books.get(i).getName().equals(name)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void remove(String name) {
//        int index = fillByName(name);
//        if (index > 0) {
//            books.remove(index);
//        }else {
//            System.out.println("không có name là : " + name);
//        }
//    }
//
//    public static void update(int index){
//        Book book = create();
//        books.set(index,book);
//    }
//
//    public static void search(String name){
//        int index = fillByName(name);
//        if (index>= 0){
//            books.get(index).display();
//        }else {
//            System.out.println("không có tên là : " + name);
//        }
//    }
//    public static void sort(){
//        SortBook sortBook = new SortBook();
//       books.sort(sortBook);
//    }
//
//
//    public static Book create() {
//        System.out.println("nhập id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập name:");
//        String name = scanner.nextLine();
//        System.out.println("nhập publishDate:");
//        String publishDate = scanner.nextLine();
//        System.out.println("nhập author:");
//        String author = scanner.nextLine();
//        System.out.println("nhập language:");
//        String language = scanner.nextLine();
//        System.out.println("nhập averagePrice:");
//        float averagePrice = Float.parseFloat(scanner.nextLine());
//        Book book = new Book(id, name, publishDate, author, language, averagePrice);
//        return book;
//    }
//
//
//}
