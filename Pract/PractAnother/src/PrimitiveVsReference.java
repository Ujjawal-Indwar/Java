import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        int a = 24;
        int b = a;
        System.out.println("Primitive ="+b);
        a=40;
        System.out.println("Primitive ="+b);

        Point point1 = new Point(23,65);
        Point point2 = point1;

        System.out.println("Reference ="+point2);

        point1.x=90;
        System.out.println("Reference ="+point2);

    }
}
