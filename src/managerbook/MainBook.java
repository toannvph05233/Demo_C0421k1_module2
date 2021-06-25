//package managerbook;
//
//import java.util.Scanner;
//
//public class MainBook {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("BOOK MANAGEMENT SYSTEM");
//            System.out.println("1.Insert");
//            System.out.println("2.Remove");
//            System.out.println("3.Update");
//            System.out.println("4.Search");
//            System.out.println("5.Sort");
//            System.out.println("6.Show");
//            System.out.println("7.Exit");
//            int choise = Integer.parseInt(scanner.nextLine());
//
//            switch (choise) {
//                case 1:
//                    ManageBookList.insert();
//                    break;
//                case 2:
//                    System.out.println("nhập name cần xoá");
//                    String name = scanner.nextLine();
//                    ManageBookList.remove(name);
//                    break;
//                case 3:
//                    System.out.println("nhập index cần sửa");
//                    int index = Integer.parseInt(scanner.nextLine());
//                    ManageBookList.update(index);
//                    break;
//                case 4:
//                    System.out.println("nhập name cần Search");
//                    String nameSearch = scanner.nextLine();
//                    ManageBookList.search(nameSearch);
//                    break;
//                case 5:
//                    ManageBookList.sort();
//                    break;
//                case 6:
//                    for (Book b : ManageBookList.books) {
//                        b.display();
//                    }
//                    break;
//                case 7:
//                    System.exit(0);
//            }
//        }
//    }
//}
