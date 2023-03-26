package Paint;

public class Point implements Shape {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

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
        if (shape instanceof Point) {
            Point p = (Point) shape;
            return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
        } else {
            return shape.getDistance(this);
        }
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
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double angle) {
        // không có gì xảy ra với lớp Point khi xoay
    }

    @Override
    public void zoom(double ratio) {
        // không có gì xảy ra với lớp Point khi thu/phóng
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
