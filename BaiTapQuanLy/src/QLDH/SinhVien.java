/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kiemtra_8th4;

/**
 *
 * @author ADMIN
 */
public class SinhVien extends Nguoi {
    private int svnam;
    private String truong;
    
    public SinhVien(String hoten, int tuoi, int svnam, String truong){
        super(hoten, tuoi);
        this.svnam = svnam;
        this.truong = truong;
    }
    
    @Override
    public void ThongTin(){
        super.ThongTin();
        System.out.println("Sinh vien nam: " + svnam);
        System.out.println("Sinh vien truong: " + truong);
    }
}
