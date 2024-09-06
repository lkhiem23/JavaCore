import java.util.Scanner;

public class HoaDonBanhMy {
    String maHD;
    String ngayLap;
    String tenKH;
    String diaChiKH;
    int soLuong;
    float giaTien;
    float tongTienHang;
    float tienKM;
    float tongTien;


    public HoaDonBanhMy() {

    }

    public HoaDonBanhMy(String maHD, String ngayLap, String tenKH, String diaChiKH, int soLuong, float giaTien,float tongTienHang,float tienKM, float tongTien) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.tenKH = tenKH;
        this.diaChiKH = diaChiKH;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTienHang = tongTienHang;
        this.tienKM = tienKM;
        this.tongTien = tongTien;
    }
    public void nhap(){
        System.out.println("Nhập thông tin hóa đơn");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã hóa đơn: ");
        maHD = sc.nextLine();
        System.out.print("Nhập Ngày lập hóa đơn: ");
        ngayLap = sc.nextLine();
        System.out.print("Nhập Tên khách hàng: ");
        tenKH = sc.nextLine();
        System.out.print("Nhập Địa chỉ giao hàng: ");
        diaChiKH = sc.nextLine();
        System.out.print("Nhập Số lượng bánh cần giao: ");
        soLuong = sc.nextInt();
        System.out.print("Nhập Giá bán 1 chiếc bánh: ");
        giaTien = sc.nextFloat();

        tongTienHang = soLuong * giaTien;
    }

    public float tinhTienKMai(){

        if (soLuong >= 10){
            tienKM = (float) (tongTienHang*0.1);
            tongTien = tongTienHang - tienKM;
        } else if (soLuong >= 100) {
            tienKM = (float) (tongTienHang*0.2);
            tongTien = tongTienHang - tienKM;
        }
        return tienKM;

    }

    public void xuat(){
        System.out.println("Thông tin hóa đơn: ");
        System.out.println("Mã hóa đơn: "+maHD);
        System.out.println("Ngày lập hóa đơn: "+ngayLap);
        System.out.println("Tên khách hàng: "+tenKH);
        System.out.println("Địa chỉ khách hàng: "+diaChiKH);
        System.out.println("Số lượng bánh cần giao: "+soLuong);
        System.out.println("Giá bán 1 chiêc bánh: "+giaTien);
        System.out.println("Tổng tiền hàng: "+tongTienHang);
        System.out.println("Tiền khuyến mãi: "+tienKM);
        System.out.println("Tổng tiền phải thanh toán: "+tongTien);
    }


    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số lượng hóa đơn: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        /*
        HoaDonBanhMy obj = new HoaDonBanhMy();
        obj.nhap();
        obj.tinhTienKMai();
        obj.xuat();
        */

        HoaDonBanhMy[] hd = new HoaDonBanhMy[n];

        for(int i = 0; i < n; i++){
            HoaDonBanhMy obj = new HoaDonBanhMy();
            obj.nhap();
            obj.tinhTienKMai();
            hd[i] = obj; // Lưu hóa đơn vào mảng.
        }

        // Xuất hóa đơn:

        for (int i = 0; i < n; i++) {
            System.out.println("Hóa đơn "+(i+1) + ": ");
            hd[i].xuat();
        }

    }
}
