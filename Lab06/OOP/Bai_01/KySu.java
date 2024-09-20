package Bai_01;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {

    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập ngành Đào Tạo: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }
}
