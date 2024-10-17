
import java.util.Scanner;
import java.lang.Math;
public class learn {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap a: ");
       int a = sc.nextInt();
       System.out.println("Nhap b: ");
       int b = sc.nextInt();
       System.out.println("Nhap c:");
       int c = sc.nextInt();

        if(a>b){
            System.out.println("So lon nhat_MAX la: "+ a);
            System.out.println("So nho nhat_MAX la: "+ b);

        }else{
            System.out.println("So lon nhat_MAX la: "+ b);
            System.out.println("So nho nhat_MIN la: "+ a);
        }
            System.out.println(" ");        


        System.out.println("BAI 2: GIAI PHUONG TRINH BAC HAI: ax^2 + bx + c = 0");
        
        float delta = ( (b*b) - (4*a*c) );
        float nkep = ((-b)/(2*a));
        double cbh = Math.sqrt(delta);
        float x1 = ((-b)+(cbh)/(2*a));


        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem. ");
            System.out.println(" ");
        }else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+ nkep);
        }else{
            System.out.println("Phuong trinh co hai nghiem rieng biet: ");
            System.out.println("x1 = " + );
            System.out.println("x2 = " + );
        }

    }
    }