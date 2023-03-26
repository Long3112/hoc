package Paint;

public interface Shape {
    double getArea();
    double getPerimeter();
    double getDistance(Shape shape);
    double setArea();
    double setPerimeter();
    double setDistance(Shape shape);
    void move(double dx, double dy);
    void rotate(double angle);
    void zoom(double ratio);
	double getX();
	double getY();
}
