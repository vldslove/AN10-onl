package lesson8;

public class RectangleClass extends FigureClass{
    private int secondSideLength;

    public RectangleClass(int sideLength, int secondSideLength) {
        super(sideLength);
        this.secondSideLength = secondSideLength;
    }

    public int getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(int secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь прямоугольника: " + getSideLength() * getSecondSideLength());
        System.out.println("--------------------------------");
    }

    @Override
    public int getPerimeter() {
        int perimeter = 0;
        perimeter = 2 * (getSideLength() + getSecondSideLength());
        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("--------------------------------");
        return perimeter;
    }
}
