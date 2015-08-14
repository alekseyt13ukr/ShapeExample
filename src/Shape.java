/**
 * Created by qa-mach3 on 14.08.15.
 */
public abstract class Shape {
    private Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public abstract void draw();
}
