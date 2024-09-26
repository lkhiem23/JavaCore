package luatdoanhnghiep.khoinhanuoc.tienluong;

public class TienLuong {
    public static final float Bac_Trung_Cap = 1.44f;
    public static final float Bac_Cao_Dang = 1.80f;
    public static final float Bac_Dai_Hoc = 2.30f;

    public static final double Luong_Co_Ban = 2889000;
    public static final float He_So_BHXH = 16;
    public static final float He_So_Tham_Nien = 5;

    public static double luongCB(float hocVi, int namCongTac){
        double luongCB = (hocVi * Luong_Co_Ban) + namCongTac *(5/100*Luong_Co_Ban);
        return luongCB;
    }

    public static double soTienBH(double luong){
        return (He_So_BHXH /100)*luong;
    }


}
