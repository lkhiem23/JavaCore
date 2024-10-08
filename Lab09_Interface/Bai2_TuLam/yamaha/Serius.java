package Bai2_TuLam.yamaha;

import Bai2_TuLam.IMotor;
import Bai2_TuLam.Motor;

import java.util.Scanner;

public class Serius extends Motor {
     int warranty;

    public Serius() {
        super();
    }

    public Serius(int warranty) {
        this.warranty = warranty;
    }

    public Serius(String code, String name, double capacity, int num, int warranty) {
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
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Warranty: ");
        warranty = sc.nextInt();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: " + warranty);

    }

    @Override
    public void changeInfor() {

    }


    @Override
    public String toString() {
        return super.toString() + "Serius [warranty=" + warranty + "]";
    }
}
