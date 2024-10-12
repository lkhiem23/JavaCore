/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lê_hoài_khiêm_21103100327_dhti15a5hn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {
     private ArrayList<SinhVien> danhSachSV;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }
  
    public void Xuat() {
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
    }

    public void xuatSinhVienGioi() {
        for (SinhVien sv : danhSachSV) {
            if (sv.xepLoai().equalsIgnoreCase("Gioi")) {
                System.out.println(sv);
            }
        }
    }

    public void sapXepTheoDiemTB() {
        Collections.sort(danhSachSV, (sv1, sv2) -> Double.compare(sv2.tinhDiemTB(), sv1.tinhDiemTB()));
        Xuat();
    }

    public SinhVien timSinhVien(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public void xuatSinhVienITYeu() {
        for (SinhVien sv : danhSachSV) {
            if (sv instanceof SinhVienIT && sv.xepLoai().equalsIgnoreCase("Yeu")) {
                System.out.println(sv);
            }
        }
    }
}