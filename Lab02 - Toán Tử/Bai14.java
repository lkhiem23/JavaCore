package Lab02;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
       int dinhMuc, vuotDinhMuc, chiSoMoi, chiSoCu;
       double tongTien,tienDinhMuc = 0, tienVuotDinhMuc = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chỉ số cũ: ");
        chiSoCu = sc.nextInt();
        System.out.print("Nhập vào chỉ số mới: ");
        chiSoMoi = sc.nextInt();


            dinhMuc = chiSoMoi - chiSoCu;
            vuotDinhMuc = dinhMuc - 50;

            /*
            if (dinhMuc <= 50){
                tienDinhMuc = dinhMuc * 230;
            } else if (vuotDinhMuc <= 50) {
                tienVuotDinhMuc = vuotDinhMuc * 480;
            } else if (50 < vuotDinhMuc && vuotDinhMuc < 100) {
                tienVuotDinhMuc = vuotDinhMuc*700;
            }else if (vuotDinhMuc >= 100) {
                tienVuotDinhMuc = vuotDinhMuc*900;
            }
            */
        if(chiSoCu > chiSoMoi){
            System.out.println("Vui lòng nhập lại.");

        }else {
            if (dinhMuc <= 50) {
        tienDinhMuc = dinhMuc * 230;
             } else {
                 tienDinhMuc = 50 * 230; // Calculate the base 50 kW first
                 vuotDinhMuc = dinhMuc - 50;

        if (vuotDinhMuc <= 50) {
            tienVuotDinhMuc = vuotDinhMuc * 480;
        } else if (vuotDinhMuc <= 100) {
            tienVuotDinhMuc = 50 * 480 + (vuotDinhMuc - 50) * 700;
        } else {
            tienVuotDinhMuc = 50 * 480 + 50 * 700 + (vuotDinhMuc - 100) * 900;
        }
    }

}

        tongTien = tienDinhMuc + tienVuotDinhMuc;

        System.out.println("Chỉ số cũ: "+ chiSoCu +" kW");
        System.out.println("Chỉ số mới: "+chiSoMoi +" kW");
        System.out.println("Tiền trả định mức: "+tienDinhMuc+" kW");
        System.out.println("Tiền trả vượt định mức: "+tienVuotDinhMuc+" kW");
        System.out.println("Tổng tiền phải trả: "+ tongTien);


    }
}
