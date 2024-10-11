/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lehoaikhiem_ktra_25_5;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String lop;

    public SVien() {
    }

    
    public SVien(String maSV, String hoTen, int namSinh, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void nhapThongTin(Scanner scanner){
        System.out.println("Nhập mã sinh viên : ");
        this.maSV = scanner.nextLine();
        System.out.println("Nhập họ tên :");
        this.hoTen = scanner.nextLine();
        while(true){
            try{
                System.out.println("Nhập năm sinh :");
                this.namSinh = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Lỗi :"+e.getMessage());
            }
        }
        System.out.println("Nhập lớp :");
        this.lop=scanner.nextLine();
    }
    
    public void hienThiThongTin(){
        System.out.println("Mã sinh viên : "+this.maSV);
        System.out.println("Họ tên : "+this.hoTen);
        System.out.println("Năm sinh : "+this.namSinh);
        System.out.println("Lớp : "+this.lop);
    }
    
    
}
