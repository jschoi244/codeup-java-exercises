package shapes;

public class Square extends Rectangle{
    protected double side;
    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    public Square(double side) {
        this.side = side;
    }
}
