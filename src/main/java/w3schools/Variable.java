package w3schools;

import java.awt.*;

public class Variable {
    public static void main(String[] args) {
        Point Point1 = new Point(1, 1 );
        Point Point2 = Point1;
        Point1.x = 2;
        System.out.println(Point2);

    }
}
