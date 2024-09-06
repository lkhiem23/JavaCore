package product;

import java.util.Scanner;

public class Product {
    private String proId;
    private String proName;
    private String manufacturer;
    private float producePrice;
    public float salePrice;

    public Product() {}

    public Product(String proId, String proName, String manufacturer, float producePrice, float salePrice) {
        this.proId = proId;
        this.proName = proName;
        this.manufacturer = manufacturer;
        this.producePrice = producePrice;
        this.salePrice = salePrice;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("product.Product ID: ");
        proId = sc.nextLine();
        System.out.print("product.Product name: ");
        proName = sc.nextLine();
        System.out.print("product.Product manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("product.Product price: ");
        producePrice = sc.nextFloat();

    }

    public float calculateSalePrice(){

        salePrice = (float) (producePrice * (producePrice*0.05));
        return salePrice;
    }

    public void display(){
        System.out.println("product.Product ID: " + proId);
        System.out.println("product.Product name: " + proName);
        System.out.println("product.Product manufacturer: " + manufacturer);
        System.out.println("product.Product price: " + producePrice);
        System.out.println("product.Product salePrice: " + salePrice);


    }

}
