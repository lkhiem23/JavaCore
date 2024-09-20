package Bai_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> dsCanBo;

    public QLCB() {
        dsCanBo = new ArrayList<CanBo>();
    }

    // Thêm Cán Bộ
    public void themCB(CanBo canBo){
        dsCanBo.add(canBo);
    }

    // Tìm kiếm Cán Bộ theo tên
    public void timKiem(String hoTen){
        for(CanBo canBo : dsCanBo){
            if(canBo.getHoTen().equals(hoTen)){
                canBo.hienthi();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }

    //Hiển thị thông tin tất cả Cán Bộ
    public void hienThiDsCanBo(){
        for(CanBo canBo : dsCanBo){
            canBo.hienthi();
            System.out.println();
        }
    }

    //Thoát khỏi chương trình
    public void thoat(){
        System.out.println("Thoát chương trình: ");
        System.exit(0);
    }

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Thêm mới Cán Bộ");
            System.out.println("2. Tìm kiếm Cán Bộ theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách Cán Bộ");
            System.out.println("4. Thoát chương trình");
            System.out.println("Chọn chức năng: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon){
                case 1:
                    System.out.println("1. Công Nhân");
                    System.out.println("2. Kỹ Sư");
                    System.out.println("3. Nhân Viên");
                    System.out.println("Chọn loại Cán Bộ: ");
                    int loai = sc.nextInt();
                    sc.nextLine(); // Đọc bỏ ký tự xuống dòng

                    if (loai == 1){
                        qlcb.themCB(new CongNhan());
                    }else if (loai == 2){
                        qlcb.themCB(new KySu());
                    }else if (loai == 3){
                        qlcb.themCB(new NhanVien());
                    }  else {
                System.out.println("Lựa chọn không hợp lệ.");
            }
            break;
            case 2:
                System.out.print("Nhập họ tên cần tìm: ");
                String tenCanTim = sc.nextLine();
                qlcb.timKiem(tenCanTim);
                break;
            case 3:
                qlcb.hienThiDsCanBo();
                break;
            case 4:
                qlcb.thoat();
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }

    }

}

