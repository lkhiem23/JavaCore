/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab3_bai5;

/**
 *
 * @author tung0
 */
public abstract class SinhVienPoly {
    private String hoten;
    private String nganh;
    public abstract float getDiem();
    public abstract String getHocluc();
    public abstract void hienthi();

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public void display(){
        System.out.println("Ho va ten "+hoten);
        System.out.println("Nganh hoc "+nganh);
        hienthi();
    }
    
    
}
