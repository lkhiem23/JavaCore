package Lab02;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String color;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập color: ");
            color = sc.nextLine();

            if (color.equalsIgnoreCase("r")) {  // Không phân biệt chữ hoa, chữ thường
                System.out.println("RED");
            } else if (color.equalsIgnoreCase("g")) {
                System.out.println("GREEN");
            } else if (color.equalsIgnoreCase("B")) {
                System.out.println("BLUE");
            }else {
                System.out.println("BLACK");
            }
        }while (!color.isEmpty());

    }
}
