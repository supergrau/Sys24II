package future.oop;

import java.awt.*;

public class ClassUse {
    static void printPoint(Point point) {
        if (point != null)
            System.out.println(point);
        else
            System.out.println("point is null");

    }

    static void coordinateExchange(Point point) {
        int h = point.x;
        point.x = point.y;
        point.y = h;
    }

    public static void main(String[] args) {
        // Verwendung der Klasse Point aus dem AWT-Paket
        Point point1 = new Point();  // Instantiation| Create an Object
        Point point2;
        point2 = new Point(77,66);
        coordinateExchange(point2);
        printPoint(point2);

        Object object = new Object();
        point1.setLocation(10,20);
        System.out.println(point1);
        System.out.println(object);
        System.out.println(point1.getX());
        System.out.println(point1.x);
        point1.x = 98;
        System.out.println(point1.x);
        System.out.println(point2);

    }
}
