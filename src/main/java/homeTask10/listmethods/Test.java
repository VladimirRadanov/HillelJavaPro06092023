package homeTask10.listmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //Check countOccurance
        String[] strings1 = new String[]{"one", "two", "two", "three", "one", "four", "one"};
        List<String> list1 = new ArrayList<>();
        list1.addAll(List.of(strings1));
        System.out.println("countOccurance: " + ListMethods.countOccurrence(list1, "one"));

        //Check toList
        Integer[] integers = new Integer[]{4, 1, 2, 2, 3, 3, 4};
        Boolean[] booleans = new Boolean[]{true, true, false, true, false, true, true, false, true, true, true};
        System.out.println("toList result: " + ListMethods.toList(integers));
        System.out.println("toList result: " + ListMethods.toList(booleans));

        //Check findUnique
        List<Integer> listInt = ListMethods.toList(integers);
        List<Boolean> listBool = ListMethods.toList(booleans);
        System.out.println("findUnique result: " + ListMethods.findUnique(listInt));
        System.out.println("findUnique result: " + ListMethods.findUnique(listBool));

        //check calcOccurance
        List<String> list3 = ListMethods.toList(strings1);
        System.out.println("calcOccurance result:\n" + ListMethods.calcOccurrence(list3));

        //check findOccurance
        System.out.println("findOccurance result:\n" + ListMethods.findOccurrence(list3));

    }

}
