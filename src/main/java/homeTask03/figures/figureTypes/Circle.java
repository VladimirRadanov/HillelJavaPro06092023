package homeTask03.figures.figureTypes;

import homeTask03.figures.Figure;
import homeTask03.figures.figureParts.Point;

public class Circle implements Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
