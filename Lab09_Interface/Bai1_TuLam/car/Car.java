package Bai1_TuLam.car;

import Bai1_TuLam.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
     String color;

    public Car() {
        super();
    }
    public Car(String color) {
        this.color = color;
    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + color);

    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Color: ");
        color = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
