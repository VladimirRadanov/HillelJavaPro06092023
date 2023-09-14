package homeTask03.figures;

import homeTask03.figures.figureParts.Point;
import homeTask03.figures.figureTypes.Circle;
import homeTask03.figures.figureTypes.Square;
import homeTask03.figures.figureTypes.Triangle;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(2, 2), 5);
        System.out.println("The area of circle: \t" + circle.getArea());

        Triangle triangle = new Triangle(new Point(0, 0), new Point(5, 5), new Point(5, 0));
        System.out.println("The area of triangle: \t" + triangle.getArea());

        Square square = new Square(new Point(0, 0), new Point(0, 2), new Point(2, 2), new Point(2, 0));
        System.out.println("The area of square: \t" + square.getArea());


        double areaSum = 0;
        Figure[] figureArray = new Figure[]{circle, triangle, square};
        for (Figure figure : figureArray) {
            areaSum += figure.getArea();
        }
        System.out.println("Sum of areas: \t\t\t" + areaSum);

    }
}
