/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai1_lab2;
import static bai1_lab2.SanPham.menu;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class menu {
    public static void main(String[] args) {
        int n = 0;
        int luachon = 0;
        SanPham a = new SanPham();
        SanPham[] sanpham = null;

        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn : ");
            Scanner sc = new Scanner(System.in);
            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1: {
                    System.out.println("Nhập vào n : ");
                    n = sc.nextInt();
                    sanpham = new SanPham[n];
                    for (int i = 0; i < n; i++) {
                        sanpham[i] = new SanPham();
                        sanpham[i].Nhap();
                    }
                    break;
                }
                case 2: {
                    if (sanpham == null) {
                        System.out.println("Bạn chưa nhập dữ liệu !");
                    } else {
                        for (int i = 0; i < sanpham.length; i++) {
                            System.out.println("Thông tin hàng hóa thứ " + (i + 1));
                            sanpham[i].Xuat();
                        }
                    }
                    break;
                }
                case 3: {
                    if (sanpham == null) {
                        System.out.println("Bạn chưa nhập dữ liệu !");
                    } else {
                        //a.sapxep(sanpham);
                        Arrays.sort(sanpham, (SanPham o1, SanPham o2) -> {
                            if (o1.getgiaBan() > o2.getgiaBan()) {
                                return -1;
                            } else if (o1.getgiaBan() == o2.getgiaBan()) {
                                return 0;
                            } else {
                                return 1;
                            }
                        });
                        System.out.println("Dữ liệu sau khi sắp xếp là : ");
                        for (int i = 0; i < sanpham.length; i++) {
                            System.out.println("Thông tin hàng hóa thứ " + (i + 1));
                            sanpham[i].Xuat();
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Chương trình đã kết thúc.");
                    break;
                }
                default: {
                    System.out.println("Không có lựa chọn của bạn !");
                    break;
                }
            }

        } while (luachon != 4);
}

}