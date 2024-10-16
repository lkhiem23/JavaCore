package LeHoaiKhiem_Lab12.maytinh_dell;

import LeHoaiKhiem_Lab12.maytinh.Maytinh;
import LeHoaiKhiem_Lab12.maytinh_apple.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mipComputer {

    static void menu(){
        System.out.println("---------------MENU---------------");
        System.out.println("1. INPUT");
        System.out.println("2. DISPLAY");
        System.out.println("3. SORT");
        System.out.println("4. SEARCH");
        System.out.println("5. EXIT");
    }

    public static void main(String[] args) {
        List<Maytinh> list = new ArrayList<Maytinh>();
        Scanner sc = new Scanner(System.in);
        int chon = 0;

        do {
            menu();
            System.out.print("Chọn mục: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1:
                    System.out.println("Bạn chọn 1: Nhập thông tin cho 3 sản phẩm DELL và 3 sản phẩm APPLE");
                    System.out.println();
                    for (int i = 0; i < 2; i++){
                        System.out.println("Nhập thông tin cho máy tính DELL thứ : " + (i+1));
                        Dell dell = new Dell();
                        dell.inputInfor();
                        list.add(dell);
                    }
                    for (int i = 0; i < 2; i++){
                        System.out.println("Nhập thông tin cho máy tính APPLE thứ : " + (i+1));
                        Apple apple = new Apple();
                        apple.inputInfor();
                        list.add(apple);
                    }
                    break;
                case 2:
                    System.out.println("Bạn chọn 2: Hiển thị thông tin của DELL và APPLE");
                    System.out.println("Thông tin của DELL và APPLE: ");
                    for (Maytinh m : list){
                        m.displayInfor();
                        System.out.println("==============");
                    }
                    break;
                case 3:
                    System.out.println("Bạn chọn 3: Sắp xếp thông tin theo thời gian bảo hành");
                    Collections.sort(list, (m1,m2) -> Integer.compare(m1.getWarranty(), m2.getWarranty()));
                    System.out.println("Đã sắp xếp xong. Dưới đây là danh sách sau khi sắp xếp");
                    for (Maytinh m : list){
                        m.displayInfor();
                    }
                    break;
                case 4:
                    System.out.println("Bạn chọn 4: Tìm kiếm và hiển thị những máy có tên 'apple' ");
                    System.out.println("Nhập máy tính bạn muốn tìm: ");
                    String modelToSearch = sc.nextLine();

                    // Tìm kiếm:

                    list.stream()
                            .filter(m -> m.getName().equalsIgnoreCase(modelToSearch))
                            .findAny()
                            .ifPresentOrElse(
                                    m -> {
                                        System.out.println("Máy tìm thấy: "+ modelToSearch + ".");
                                        m.displayInfor();
                                    },
                                    () -> System.out.println("Không tìm thấy máy tính có tên 'apple' " + modelToSearch + ".")
                            );
                    break;
                case 5:
                    System.out.println("Bạn chọn 5: Thoát khỏi chương trình!!!");
                    System.exit(0);
                    break;
                default:
                        System.out.println("Vui lòng chọn lại! ");
            }
        }while (chon != 5);

    }
}
