package homeTask03.figures.figureTypes;

import homeTask03.figures.Figure;
import homeTask03.figures.figureParts.Point;

public class Triangle implements Figure {
    private Point[] points;

    public Triangle(Point p1, Point p2, Point p3) {
        points = new Point[]{p1, p2, p3};
    }


    @Override
    public double getArea() {
//        Area of ΔABC = (1/2) |x1(y2 − y3) + x2(y3 − y1)+ x3(y1 − y2)|
        return 0.5 * Math.abs(
                points[0].getX() * (points[1].getY() - points[2].getY()) +
                        points[1].getX() * (points[2].getY() - points[0].getY()) +
                        points[2].getX() * (points[0].getY() - points[1].getY())
        );
    }
}
