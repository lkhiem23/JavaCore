package Lab02;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        int a,b,c;
        float p,chuVi;
        double dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra tam giác:");
        System.out.print("Nhập cạnh a của tam giác: ");
        a = sc.nextInt();
        System.out.print("Nhập cạnh b của tam giác: ");
        b = sc.nextInt();
        System.out.print("Nhập cạnh c của tam giác: ");
        c = sc.nextInt();

        chuVi = a + b + c;
        p = chuVi/2;
        dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        if (a > 0 && b > 0 && c > 0 && a+b>c || a+c>b || b+c>a) {
            System.out.println("Tam giác hợp lệ.");
            System.out.println("Chu vi của tam giác: "+ chuVi);
            System.out.println("Diện tích của tam giác: "+ dienTich);
        }else {
            System.out.println("Tam giác không hợp lệ.");
        }


    }
}
