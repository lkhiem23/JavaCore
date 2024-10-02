package Bai1_TuLam;

import java.util.Scanner;

public class Vehicle implements IVehicle{
     String maker;
     String model;
     double price;

    public Vehicle() {

    }

    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker name: ");
        maker = sc.nextLine();
        System.out.print("Enter model name: ");
        model = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("------------------------");
        System.out.println("Maker: " + maker);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
