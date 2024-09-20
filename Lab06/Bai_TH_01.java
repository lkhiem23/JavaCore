import java.util.Scanner;

public class Bai_TH_01 {
    public static void main(String[] args) {
        String[] arrSV = new String[4];

        Scanner sc = new Scanner(System.in);

        // Nhập thông tin Sinh Viên:
        System.out.println("Nhập danh sách Sinh Viên: ");
        for (int i = 1; i < arrSV.length; i++) {
            System.out.print("Nhập tên sinh viên thứ "+ i + ": ");
            arrSV[i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("Danh sách sinh viên: ");
        for (int i = 1; i < arrSV.length; i++) {
            System.out.println("Sinh Viên thứ "+ i + ": " + arrSV[i]);
        }
    }
}
