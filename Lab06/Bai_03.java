import java.util.Scanner;

public class Bai_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        //Nhập số lượng phần tử có trong mảng:
        System.out.print("Nhập số phần tử có trong mảng: ");
        n = sc.nextInt();

        int[] mang = new int[n];

        //Nhập giá trị cho mảng:
        System.out.println("Nhập giá trị cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("n[%d] = ", i);
            mang[i] = sc.nextInt();
        }

        //Hiển thị mảng:
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", mang[i]);
        }


    }
}
