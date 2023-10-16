package homeTask12;

public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setText("set by singleton1");
        System.out.println("Text is set by singleton1");
        System.out.println(singleton1.getText());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Text for singleton2 before set");
        System.out.println(singleton2.getText());
        singleton2.setText("set by singleton2");

        System.out.println("Text is set by singleton2");
        System.out.println(singleton1.getText());
        System.out.println(singleton2.getText());
    }
}
