package shapes;

public class Square extends Quadrilateral{
    @Override
    public double getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }
    public Square(double side) {
        super(side, side);
    }

//    protected double side;
//    @Override
//    public double getPerimeter() {
//        return 4 * this.side;
//    }
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//    public Square(double side) {
//        this.side = side;
//    }
}
