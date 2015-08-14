/**
 * Created by qa-mach3 on 14.08.15.
 */
public class Line extends Shape {
    private Point startPoint;
    private Point lastPoint;

    public Line(Point startPoint, Point lastPoint) {
        super(startPoint);
        this.lastPoint = lastPoint;
    }

    @Override
    public void draw() {
        //drawing current shape
    }

    public Point getLastPoint() {
        return lastPoint;
    }

    public void setLastPoint(Point lastPoint) {
        this.lastPoint = lastPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }
}
