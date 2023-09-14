package homeTask03.figures.figureTypes;

import homeTask03.figures.Figure;
import homeTask03.figures.figureParts.Point;

public class Square implements Figure {
    Point[] points;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.points = new Point[]{p1, p2, p3, p4};
    }

    @Override
    public double getArea() {
        return Math.pow((points[1].getX() - points[0].getX()), 2) +
                Math.pow((points[1].getY() - points[0].getY()), 2);
    }
}
