/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab3_bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class Test {
    private static final ArrayList<SinhVienPoly> danhSachSinhVien = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    nhapDanhSachSinhVien();
                    break;
                case 2:
                    xuatThongTinSinhVien();
                    break;
                case 3:
                    xuatDanhSachSinhVienGioi();
                    break;
                case 4:
                    sapXepDanhSachSinhVienTheoДiem();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\n===== Quản lý sinh viên =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất thông tin sinh viên");
        System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
        System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
        System.out.println("5. Kết thúc");
        System.out.print("Lựa chọn của bạn: ");
    }

    private static void nhapDanhSachSinhVien() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Loại sinh viên (1. IT, 2. Biz): ");
            int loaiSinhVien = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Ngành: ");
            String nganh = scanner.nextLine();

            if (loaiSinhVien == 1) {
                System.out.print("Điểm Java: ");
                float diemJava = scanner.nextFloat();
                System.out.print("Điểm CSS: ");
                float diemCss = scanner.nextFloat();
                System.out.print("Điểm HTML: ");
                float diemHtml = scanner.nextFloat();
                danhSachSinhVien.add(new SinhvienIT(hoTen, nganh, diemJava, diemCss, diemHtml));
            } else {
                System.out.print("Điểm Marketing: ");
                float diemMarketing = scanner.nextFloat();
                System.out.print("Điểm Sales: ");
                float diemSales = scanner.nextFloat();
                danhSachSinhVien.add(new SinhVienBiz(hoTen, nganh, diemMarketing, diemSales));
            }
        }
    }

    private static void xuatThongTinSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            System.out.println("\n===== Thông tin sinh viên =====");
            danhSachSinhVien.stream().map((sinhVien) -> {
                sinhVien.display();
                return sinhVien;
            }).forEach((_item) -> {
                System.out.println();
            });
        }
    }

    private static void xuatDanhSachSinhVienGioi() {
        ArrayList<SinhVienPoly> danhSachSinhVienGioi = new ArrayList<>();
        danhSachSinhVien.stream().filter((sinhVien) -> (sinhVien.getHocluc().equals("Gioi"))).forEach((sinhVien) -> {
            danhSachSinhVienGioi.add(sinhVien);
        });

        if (danhSachSinhVienGioi.isEmpty()) {
            System.out.println("Không có sinh viên giỏi.");
        } else {
            System.out.println("\n===== Danh sách sinh viên giỏi =====");
            danhSachSinhVienGioi.stream().map((sinhVien) -> {
                sinhVien.display();
                return sinhVien;
            }).forEach((_item) -> {
                System.out.println();
            });
        }
    }

    private static void sapXepDanhSachSinhVienTheoДiem() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            Collections.sort(danhSachSinhVien, (SinhVienPoly sv1, SinhVienPoly sv2) -> Float.compare(sv2.getDiem(), sv1.getDiem()));

            System.out.println("\n===== Danh sách sinh viên sắp xếp theo điểm =====");
            danhSachSinhVien.stream().map((sinhVien) -> {
                sinhVien.display();
                return sinhVien;
            }).forEach((_item) -> {
                System.out.println();
            });
        }
    }
}
