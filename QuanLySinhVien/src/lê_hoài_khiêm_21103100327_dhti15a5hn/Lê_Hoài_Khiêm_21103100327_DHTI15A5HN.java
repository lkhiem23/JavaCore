/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lê_hoài_khiêm_21103100327_dhti15a5hn;

import static java.lang.System.exit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lê_Hoài_Khiêm_21103100327_DHTI15A5HN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien quanLySV = new QuanLySinhVien();

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1));
            System.out.print("Ma Sinh Vien: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh (dd-mm-yyyy): ");
            String ngaySinhStr = scanner.nextLine();
            Date ngaySinh = null;
            try {
                ngaySinh = new SimpleDateFormat("dd-MM-yyyy").parse(ngaySinhStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.print("Nganh hoc: ");
            String nganhHoc = scanner.nextLine();

            System.out.print("Sinh vien (IT or Biz): ");
            String loaiSV = scanner.nextLine();
            if (loaiSV.equalsIgnoreCase("IT")) {
                System.out.print("Diem mon Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Diem mon HTML: ");
                double diemHTML = scanner.nextDouble();
                System.out.print("Diem mon CSS: ");
                double diemCSS = scanner.nextDouble();
                quanLySV.themSinhVien(new SinhVienIT(maSV, hoTen, ngaySinh, nganhHoc, diemJava, diemHTML, diemCSS));
            } 
            else if (loaiSV.equalsIgnoreCase("Biz")) {
                System.out.print("Diem mon Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Diem mon Sales: ");
                double diemSales = scanner.nextDouble();
                quanLySV.themSinhVien(new SinhVienBiz(maSV, hoTen, ngaySinh, nganhHoc, diemMarketing, diemSales));
            }

            scanner.nextLine(); 
        }
      
        System.out.println("1. Xuat thong tin sinh vien");
        System.out.println("2. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("3. Sap xep danh sach sinh vien giam dan theo diem trung binh");
        System.out.println("4. Tim kiem thong tin sinh vien");
        System.out.println("5. Xuat danh sach sinh vien nganh IT co hoc luc yeu");
        System.out.println("6. Ket thuc");
        int choice;
        do {
            System.out.print("Moi chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    quanLySV.Xuat();
                    break;
                case 2:
                    quanLySV.xuatSinhVienGioi();
                    break;
                case 3:
                    quanLySV.sapXepTheoDiemTB();
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String maSVCantim = scanner.nextLine();
                    SinhVien sv = quanLySV.timSinhVien(maSVCantim);
                    if (sv != null) {
                        System.out.println("Thong tin sinh vien:");
                        System.out.println(sv);
                    } else {
                        System.out.println("Khong tim thay sinh vien co ma " + maSVCantim);
                    }
                    break;
                case 5:
                    quanLySV.xuatSinhVienITYeu();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
   
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
