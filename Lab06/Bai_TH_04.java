import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai_TH_04 {
    private String tenSach;
    private int namXB;
    private String tacGia;
    private int soTrang;
    private float giaTien;

    public Bai_TH_04() {

    }

    public Bai_TH_04(float giaTien, int namXB, int soTrang, String tacGia, String tenSach) {
        this.giaTien = giaTien;
        this.namXB = namXB;
        this.soTrang = soTrang;
        this.tacGia = tacGia;
        this.tenSach = tenSach;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập Năm Xuất Bản: ");
        namXB = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextFloat();
    }

    public void hienthi(){
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Năm xuất bản: " + namXB);
        System.out.println("Tên tác giả: " + tacGia);
        System.out.println("Số trang: " + soTrang);
        System.out.println("Giá tiền: " + giaTien);
    }


    @Override
    public String toString() {
        return "Bai_TH_04{" +
                "giaTien=" + giaTien +
                ", tenSach='" + tenSach + '\'' +
                ", namXB=" + namXB +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public class BaiTH04 {
        ArrayList<Bai_TH_04> books = new ArrayList<>();

        public void nhapDL() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Số sách muốn nhập: ");
            int sachNhap = sc.nextInt();

            for (int i = 0; i < sachNhap; i++) {
                System.out.println("Cuốn thứ: " + (i + 1));
                Bai_TH_04 book = new Bai_TH_04();
                book.nhap();
                books.add(book);
            }
        }

        public void hienthiDL() {
            System.out.println("Danh sách sách trong thư viện: ");
            for (int i = 0; i < books.size(); i++) {
                Bai_TH_04 book = books.get(i);
                System.out.println("Cuốn thứ " + (i + 1) + ": " + book.toString());
            }
        }
        public void menu(){
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Xóa dữ liệu");
            System.out.println("4. Thoát");
        }

        public void xoa() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Thứ tự muốn xóa: ");
            int id = sc.nextInt();
            if (id < books.size() && id >= 0) {
                books.remove(id);
            }
        }

    }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Bai_TH_04 outer = new Bai_TH_04();
            Bai_TH_04.BaiTH04 bti = outer.new BaiTH04();
            int chon;


            do {
                bti.menu();
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        bti.nhapDL();
                        break;

                    case 2:
                        bti.hienthiDL();
                        break;
                    case 3:
                        bti.xoa();
                        break;
                    case 4:
                        System.exit(0);
                }
            }while(chon>=1);

        }

    }
