import java.util.Scanner;

public class Mang_2_Chieu {
    public static void main(String[] args) {
        // Khai báo mảng

        int row = 3;
        int col = 4;

        int [][] arr = new int[row][col];

        // Khởi tạo giá trị

        int [][] mang ={
                {11,22,13,14},
                {06,12,20,03},
                {01,12,20,04}
        };

        // in ra các phần tử trong mảng ở dạng ma trận matrix
        System.out.println("Danh sach: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%4d", mang[i][j]);
            }
            System.out.println();
        }


        // Nhập số dòng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập row: ");
        row = sc.nextInt();
        System.out.println("Nhập col: ");
        col = sc.nextInt();

        //Khai báo mảng
        int[][] arays = new int[row][col];

        //Nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập giá trị cho các phẩn tử trong mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d] = ",i,j);
                arays[i][j] = sc.nextInt();
            }
        }

        // Hiển thị mảng
        System.out.println("Danh sách: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", arays[i][j]);
            }
        }
        System.out.println();

    }
}
