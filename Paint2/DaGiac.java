package Paint;

import java.util.Arrays;

public class DaGiac {
    public static final int MAX_SIZE=100;
    private int size;

    public DaGiac(Point[] ds) {
        this.ds = ds;
    }

    public Point[] getDs() {
        return ds;
    }

    public void setDs(Point[] ds) {
        this.ds = ds;
    }


    private Point[] ds;
    public DaGiac(){}
}
