package Lab02;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        float toan,ly,hoa,tongDiem;
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập điểm môn Toán: ");
        toan = sc.nextFloat();
        System.out.print("Nhập điểm môn Lý: ");
        ly = sc.nextFloat();
        System.out.print("Nhập điểm môn Hóa: ");
        hoa = sc.nextFloat();

        tongDiem = toan + ly + hoa;
        System.out.println("Tổng điểm: " + tongDiem);

        if (tongDiem >= 15 && toan >= 4 && ly >= 4 && hoa >= 4){
            System.out.println("\nThi đậu");

            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Học đều các môn");
            }else{
                System.out.println("Học chưa đều các môn");
            }

        }else{
            System.out.println("\nThi hỏng");
        }


    }
}
