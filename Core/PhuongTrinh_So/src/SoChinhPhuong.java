import java.util.Scanner;
public class SoChinhPhuong{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        double a = Math.sqrt(n);

        if(a * a == n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}