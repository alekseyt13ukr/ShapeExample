public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(Point center, int height, int width) {
        super(center);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
