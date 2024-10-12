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
public class SinhVienBiz extends SinhVien {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String maSV, String hoTen, Date ngaySinh, String nganhHoc, double diemMarketing, double diemSales) {
        super(maSV, hoTen, ngaySinh, nganhHoc);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double tinhDiemTB() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
