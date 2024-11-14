import java.text.DecimalFormat;
import java.util.Scanner;
public class LamTronSo{
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Nhap n = ");
            Double n = sc.nextDouble();
            // System.out.println("Nhap b = ");
            // b = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("#");

            System.out.println("So " + n + "sau khi lam tron la: " + df.format(n));
        }
    }
}