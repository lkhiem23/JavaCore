/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai1_lab2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
    public class SanPham implements Comparable<SanPham> {

    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;

    public SanPham() {
    }

    // 
    public SanPham(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    // Phương thức set, get.
    public String gettenHangHoa() {
        return tenHangHoa;
    }

    public void settenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getnhaSanXuat() {
        return nhaSanXuat;
    }

    public void setnhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getgiaBan() {
        return giaBan;
    }

    public void setgiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên hàng hóa : ");
        this.tenHangHoa = sc.nextLine();
        System.out.println("Nhập vào nhà sản xuất sản phẩm : ");
        this.nhaSanXuat = sc.nextLine();
        System.out.println("Nhập vào giá của sản phẩm : ");
        this.giaBan = Float.parseFloat(sc.nextLine());

    }

    public void Xuat() {
        System.out.println("Tên hàng hóa : " + tenHangHoa);
        System.out.println("Nhà sản xuất : " + nhaSanXuat);
        System.out.println("Giá bán : " + giaBan);
    }

        public static void menu() {
        System.out.println("-----MENU-----");
        System.out.println("1. Nhập thông tin cho n sản phẩm .");
        System.out.println("2. Hiển thị thông tin vừa nhập .");
        System.out.println("3. Sắp xếp thông tin giảm dần theo giá và hiển thị .");
        System.out.println("4. Thoát chương trình .");
    }

    public static void sapxep(SanPham[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].giaBan < c[j].giaBan) {
                    SanPham temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }

    
    @Override
    public int compareTo(SanPham ob) {
        if (giaBan > ob.getgiaBan()) {
            return -1;
        } else if (giaBan == ob.getgiaBan()) {
            return 0;
        } else {
            return 1;
        }
}
    }