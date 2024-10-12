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
public class Nguoi {
    private String hoten;
    private int tuoi;

    public Nguoi(String hoTen, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;

    }
    public void ThongTin(){
       System.out.println("Họ tên: " + hoten);
       System.out.println("Tuổi: " + tuoi);
   }
}

