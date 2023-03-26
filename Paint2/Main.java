package Paint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> Shapes = new ArrayList<>();
        Shapes.add(new Circle(new Point(0, 0), 5));
        Shapes.add(new Line(new Point(0, 0), new Point(5, 5)));
        Shapes.add(new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)));
        Shapes.add(new Rectangle(new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getDistance(Shape shape) {
                return 0;
            }

            @Override
            public double setArea() {
                return 0;
            }

            @Override
            public double setPerimeter() {
                return 0;
            }

            @Override
            public double setDistance(Shape shape) {
                return 0;
            }

            @Override
            public void move(double dx, double dy) {

            }

            @Override
            public void rotate(double angle) {

            }

            @Override
            public void zoom(double ratio) {

            }

            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }
        });

        // hiển thị danh sách các hình đã tạo ra
        System.out.println("Danh sách các hình đã tạo ra:");
        for (Shape shape : Shapes) {
            System.out.println(shape.toString());
        }

        // tính tổng chu vi và diện tích các hình đã tạo ra
        double totalPerimeter = 0;
        double totalArea = 0;
        Shape largestShape = Shapes.get(0);
        Shape smallestShape = Shapes.get(0);
        for (Shape shape : Shapes) {
            totalPerimeter += shape.getPerimeter();
            totalArea += shape.getArea();
            if (shape.getArea() > largestShape.getArea()) {
                largestShape = shape;
            }
            if (shape.getArea() < smallestShape.getArea()) {
                smallestShape = shape;
            }
        }

        // hiển thị kết quả
        System.out.println("Tổng chu vi các hình: " + totalPerimeter);
        System.out.println("Tổng diện tích các hình: " + totalArea);
        System.out.println("Hình có diện tích lớn nhất: " + largestShape.toString());
        System.out.println("Hình có diện tích nhỏ nhất: " + smallestShape.toString());

        // phóng to các hình với tỉ lệ ratio
        double ratio = 2.0;
        for (Shape shape : Shapes) {
            shape.zoom(ratio);
        }

        // hiển thị danh sách các hình sau khi đã phóng to
        System.out.println("Danh sách các hình sau khi đã phóng to với tỉ lệ " + ratio + ":");
        for (Shape shape : Shapes) {
            System.out.println(shape.toString());
        }
    }
}
