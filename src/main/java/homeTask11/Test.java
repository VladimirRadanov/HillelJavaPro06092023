package homeTask11;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        String pathToFiles = "./src/test/resources";
        String pathToFiles2 = "./src/test/resources/other";

        FileData fileData1 = new FileData(pathToFiles + "/test1");
        FileData fileData2 = new FileData(pathToFiles + "/test2");
        FileData fileData3 = new FileData(pathToFiles2 + "/test3");

        FileNavigator fileNavigator = new FileNavigator(pathToFiles);
        FileNavigator fileNavigator2 = new FileNavigator(pathToFiles2);


        System.out.println("\nAdd method test");
        System.out.println(fileNavigator.add(fileData1));
        System.out.println(fileNavigator.add(fileData2));
        System.out.println(fileNavigator.add(fileData3));

        System.out.println("\nFind method test");
        System.out.println(fileNavigator.find(pathToFiles));
        System.out.println(fileNavigator.find(pathToFiles2));

        System.out.println("\nFilterBySize method test");
        System.out.println(fileNavigator.filterBySize(10));

        System.out.println("\nSortBySize method test");
        System.out.println(fileNavigator.sortBySize());

        System.out.println("\nDelete method test");
//        System.out.println(fileNavigator2.remove(pathToFiles2));

    }
}
