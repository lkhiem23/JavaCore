import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng phần tử có trong mảng: ");
        n = sc.nextInt();
        Integer[] mang = new Integer[n];

        //Nhập vào giá trị của phần tử trong mảng
        System.out.println("Nhập giá trị cho từng phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("n[%d] = ", i );
            mang[i] = sc.nextInt();
        }

        //Tìm phần tử max trong mảng
       int min = (int) Collections.min(Arrays.asList(mang));
       int max = (int) Collections.max(Arrays.asList(mang));

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
