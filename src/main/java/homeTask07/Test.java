package homeTask07;

public class Test {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] validDataSize = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        String[][] invalidData = {
                {"0", "#", "2", "3"},
                {"0", "1", "R", "3"},
                {"0", ".", "2", "3"},
                {"0", "1", "2", "3"}
        };

        String[][] invalidSize = {
                {"0", "1", "2",},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
        };

        System.out.println(calculator.doCalc(validDataSize));
        System.out.println(calculator.doCalc(invalidData));
        System.out.println(calculator.doCalc(invalidSize));
    }
}
