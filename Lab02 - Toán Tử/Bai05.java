package Lab02;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra số chẵn lẻ");


        do{
            System.out.println("\nNhập vào số nguyên N: ");
            a = sc.nextInt();
            if (a%2 == 0){
                System.out.println("Đây là số chẵn.");
            } else {
                System.out.println("Đây là số lẻ.");
            }
        }while (a>0);

    }
}
