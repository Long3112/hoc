package Paint;


public class Circle implements Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(Point point, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getDistance(Shape shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.abs(Math.sqrt(Math.pow(c.getX() - this.x, 2) + Math.pow(c.getY() - this.y, 2)) - (c.getRadius() + this.radius));
        } else if (shape instanceof Point) {
            Point p = (Point) shape;
            return Math.abs(Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2)) - this.radius);
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
        // không có gì xảy ra với lớp Circle khi xoay
    }

    @Override
    public void zoom(double ratio) {
        this.radius *= ratio;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }
}
