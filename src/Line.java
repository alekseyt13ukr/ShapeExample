public class Line extends Shape {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        super(start);
        this.end = end;
    }

    @Override
    public void draw() {
        System.out.println(getCenter() + "-----------" + end);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }
}
