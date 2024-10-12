/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baiktra;

/**
 *
 * @author ADMIN
 */
public class GiangVien extends NhanVien{
    private int soGioLam;

    
     public GiangVien(int soGioLam, String hoTen, String gioiTinh, int tuoi, String diaChi) {
       super(hoTen, gioiTinh, tuoi, diaChi);
        this.soGioLam = soGioLam;
    }
    public GiangVien(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    
    public GiangVien(){
        
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    
    int tinhLuong(){
       
        return soGioLam * 200000;
         
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Tổng giờ làm: " + soGioLam);
        System.out.println("Lương: " + tinhLuong());
    }
}
