package homeTask07;

public class ArrayDataException extends RuntimeException {
    public ArrayDataException(int dim1, int dim2) {
        super("ArrayDataException: element: [" + dim1 + "] [" + dim2 + "] can't be parsed to Integer value");
    }
}
