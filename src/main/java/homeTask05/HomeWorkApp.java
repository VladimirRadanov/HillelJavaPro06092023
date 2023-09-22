package homeTask05;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(-1, 1);
        checkSumSign(20, 30);
        checkSumSign(-100, 5);

        printColor(-1);
        printColor(0);
        printColor(50);
        printColor(100);
        printColor(101);

        compareNumbers(2, 2);
        compareNumbers(5, 2);
        compareNumbers(2, 5);

        checkRange(5, 5);
        checkRange(10, 10);
        checkRange(10, 5);
        checkRange(-10, -20);
        checkRange(40, 20);

        checkNumberSign(0);
        checkNumberSign(102);
        checkNumberSign(-3);

        isNumberNegative(-100);
        isNumberNegative(0);
        isNumberNegative(2);

        printStringNTimes("test", 0);
        printStringNTimes("test", -1);
        printStringNTimes("test", 3);

        isLeapYear(300);
        isLeapYear(800);
        isLeapYear(44);

    }

    public static void printThreeWords() {
        String[] strings = {"Orange", "Banana", "Apple"};

        for (String s : strings) {
            System.out.println(s + "\n");
        }
    }

    public static void checkSumSign(int a, int b) {
        String result = a + b >= 0 ? "Сума позитивна" : "Сума негативна";
        System.out.println(result);
    }

    public static void printColor(int value) {
        String result;
        if (value <= 0) {
            result = "Червоний";
        } else if (value <= 100) {
            result = "Жовтий";
        } else result = "Зелений";
        System.out.println(result);
    }

    public static void compareNumbers(int a, int b) {
        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }

    public static void checkRange(int a, int b) {
        System.out.println((a + b >= 10) && (a + b <= 20));
    }

    public static void checkNumberSign(int value) {
        String result = value >= 0 ? "positive" : "negative";
        System.out.println(result);
    }

    public static void isNumberNegative(int value) {
        System.out.println(value < 0);
    }

    public static void printStringNTimes(String s, int times) {
        if (times <= 0) {
            System.out.println("'times' parameter should be > 0");
        } else {
            for (int i = 0; i < times; i++) {
                System.out.println(s);
            }
        }
    }

    public static void isLeapYear(int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
