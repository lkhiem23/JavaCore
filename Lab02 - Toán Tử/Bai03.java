package Lab02;

import java.util.Scanner;

public class Bai03 {
    private String ten;
    private String msv;
    private float diemLT;
    private float diemTH;
    private float diemTB;


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên Sinh Viên: ");
        ten = sc.nextLine();
        System.out.print("Nhập mã Sinh Viên: ");
        msv = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết Java: ");
        diemLT = sc.nextFloat();
        System.out.print("Nhập điểm thực hành Java: ");
        diemTH = sc.nextFloat();
    }

    public void rank(){
        diemTB = (diemLT+diemTH) / 2;

        if (diemLT < 4){
            System.out.println("Thi lại lý thuyết.");
        } else if (diemTH < 4) {
            System.out.println("Thi lại thực hành.");
        } else if (diemTH < 4 && diemLT <4) {
            System.out.println("Sinh viên phải học lại.");
        } else if (diemTB >=4 && diemTB <= 7) {
            System.out.println("Sinh viên đạt môn Java.");
        } else if (diemTB > 7) {
            System.out.println("Sinh viên xuất sắc môn Java.");
        }
    }


    public void view(){
        System.out.println("\nTHÔNG TIN SINH VIÊN:");
        System.out.println("Tên sinh viên: "+ten);
        System.out.println("Mã sinh viên: "+msv);
        System.out.println("Điểm lý thuyết: "+diemLT);
        System.out.println("Điểm thực hành: "+diemTH);
        System.out.println("Điểm trung bình của sinh viên: "+(diemLT+diemTH)/2);
    }

    public static void main(String[] args) {
       Bai03 b = new Bai03();
       b.input();
       b.view();

       System.out.printf("Với mức điểm như trên, xếp loại của sinh viên là: ");
       b.rank();

    }
}
