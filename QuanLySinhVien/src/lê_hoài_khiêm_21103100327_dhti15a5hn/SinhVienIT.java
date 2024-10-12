/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lê_hoài_khiêm_21103100327_dhti15a5hn;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien {
     private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String maSV, String hoTen, Date ngaySinh, String nganhHoc, double diemJava, double diemHTML, double diemCSS) {
        super(maSV, hoTen, ngaySinh, nganhHoc);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double tinhDiemTB() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}
