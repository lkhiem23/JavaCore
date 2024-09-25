package TuLam_05;

public class Product {

    private String proId;
    private String proName;
    private String producer;
    public int yearMaking;
    private float price;

    public Product(){

    }

    public Product(float price, String producer, String proId, String proName, int yearMaking) {
        this.price = price;
        this.producer = producer;
        this.proId = proId;
        this.proName = proName;
        this.yearMaking = yearMaking;

    }

}
