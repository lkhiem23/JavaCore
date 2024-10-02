package Bai1_TuLam.truck;

import Bai1_TuLam.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
     int truckload;
    public Truck() {
        super();
    }
    public Truck(int color) {
        this.truckload = color;
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }
    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("TruckLoad: " + truckload);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("TruckLoad: ");
        truckload = sc.nextInt();

    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckload='" + truckload + '\'' +
                ", maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
