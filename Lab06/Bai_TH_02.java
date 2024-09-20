import java.io.PrintStream;
import java.util.Scanner;

public class Bai_TH_02 {
    public static void main(String[] args) {
        int ten = 2;
        int luong = 2;

        String[][] nhanVien = new String[ten][luong];

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên: ");
        for(int i = 0; i < ten; i++){
            for(int j = 0; j < luong; j++){
                System.out.printf("arr[%d][%d] = ",i,j);
                nhanVien[i][j] = sc.nextLine();
            }
        }

        System.out.println("Danh sách nhân viên: ");
        for (int i = 0; i < ten; i++) {
            for (int j = 0; j < luong; j++) {
                 System.out.println(nhanVien[i][j]);
            }
        }
        System.out.println();

// Sắp xếp lương tăng dần:
        for (int i = 0; i < nhanVien.length - 1; i++) {
            for (int j = i + 1; j < nhanVien.length; j++) {
                if (Float.parseFloat(nhanVien[j][1]) < Float.parseFloat(nhanVien[i][1])) {
                    // Hoán đổi thông tin nhân viên
                    String[] temp = nhanVien[i];
                    nhanVien[i] = nhanVien[j];
                    nhanVien[j] = temp;
                }
            }
        }

// Danh sách nhân viên sau khi sắp xếp

        System.out.println("Danh sách nhân viên sau khi sắp xếp: ");
        for (int i = 0; i < ten; i++) {
            for (int j = 0; j < luong; j++) {
                System.out.print(nhanVien[i][j] + " ");
            }
        }
        System.out.println();

    }
}
