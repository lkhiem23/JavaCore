package vietnam;

import product.Product;

import java.util.Scanner;

public class GeneralManager {
private Product tthailand;
private Product vvietnam;
public GeneralManager() {
    tthailand = new Product();
    vvietnam = new Product();
}

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("======Menu======");
            System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
            System.out.println("2. Nhập n sản phẩm được nhập vào Thái Lan.");
            System.out.println("3. Hiển thị tất cả sản phẩm nhập khẩu tại Việt Nam và Thái Lan.");
            System.out.println("4. Sắp xếp tên sản phẩm tăng dần và hiển thị sau khi sắp xếp.");
            System.out.println("5. Tính giá sản phẩm tại Việt Nam và Thái Lan - Hiển thị giá bán.");
            System.out.println("6. Tìm kiếm theo giá bán.");
            System.out.println("7. Exit");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
                    int vietnam = sc.nextInt();
                    vvietnam.input(vietnam);
                    break;
                case 2:
                    System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
                    int thailand = sc.nextInt();
                    vvietnam.input(thailand);
                    break;
                case 3:
                    System.out.println("Hiển thị tất cả sản phẩm nhập khẩu tại Việt Nam và Thái Lan.");
                    System.out.println("Việt Nam: " );
                    vvietnam.display();
                    System.out.println("Thái Lan: ");
                    tthailand.display();
                    break;
                case 4:
                    vvietnam.input();
                case 1:
                    System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
                    int vietnam = sc.nextInt();
                    vvietnam.input();
                case 1:
                    System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
                    int vietnam = sc.nextInt();
                    vvietnam.input();
                case 1:
                    System.out.println("1. Nhập n sản phẩm được nhập vào Việt Nam.");
                    int vietnam = sc.nextInt();
                    vvietnam.input();
                default:
                    break;

            }
        }while (chon != 7);



    }



    public static void main(String[] args) {

    }
}
