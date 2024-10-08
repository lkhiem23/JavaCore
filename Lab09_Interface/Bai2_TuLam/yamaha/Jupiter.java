package Bai2_TuLam.yamaha;

import Bai2_TuLam.Motor;

import java.util.Scanner;

public class Jupiter extends Motor {
    int warranty; // Thời gian bảo hành

    public Jupiter() {
        super();
    }

    public Jupiter(int warranty) {
        this.warranty = warranty;
    }

    public Jupiter(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);

        super.inputInfor();
        System.out.print("Warranty: ");
        warranty = sc.nextInt();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: " + warranty);
    }

    @Override
    public void changeInfor() {
        super.changeInfor();
    }

    @Override
    public String toString() {
        return "Jupiter{" +
                "warranty=" + warranty +
                "} " + super.toString();
    }
}
