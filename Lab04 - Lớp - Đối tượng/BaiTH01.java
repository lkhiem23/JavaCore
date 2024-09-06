import java.util.Scanner;

public class BaiTH01 {

    int id;
    String name, address;
    int age;
    double salary,bonus, lastSalary;


    //khởi tạo không tham số
    public BaiTH01() {

    }

    //khởi tạo có tham số
    public BaiTH01(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;

    }
    // nhap du lieu
    public void input(){
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    //tinh luong
    public double getSalary() {
        lastSalary = salary + (salary*0.1);
        return lastSalary;
    }

    // hien thi
    public void viewData(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
        System.out.println();

    }

    public static void main(String[] args) {
        BaiTH01 obj = new BaiTH01();
        obj.input();
        obj.getSalary();
        obj.viewData();
    }
}
