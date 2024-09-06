package thailand;

import product.Product;

public class ThaiLanImportPrice extends Product {
    private float taxImported; // Thuế nhập khẩu
    private float importPriceSupport; // Giá hỗ trợ nhập khẩu

    public ThaiLanImportPrice(float taxImported, float importPriceSupport) {
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLanImportPrice(String proId, String proName, String manufacturer, float producePrice, float salePrice, float taxImported, float importPriceSupport) {
        super(proId, proName, manufacturer, producePrice, salePrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLanImportPrice() {
        super();
    }

    public ThaiLanImportPrice(String proId, String proName, String manufacturer, float producePrice, float salePrice) {
        super(proId, proName, manufacturer, producePrice, salePrice);
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public float calculateSalePrice() {
        float imported_price = 0;
        salePrice = (float) (imported_price + (taxImported*imported_price) - (importPriceSupport*imported_price) + (0.1*(imported_price+(taxImported*imported_price) - (importPriceSupport*imported_price))));
        return super.calculateSalePrice();
    }

    @Override
    public void display() {
        super.display();
    }
}
