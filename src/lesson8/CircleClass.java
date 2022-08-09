package lesson8;

public class CircleClass extends FigureClass{
    private int radius;

    public CircleClass(int sideLength, int radius) {
        super(sideLength);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь круга: " + (float) 3.14 * (radius * radius));
        System.out.println("--------------------------------");

    }

    @Override
    public int getPerimeter() {
        double perimeter = 0;
        perimeter =  2 * 3.14 * radius;
        System.out.println("Периметр круга: " + perimeter);
        System.out.println("--------------------------------");
        return (int) perimeter;
    }
}
