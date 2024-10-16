package LeHoaiKhiem_Lab12.maytinh_dell;

import LeHoaiKhiem_Lab12.maytinh.Maytinh;

import java.util.Scanner;

public class Dell extends Maytinh {
    int warranty; // Thời gian bảo hành


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

    public Dell() {
        super();
    }

    public Dell(String code, String name, double price, int warranty) {
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
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    // INPUT ---------------------------------------
    @Override
    public void inputInfor() {
        super.inputInfor();

        // XỬ LÍ NGOẠI LỆ EXCEPTION
        Scanner sc = new Scanner(System.in);
        // Kiểm tra thời gian bảo hành:

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

    // DISPLAY ---------------------------------------
    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: " + warranty);
    }

    // CHANGE ---------------------------------------
    @Override
    public void changeInfor() {
        super.changeInfor();
    }

    @Override
    public String toString() {
        return "Dell{" +
                "warranty=" + warranty +
                "} " + super.toString();
    }
}
