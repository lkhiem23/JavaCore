import java.util.Scanner;

public class Bai_01 {
    public static void main(String[] args) {
        int[] n = new int[11];
        Scanner sc = new Scanner(System.in);

        //Nhập mảng
        System.out.println("Nhập giá trị cho các phần tử trong mảng: ");
        for (int i = 0; i < 11; i++) {
            System.out.printf("n[%d] = ", i);
            n[i] = sc.nextInt();
        }

        //Hiển thị mảng
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%3d", n[i]);
        }
    }
}
