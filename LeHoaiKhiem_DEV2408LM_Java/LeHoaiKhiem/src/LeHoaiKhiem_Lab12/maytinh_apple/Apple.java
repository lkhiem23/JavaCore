package LeHoaiKhiem_Lab12.maytinh_apple;

import LeHoaiKhiem_Lab12.maytinh.Maytinh;

import java.util.Scanner;

public class Apple extends Maytinh {
    int warranty;


    @Override
    public void inputInfor() {
        super.inputInfor();
        // Kiểm tra thời gian bảo hành:
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Warranty: ");
                warranty = Integer.parseInt(sc.nextLine());
                if (warranty < 0){
                    throw new IllegalAccessException("Vui lòng nhập thời gian bảo hành > 0");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập 1 giá trị hợp lệ !!!");
            }catch (IllegalAccessException e){
                System.out.println(e.getMessage());
            }
        }
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
    public String getCode() {
        return super.getCode();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public Apple() {
        super();
    }

    public Apple(String code, String name, double price, int warranty) {
        super(code, name, price);
        this.warranty = warranty;
    }

    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "warranty=" + warranty +
                "} " + super.toString();
    }
}
