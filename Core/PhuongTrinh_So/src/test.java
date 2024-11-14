import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhap n = ");
        Double n = sc.nextDouble();
        // System.out.println("Nhap b = ");
        // b = sc.nextDouble();

        System.out.printf("So " + n + "sau khi lam tron la: " + "%.0f", n);
    }
}