package homeTask13;

public class ProductDiscountable extends Product {
    private boolean discount;

    public ProductDiscountable(String type, double price, boolean discount) {
        super(type, price);
        this.discount = discount;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "discount=" + discount +
                '}';
    }
}
