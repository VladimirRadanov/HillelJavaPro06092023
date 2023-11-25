package homeTask13;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMethods {

    public static List<Product> getProductsWithPriceMoreThan(String type, double price, List<Product> products) {
        return products.stream()
                .filter(e -> e.getType().equals(type))
                .filter(e -> e.getPrice() > price)
                .collect(Collectors.toList());
    }

    public static List<ProductDiscountable> getDiscountableProductsWithDiscountPrice(String type, List<ProductDiscountable> products) {
        return products.stream()
                .filter(e -> e.getType().equals(type))
                .filter(e -> e.isDiscount())
                .map(e -> new ProductDiscountable(e.getType(), e.getPrice() * 0.9, e.isDiscount()))
                .collect(Collectors.toList());
    }

    public static ProductDiscountable getTheCheapest(String type, List<ProductDiscountable> products) {
        return products.stream()
                .filter(e -> e.getType().equals(type))
                .min(Comparator.comparing(ProductDiscountable::getPrice))
                .orElseThrow(() -> new RuntimeException("ProductDiscountable [type: " + type + "] not found"));
    }

    public static List<ProductDate> getLastThree(List<ProductDate> productDateList) {
        return productDateList.stream()
                .sorted(Comparator.comparing(ProductDate::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double getSumPrice(String type, List<ProductDate> productDateList) {
        return productDateList.stream()
                .filter(e -> e.getDateAdded().getYear() == Year.now().getValue())
                .filter(e -> e.getType().equals(type))
                .filter(e -> e.getPrice() < 75)
                .collect(Collectors.summingDouble(Product::getPrice));
    }

    public static Map<String, List<ProductDateId>> getMapByProductType(List<ProductDateId> productDateIdList) {
        return productDateIdList.stream()
                .collect(Collectors
                        .groupingBy(ProductDateId::getType, Collectors.toList()
                        ));
    }

}
