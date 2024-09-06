package Lab02;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        String K,G,B;
        String computer;

        Scanner sc = new Scanner(System.in);
        K = sc.nextLine();


        switch (K){
            case "K":
                System.out.println("Hòa");
                break;
            case "B":
                System.out.println("Thua");
                break;
            case "G":
                System.out.println("Thắng");
                break;
                default:
                    System.out.println("Vui lòng nhập K hoặc G hoặc B để bắt đầu trò chơi");

        }
        G = sc.nextLine();

        switch (G){
            case "K":
                System.out.println("Thua");
                break;
            case "B":
                System.out.println("Thắng");
                break;
            case "G":
                System.out.println("Hòa");
                break;
            default:
                System.out.println("Vui lòng nhập K hoặc G hoặc B để bắt đầu trò chơi");

        }
        B = sc.nextLine();
        switch (B){
            case "K":
                System.out.println("Thắng");
                break;
            case "B":
                System.out.println("Hòa");
                break;
            case "G":
                System.out.println("Thua");
                break;
            default:
                System.out.println("Vui lòng nhập K hoặc G hoặc B để bắt đầu trò chơi");

        }


    }
}
