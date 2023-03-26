package Paint;

public class Triangle implements Shape {
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    @Override
    public double getArea() {
        double a = this.vertexA.getDistance(this.vertexB);
        double b = this.vertexB.getDistance(this.vertexC);
        double c = this.vertexC.getDistance(this.vertexA);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return this.vertexA.getDistance(this.vertexB) + this.vertexB.getDistance(this.vertexC) + this.vertexC.getDistance(this.vertexA);
    }

    @Override
    public double getDistance(Shape shape) {
        if (shape instanceof Point) {
            Point p = (Point) shape;
            double distanceFromA = this.vertexA.getDistance(p);
            double distanceFromB = this.vertexB.getDistance(p);
            double distanceFromC = this.vertexC.getDistance(p);
            double area = this.getArea();
            double distance = (2 * area) / this.getPerimeter();
            double distanceFromEdgeAB = this.getDistanceFromEdge(this.vertexA, this.vertexB, p);
            double distanceFromEdgeBC = this.getDistanceFromEdge(this.vertexB, this.vertexC, p);
            double distanceFromEdgeCA = this.getDistanceFromEdge(this.vertexC, this.vertexA, p);
            return Math.min(Math.min(distanceFromA, distanceFromB), Math.min(distanceFromC, Math.min(distanceFromEdgeAB, Math.min(distanceFromEdgeBC, distanceFromEdgeCA))));
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            double distanceFromEdgeAB = this.getDistanceFromEdge(t.vertexA, t.vertexB, this.vertexA, this.vertexB);
            double distanceFromEdgeBC = this.getDistanceFromEdge(t.vertexB, t.vertexC, this.vertexB, this.vertexC);
            double distanceFromEdgeCA = this.getDistanceFromEdge(t.vertexC, t.vertexA, this.vertexC, this.vertexA);
            double distanceToVertexA = t.vertexA.getDistance(this.vertexA);
            double distanceToVertexB = t.vertexB.getDistance(this.vertexB);
            double distanceToVertexC = t.vertexC.getDistance(this.vertexC);
            return Math.min(Math.min(distanceFromEdgeAB, Math.min(distanceFromEdgeBC, distanceFromEdgeCA)), Math.min(Math.min(distanceToVertexA, distanceToVertexB), distanceToVertexC));
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
        this.vertexA.move(dx, dy);
        this.vertexB.move(dx, dy);
        this.vertexC.move(dx, dy);
    }

    @Override
    public void rotate(double angle) {
        this.vertexA.rotate(angle);
        this.vertexB.rotate(angle);
        this.vertexC.rotate(angle);
    }

    @Override
    public void zoom(double ratio) {
        this.vertexA.zoom(ratio);
        this.vertexB.zoom(ratio);
        this.vertexC.zoom(ratio);
    }

    @Override
    public double getX() {
        return (this.vertexA.getX() + this.vertexB.getX() + this.vertexC.getX()) / 3;
    }

    @Override
    public double getY() {
        return (this.vertexA.getY() + this.vertexB.getY() + this.vertexC.getY()) / 3;
    }

    private double getDistanceFromEdge(Point vertex1, Point vertex2, Point point) {
        double x1 = vertex1.getX();
        double y1 = vertex1.getY();
        double x2 = vertex2.getX();
        double y2 = vertex2.getY();
        double x = point.getX();
        double y = point.getY();
        double numerator = Math.abs((y2 - y1) * x - (x2 - x1) * y + x2 * y1 - y2 * x1);
        double denominator = vertex1.getDistance(vertex2);
        return numerator / denominator;
    }

    private double getDistanceFromEdge(Point vertex1T1, Point vertex2T1, Point vertex1T2, Point vertex2T2) {
        double x1T1 = vertex1T1.getX();
        double y1T1 = vertex1T1.getY();
        double x2T1 = vertex2T1.getX();
        double y2T1 = vertex2T1.getY();
        double x1T2 = vertex1T2.getX();
        double y1T2 = vertex1T2.getY();
        double x2T2 = vertex2T2.getX();
        double y2T2 = vertex2T2.getY();
        double numerator = Math.abs((y2T2 - y1T2) * x1T1 - (x2T2 - x1T2) * y1T1 + x2T2 * y1T2 - y2T2 * x1T2);
        double denominator = vertex1T1.getDistance(vertex2T1);
        return numerator / denominator;
    }
}