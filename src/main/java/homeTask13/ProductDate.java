package homeTask13;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ProductDate extends ProductDiscountable {
    private LocalDate dateAdded;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);

    public ProductDate(String type, double price, boolean discount, String dateAdded) throws ParseException {
        super(type, price, discount);
        this.dateAdded = LocalDate.parse(dateAdded, formatter);
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return super.toString() +
                "dateAdded=" + dateAdded +
                '}';
    }
}
