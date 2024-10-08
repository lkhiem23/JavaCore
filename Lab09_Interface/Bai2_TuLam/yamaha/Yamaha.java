package Bai2_TuLam.yamaha;

import Bai1_TuLam.Vehicle;
import Bai2_TuLam.Motor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Yamaha {

    static void menu(){
        System.out.println("------------------MENU------------------");
        System.out.println("1.Input");
        System.out.println("2.Output");
        System.out.println("3.Sort");
        System.out.println("4.Search");
        System.out.println("5.Thoat");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        List<Motor> list = new ArrayList<Motor>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            menu();
            System.out.print("Nhập mục muốn chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("1. Input");
                    for (int i = 0; i < 3; i++){
                        System.out.println("Nhập thông tin cho xe Jupiter thứ: "+ (i+1));
                        Jupiter j = new Jupiter();
                        j.inputInfor();
                        list.add(j);
                    }

                    for (int i = 0; i < 3; i++){
                        System.out.println("Nhập thông tin cho xe Serius thứ: "+ (i+1));
                        Serius s = new Serius();
                        s.inputInfor();
                        list.add(s);
                    }
                    break;
                case 2:
                    System.out.println("2. Output");
                    for (Motor m : list){
                        System.out.println("Thông tin xe vừa nhập: ");
                        m.displayInfor();
                    }
                    break;
                case 3:
                    Collections.sort(list, (m1, m2) -> {
                        int warranty1 = 0; // Lưu giá tri vào
                        int warranty2 = 0;

                        // KIỂM TRA XEM THUỘC TÍNH WARRANTY CÓ TRONG LỚP HAY KHÔNG VÀ ÉP KIỂU ĐỂ LẤY RA GIÁ TRỊ


                        if (m1 instanceof Jupiter) {
                            warranty1 = ((Jupiter) m1).getWarranty(); // Cast to Jupiter and get warranty
                        } else if (m1 instanceof Serius) {
                            warranty1 = ((Serius) m1).getWarranty(); // Cast to Serius and get warranty
                        }

                        if (m2 instanceof Jupiter) {
                            warranty2 = ((Jupiter) m2).getWarranty(); // Cast to Jupiter and get warranty
                        } else if (m2 instanceof Serius) {
                            warranty2 = ((Serius) m2).getWarranty(); // Cast to Serius and get warranty
                        }

                        return Integer.compare(warranty1, warranty2);
                    });
                    /*
                    Collections.sort(list, (v1, v2) -> Double.compare(v1.getPrice(), v2.getPrice()));
                    for(Vehicle v : list){
                        v.display();
                    }
                    */
                    break;
                case 4:
                    System.out.println("TÌM KIẾM XE CÓ TÊN SERIUS");
                    String modelSearch = sc.nextLine();

                    //TÌM KIẾM XE VÀ HIỂN THỊ

                    list.stream()
                            .filter(y -> y.getName().equalsIgnoreCase(modelSearch))
                            .findAny()
                            .ifPresentOrElse(
                                    y -> {
                                        System.out.println("Xe tìm thấy: "+ modelSearch);
                                        y.displayInfor();
                                    },() -> System.out.println("Không tìm thấy xe SERIUS")
                            );

                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(chon!=5);

    }
}
