package homeTask10.phonebook;

public class Test {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Vasya", "123"));
        phoneBook.add(new Record("Vasya", "456"));
        phoneBook.add(new Record("Vasya", "789"));
        phoneBook.add(new Record("Petya", "148"));

        System.out.println("\nCheck 'null' for non-existing name:");
        System.out.println(phoneBook.find("Kolya"));
        System.out.println(phoneBook.findAll("Kolya"));

        System.out.println("\nCheck 'find'");
        System.out.println(phoneBook.find("Vasya"));
        System.out.println("\nCheck 'findAll'");
        System.out.println(phoneBook.findAll("Vasya"));

    }

}
