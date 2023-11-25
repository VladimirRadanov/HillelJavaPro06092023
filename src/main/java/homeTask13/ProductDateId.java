package homeTask13;

import java.text.ParseException;

public class ProductDateId extends ProductDate {

    private String id;

    public ProductDateId(String type, double price, boolean discount, String dateAdded, String id) throws ParseException {
        super(type, price, discount, dateAdded);
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "id='" + id + '\'' +
                '}';
    }
}
