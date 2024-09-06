package Lab02;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        int a,b,c,d,max,max1,max2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Tìm số lớn nhất trong 4 số:");
        System.out.print("Nhập số thứ nhất: ");
        a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        c = sc.nextInt();
        System.out.print("Nhập số thứ tư: ");
        d = sc.nextInt();

        max1 = (a>b)?a:b;
        max2 = (c>d)?c:d;
        max = (max1>max2)?max1:max2;

        System.out.println("Số lớn nhất trong 4 số là : "+ max);

    }
}
