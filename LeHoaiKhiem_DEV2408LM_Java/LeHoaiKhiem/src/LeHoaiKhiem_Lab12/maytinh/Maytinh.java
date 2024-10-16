package LeHoaiKhiem_Lab12.maytinh;

import java.util.Scanner;

public abstract class Maytinh implements IMaytinh {
    String code;
    String name;
    public double price;

    public Maytinh() {

    }

    public Maytinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract int getWarranty();

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);

        // XỬ LÍ NGOẠI LỆ EXCEPTION
        System.out.print("Code: ");
        setCode(sc.nextLine());

        System.out.print("Name: ");
        setName(sc.nextLine());

        //Kiểm tra:

        while (true){
            try{
                System.out.print("Price: ");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0){
                    throw new IllegalAccessException("Vui lòng nhập giá > 0");
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
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }

    @Override
    public void changeInfor() {

    }


    @Override
    public String toString() {
        return "Maytinh{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
