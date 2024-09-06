import java.util.Scanner;

public class Student {
    // Field / attribute / properties / statement

    int rollNumber;
    String name;
    int yearOfBirth;

    //2. Method / behavior

    //khởi tạo không tham số
    public Student() {

    }

    //khởi tạo có tham số
    public Student(int rollNumber, String name, int yearOfBirth) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    //input - nhập
    public void inputInfor() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập RollNumber: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập Name: ");
        name = sc.nextLine();
        System.out.print("Nhập YearOfBirth: ");
        yearOfBirth = sc.nextInt();

    }
    // xuất
    public void outputInfor() {
        System.out.println("RollNumber: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("YearOfBirth: "+yearOfBirth);
    }

    public static void main(String[] args) {

        // khởi tạo đối tượng
        Student s = new Student();

        // truy cập đến phương thưức của đối tượng
        s.inputInfor();
        s.outputInfor();

        // ghi đè

        s.name = "Khiêm mới đúng";
        s.outputInfor();

        s = new Student('1',"Khiem",'2');
        s.outputInfor();

    }

}
