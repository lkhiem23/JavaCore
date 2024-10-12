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
public class GiaoVien extends Nguoi {
    private String monday;
    private double luongcb;
    private double hsl;
    private Boolean bienche;
    
    public GiaoVien(String hoten,int tuoi,String monday, double luongcb, double hsl, Boolean bienche) {
        super(hoten,tuoi);
        this.monday = monday;
        this.luongcb = luongcb;
        this.hsl = hsl;
        this.bienche = bienche;
    }

    public double Tinhluong(){
        if (bienche){
            return luongcb*hsl;
        }
        else return luongcb;
    }
    @Override
    public void ThongTin() {
        super.ThongTin();
        System.out.println("Môn dạy : " + monday);
        System.out.println("Biên chế : " + (bienche? "Có":"Không"));
        System.out.println("Tổng lương : " + Tinhluong());
    }

}
