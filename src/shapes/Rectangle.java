package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public double getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }

    public Rectangle(double l, double w) {
        super(l, w);
    }
//    protected double length;
//    protected double width;
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//    public Rectangle() {
//        this.length = 0;
//        this.width = 0;
//    }
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
}
