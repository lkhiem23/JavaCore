
import java.util.Scanner;


public class PTBac1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        double a,b,c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = -b / a;


        if(a == 0){
            if(b==0){
                System.out.println("INF");
                return;
            }else{
                System.out.println("NO");
                return;
            }
        }
            System.out.printf("%.2f", c);
    }
}
