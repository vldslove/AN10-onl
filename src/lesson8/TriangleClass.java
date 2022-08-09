package lesson8;

public class TriangleClass extends FigureClass{
    private int secondSideLength;
    private int thirdSideLength;
    private int height;

    public TriangleClass(int sideLength, int secondSideLength, int thirdSideLength, int height) {
        super(sideLength);
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
        this.height = height;
    }

    public int getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(int secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public int getThirdSideLength() {
        return thirdSideLength;
    }

    public void setThirdSideLength(int thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь треугольника: " + 0.5 * getSideLength() * getHeight());
        System.out.println("--------------------------------");
    }

    @Override
    public int getPerimeter() {
        int perimeter = 0;
        perimeter = getSideLength() + getSecondSideLength() + getThirdSideLength();
        System.out.println("Периметр треугольника: " + perimeter);
        System.out.println("--------------------------------");
        return perimeter;
    }
}
