package Paint;

public abstract class ShapeBase implements Shape {
    protected double x; // tọa độ trung tâm của hình
    protected double y;

    public ShapeBase(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getDistance(Shape shape) {
        double dx = this.x - ((ShapeBase) shape).getX();
        double dy = this.y - ((ShapeBase) shape).getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double angle) {
        // không có tham số tâm hình, xoay quanh tâm hình hiện tại
        // TODO: cập nhật tọa độ của trung tâm sau khi xoay
    }

    @Override
    public void zoom(double ratio) {
        // không có định nghĩa mặc định cho phương thức zoom
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

