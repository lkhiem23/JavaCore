import java.util.Scanner;

public class BaiTH06 {


    public int view() {
        System.out.println("==============MENU==============");
        System.out.println("1. Nhập thông tin sinh viên.");
        System.out.println("2. Hiển thị thông tin sinh viên.");
        System.out.println("3. Tìm kiếm sinh viên. ");
        System.out.println("4. Sinh viên xuất sắc nhất.");
        System.out.println("5. Thoát");
        System.out.println("Mời nhập từ 1 --> 5");
        System.out.println("-------------------------------");

        Scanner sc = new Scanner(System.in);
        return 0;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String msv, hoTen;
        System.out.println("Nhập thông tin sinh viên: ");
        System.out.print("Nhập Mã Sinh Viên: ");
        msv = sc.nextLine();
        System.out.print("Nhập Họ Tên: ");
        hoTen = sc.nextLine();
    }

        public static void main (String[]args){
            BaiTH06 b = new BaiTH06();
            b.view();

        }
    }
