package Lab02;

import java.util.Scanner;

public class Bai01 {
    private String name;
    private String address;
    private double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public void view(){
        System.out.println("Tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Lương: "+salary);
    }

    public static void main(String[] args) {
        Bai01 b = new Bai01();
        b.input();
        b.view();
    }
}
