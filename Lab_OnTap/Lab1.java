import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();

        System.out.println("Hello "+ name + ". Next Year, you'll be "+ (age+1));

    }
}
