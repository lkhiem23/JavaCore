package Lab02;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        float x,y;
        String toanTu;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số và 1 trong 4 toán tử (+, -, *, /) để thực hiện tính toán.");
        System.out.print("Nhập vào số thứ nhất: x = ");
        x = sc.nextFloat();
        System.out.print("Nhập vào số thứ hai: y = ");
        y = sc.nextFloat();
        System.out.print("Nhập vào 1 trong 4 toán tử (+, -, *, /): ");
        toanTu = sc.next();

        if (toanTu.equals("+")) {
            System.out.println("Kết quả phép toán x + y là: "+ (x + y));
        }else if(toanTu.equals("-")) {
            System.out.println("Kết quả phép toán x - y là: "+ (x - y));
        }else if(toanTu.equals("*")) {
            System.out.println("Kết quả phép toán x * y là: "+ (x * y));
        }else {
            System.out.println("Kết quả phép toán x / y là: "+ (x / y));
        }
    }
}
