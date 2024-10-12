/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baiktra;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baiktra {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien ql = new QuanLyNhanVien();
        while (true) {
            System.out.println("Chọn 1 hành động thực hiện");
            System.out.println("bấm phím 1 để thêm nhân viên");
            System.out.println("bấm phím 2 để hiển thị danh sách nhân viên");
            System.out.println("bấm phím 3 để hiển thị tổng lương phải trả cho nhân viên");
            System.out.println("bấm phím 4 để hiển thị nhân viên hành chính có lương cao nhất");
            System.out.println("bấm phím 5 để hiển thị giảng viên lương cao nhất");
            System.out.println("bấm 0 để thoát");
            sc = new Scanner (System.in);
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1":
                    System.out.println("--------Chức năng thêm nhân viên--------");
                    System.out.println("Nhập họ tên: ");
                    String hoTen = sc.nextLine();

                    System.out.println("Nhập giới tính: ");
                    String sex = sc.nextLine();

                    System.out.println("Nhập tuổi: ");

                    int age = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println("Nhập địa chỉ: ");
                    String adress = sc.nextLine();

                    System.out.println("Bạn muốn thêm nhân viên hành chính (1), Giảng Viên (2)");
                    String luaChonThem = sc.nextLine();
                    switch (luaChonThem) {

                        case "1":
                            System.out.println("Nhập số ngày đi làm: ");
                            int ngayDiLam = sc.nextInt();
                            NVHanhChinh nvhc = new NVHanhChinh(ngayDiLam, hoTen, sex, age, adress);
                            ql.themNhanVien(nvhc);
                            System.out.println("Đã thêm!");
                            break;
                        case "2":
                            System.out.println("Nhập số giờ đi làm: ");
                            int gioDiLam = sc.nextInt();
                            GiangVien gv = new GiangVien(gioDiLam, hoTen, sex, age, adress);
                            ql.themNhanVien(gv);
                            System.out.println("Đã thêm!");
                            break;
                        default:
                            System.out.println("Vui lòng chọn lại!");
                            break;
                    }

                    break;
                case "2":
                    System.out.println("--------Chức năng hiển thị danh sách nhân viên--------");
                    ql.listNhanVien();
                    break;
                case "3":
                    
                    ql.tongTienPhaiTra();
                    break;
                case "4":
                    ql.timKiemNvhc();
                    break;
                case "5":
                    ql.timKiemGv();
                    break;
                case "0":
                    exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        }
    }
 }
    
