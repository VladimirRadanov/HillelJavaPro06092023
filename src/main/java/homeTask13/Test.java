package homeTask13;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //1.1, 1.2
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 300));
        products.add(new Product("Book", 200));
        products.add(new Product("Book", 400));
        products.add(new Product("Pen", 300));

        System.out.println(StreamMethods.getProductsWithPriceMoreThan("Book", 250, products));

        //2.1, 2.2
        List<ProductDiscountable> productsDiscountable = new ArrayList<>();
        productsDiscountable.add(new ProductDiscountable("Book", 100, true));
        productsDiscountable.add(new ProductDiscountable("Pen", 100, true));
        productsDiscountable.add(new ProductDiscountable("Book", 100, false));
        productsDiscountable.add(new ProductDiscountable("Book", 50, true));

        System.out.println(StreamMethods.getDiscountableProductsWithDiscountPrice("Book", productsDiscountable));

        //3.1, 3.2
        System.out.println(StreamMethods.getTheCheapest("Book", productsDiscountable));

        //3.3
        try {
            System.out.println(StreamMethods.getTheCheapest("test", productsDiscountable));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //4.1, 4.2
        List<ProductDate> productDateList = new ArrayList<>();
        try {
            productDateList.add(new ProductDate("Book", 45, true, "05 May 2023"));
            productDateList.add(new ProductDate("Book", 50, true, "06 May 2023"));
            productDateList.add(new ProductDate("Book", 35, true, "07 Feb 2021"));
            productDateList.add(new ProductDate("Pen", 100, true, "03 Sep 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(StreamMethods.getLastThree(productDateList));

        //5.1, 5.2
        System.out.println(StreamMethods.getSumPrice("Book", productDateList));

        //6.1, 6.2
        List<ProductDateId> productDateIdList = new ArrayList<>();
        try {
            productDateIdList.add(new ProductDateId("Pen", 45, true, "05 May 2023", "001"));
            productDateIdList.add(new ProductDateId("Book", 50, true, "06 May 2023", "002"));
            productDateIdList.add(new ProductDateId("Book", 35, true, "07 Feb 2021", "003"));
            productDateIdList.add(new ProductDateId("Pen", 100, true, "03 Sep 2023", "004"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(StreamMethods.getMapByProductType(productDateIdList));

    }


}
