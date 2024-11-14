import java.util.Scanner;

public class PTBac2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double a,b,c,delta;

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            delta = ((b*b) - (4*a*c));

            double SQRT = Math.sqrt(delta); 

            Double x1 = (-b + SQRT) / (2*a);
            Double x2 = (-b - SQRT) / (2*a);

            if(a == 0 && b == 0 && c == 0 ){
                System.out.println("INF");
            }
            if(delta < 0){
                System.out.println("NO");
                return;
            }
            if(delta >= 0){
                System.out.printf("%.2f", x1);
                System.out.printf(" %.2f", x2);
            }
        }
    }
}
