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
public class SinhvienIT extends SinhVienPoly {
    private float diemJava;
    private float diemCss;
    private float diemHtml;

    public SinhvienIT(String hoten, String nganh, float diemJava, float diemCss, float diemHtml) {
        setHoten(hoten);
        setNganh(nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public float getDiem() {
        return (2*diemJava + diemCss + diemHtml) / 4;
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
        System.out.println("Diem Java: " + diemJava);
        System.out.println("Diem CSS: " + diemCss);
        System.out.println("Diem HTML: " + diemHtml);
        System.out.println("Diem trung binh: " + getDiem());
        System.out.println("Hoc luc: " + getHocluc());
    }
}

