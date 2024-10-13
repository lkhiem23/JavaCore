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
public class SinhVienBiz extends SinhVienPoly {
    private float diemMarketing;
    private float diemSales;

    public SinhVienBiz(String hoten, String nganh, float diemMarketing, float diemSales) {
        setHoten(hoten);
        setNganh(nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public float getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }

    @Override
    public String getHocluc() {
        float diem = getDiem();
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 7) {
            return "Trung Binh";
        } else if (diem < 8) {
            return "Kha";
        } else {
            return "Gioi";
        }
    }

    @Override
    public void hienthi() {
        System.out.println("Diem Marketing: " + diemMarketing);
        System.out.println("Diem Sales: " + diemSales);
        System.out.println("Diem trung binh: " + getDiem());
        System.out.println("Hoc luc: " + getHocluc());
    }
}
