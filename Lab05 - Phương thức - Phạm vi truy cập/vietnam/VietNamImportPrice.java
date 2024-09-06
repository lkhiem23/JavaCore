package vietnam;

import product.Product;

public class VietNamImportPrice extends Product {
    private float taxImported; // Thuế nhập khẩu

    public VietNamImportPrice(float taxImported) {
        this.taxImported = taxImported;
    }

    public VietNamImportPrice(String proId, String proName, String manufacturer, float producePrice, float salePrice, float taxImported) {
        super(proId, proName, manufacturer, producePrice, salePrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {

        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {
        super();
    }

    public VietNamImportPrice(String proId, String proName, String manufacturer, float producePrice, float salePrice) {
        super(proId, proName, manufacturer, producePrice, salePrice);
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public float calculateSalePrice() {
        float imported_price = 0;
        salePrice = (float) (imported_price + (taxImported*imported_price) + (0.1*(imported_price + (taxImported*imported_price))));
        return super.calculateSalePrice();
    }

    @Override
    public void display() {
        super.display();
    }
}
