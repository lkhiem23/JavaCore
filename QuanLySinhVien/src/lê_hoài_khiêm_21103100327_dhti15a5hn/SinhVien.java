/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lê_hoài_khiêm_21103100327_dhti15a5hn;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class SinhVien {

    private static Object getNgaySinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected String maSV;
    protected String hoTen;
    protected String ngaySinh;
    protected String nganhHoc;

    public SinhVien(String maSV, String hoTen, String ngaySinh, String nganhHoc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganhHoc = nganhHoc;
    }

    public double tinhDiemTB() {
        return 0.0;
    }

    public String xepLoai() {
        double diemTB = tinhDiemTB();
        if (diemTB < 5.0) return "Yếu";
        else if (diemTB < 7.0) return "Trung binh";
        else if (diemTB < 8.0) return "Kha";
        else return "Gioi";
    }

    public String getMaSV() {
        return maSV;
    }
    
    
    public String toString() {
        return "Ma SV: " + maSV + ", Ho ten: " + hoTen + ", Ngay sinh: " + new SimpleDateFormat("dd-mm-yyyy").format(SinhVien.getNgaySinh()) + ", Nganh hoc: " + nganhHoc;
    }
}
