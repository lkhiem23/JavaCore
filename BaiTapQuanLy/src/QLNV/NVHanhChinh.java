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
public class NVHanhChinh extends NhanVien{
    
    private int soNgayDilam;
    

    public NVHanhChinh(int soNgayDilam) {
        this.soNgayDilam = soNgayDilam;
    }

    public NVHanhChinh(int soNgayDilam, String hoTen, String gioiTinh, int tuoi, String diaChi) {
       super(hoTen, gioiTinh, tuoi, diaChi);
        this.soNgayDilam = soNgayDilam;
    }
    
    public NVHanhChinh(){
        
    }

    public int getSoNgayDilam() {
        return soNgayDilam;
    }

    public void setSoNgayDilam(int soNgayDilam) {
        this.soNgayDilam = soNgayDilam;
    }
    
    int tinhLuong(){
        return 200000 * soNgayDilam;
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Số ngày đi làm: " + soNgayDilam);
        System.out.println("Lương: " + tinhLuong());
    }
    
}
