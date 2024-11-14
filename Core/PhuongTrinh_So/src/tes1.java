import java.util.Scanner;

public class tes1{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            String c = sc.nextLine();
            
            double tong = a + b;
            double hieu = a - b;
            double tich = a * b;
            double thuong = a / b;
            
            if(length() == "+" ){
                System.err.printf("%.2f", tong);
            }
            else if(c == "-"){
                System.err.printf("%.2f", hieu);
            }
            else if(c == "*"){
                System.err.printf("%.2f", tich);
            }
            else if(c == "/"){
                if(b == 0){
                    System.out.println("Math Error");
                }else{
                    System.err.printf("%.2f", thuong);
                }    

            }
           
         
    }
}