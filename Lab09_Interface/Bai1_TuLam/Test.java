package Bai1_TuLam;

import Bai1_TuLam.car.Car;
import Bai1_TuLam.truck.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    static void menu(){
        System.out.println("----------MENU----------");
        System.out.println("1. Input");
        System.out.println("2. Display");
        System.out.println("3. Sort by price");
        System.out.println("4. Search by model.");
        System.out.println("5. Exit");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<Vehicle>();
        Scanner sc = new Scanner(System.in);
        int chon = 0;

            do {
            menu();
            System.out.print("\nChọn: ");
                chon = sc.nextInt();
            switch (chon) {
                case 1:
                    for(int i = 0; i< 2; i++){
                        System.out.println("Nhập thông tin cho ô tô " + (i+1));
                        Car car = new Car();
                        car.input();
                        list.add(car);
                    }
                    for(int i = 0; i< 2; i++){
                        System.out.println("Nhập thông tin cho xe tải " + (i+1));
                        Truck truck = new Truck();
                        truck.input();
                        list.add(truck);
                    }
                   break;

                case 2:
                    for(Vehicle v : list){
                        System.out.println("THÔNG TIN CAR VÀ TRUCK: ");
                        v.display();
                    }
                    break;
                case 3:

                    Collections.sort(list, (v1,v2) -> Double.compare(v1.getPrice(), v2.getPrice()));
                    for(Vehicle v : list){
                        v.display();
                    }
                /*
                    // Bubble Sort
                    for(int i = 0 ; i < list.size()-1; i++){
                        for(int j = i+1; j < list.size(); j++) {
                            if (list.get(i).getPrice() > list.get(j).getPrice()){
                                Vehicle temp = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, temp);
                            }
                        }
                    }
                 */
                    break;
                case 4:
                    System.out.print("Nhập mô hình xe để tìm kiếm: ");
                    String modelToSearch = sc.nextLine();

                    // Tìm kiếm và hiển thị xe khớp mô hình
                    list.stream()
                            .filter(v -> v.getModel().equalsIgnoreCase(modelToSearch))
                            .findAny()
                            .ifPresentOrElse(
                                    v -> {
                                        System.out.println("Xe tìm thấy với mô hình " + modelToSearch + ":");
                                        v.display();  // Hiển thị thông tin xe
                                    },
                                    () -> System.out.println("Không tìm thấy xe nào với mô hình: " + modelToSearch)
                            );
                    break;
                case 5:
                    System.out.println("-------------------------THOÁT KHỎI CHƯƠNG TRÌNH--------------------------");
                    sc.close();
                    break;

                    default:
                        System.out.println("Chọn sai, vui lòng chọn lại!");
            }
        }while (chon!=5);

    }
}
