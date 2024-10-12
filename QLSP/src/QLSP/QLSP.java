/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai2;

/**
 *
 * @author ADMIN
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class QLSP {
    private static ArrayList<SP> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình");
            System.out.println("5. Tìm và xóa sản phẩm theo tên");
            System.out.println("6. Xuất giá trung bình của các sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    inputProducts();
                    break;
                case 2:
                    displayProducts(products);
                    break;
                case 3:
                    displayRandomProducts();
                    break;
                case 4:
                    sortByPriceDescending();
                    break;
                case 5:
                    deleteProductByName();
                    break;
                case 6:
                    calculateAveragePrice();
                    break;
                case 7:
                    System.out.println("Ứng dụng kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }    
    }
    private static void inputProducts() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline character
            products.add(new SP(name, price));
        }
    }

    private static void displayProducts(ArrayList<SP> productList) {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        for (SP product : productList) {
            System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
        }
    }

    private static void displayRandomProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        Collections.shuffle(products);
        displayProducts(products);
    }

    private static void sortByPriceDescending() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("Danh sách sản phẩm được sắp xếp giảm dần theo giá:");
        for (SP product : products) {
            System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
        }
    }

    private static void deleteProductByName() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (SP product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm có tên '" + name + "'.");
        }
    }

    private static void calculateAveragePrice() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        double total = 0;
        for (SP product : products) {
            total += product.getPrice();
        }
        double average = total / products.size();
        System.out.println("Giá trung bình của các sản phẩm: " + average);
    }    
        }