package Paint;

public abstract class Rectangle implements Shape {
    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "first=" + first + ", second=" + second + '}';
    }

    private Point first;
   private Point second;
}
