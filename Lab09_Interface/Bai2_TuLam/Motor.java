package Bai2_TuLam;

import java.util.Scanner;

public class Motor implements IMotor{
    String code;
    String name;
    double capacity;
    int num;

    public Motor() {

    }

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter capacity: ");
        capacity = sc.nextDouble();
        System.out.print("Enter num: ");
        num = sc.nextInt();
    }

    @Override
    public void displayInfor() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Num: " + num);
    }

    @Override
    public void changeInfor() {

    }

    @Override
    public String toString() {
        return "Motor{" +
                "capacity=" + capacity +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

}
