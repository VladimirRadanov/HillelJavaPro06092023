package homeTask07;

public class ArrayValueCalculator {
    private final int dimension1 = 4;
    private final int dimension2 = 4;
    private int sum = 0;

    public int doCalc(String[][] array) {
        checkSize(array);
        int result;
        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                try {
                    sum += parseElement(array[i][j], i, j);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    return 0;
                }
            }
        }
        result = sum;
        sum = 0;
        return result;
    }

    private void checkSize(String[][] array) {
        if (array.length != dimension1 && array[0].length != dimension2) {
            System.out.println(new ArraySizeException().getMessage());
        }
    }

    private int parseElement(String s, int dim1, int dim2) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(new ArrayDataException(dim1, dim2).getMessage());
            return 0;
        }
    }
}
