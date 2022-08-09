package lesson8;

public class MainClass {
    public static void main(String[] args) {

        FigureClass rectangle1 = new RectangleClass(2,4);
        FigureClass rectangle2 = new RectangleClass(4,3);
        rectangle1.getSquare();
        rectangle2.getSquare();

        FigureClass triangle1 = new TriangleClass(4,3,5,2);
        FigureClass triangle2 = new TriangleClass(3,3,3,3);
        triangle1.getSquare();
        triangle2.getSquare();

        FigureClass circle = new CircleClass(4,4);
        circle.getSquare();

        int[] figures = new int[] {rectangle1.getPerimeter(), rectangle2.getPerimeter(), triangle1.getPerimeter(), triangle2.getPerimeter(), circle.getPerimeter()};
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum = sum + figures[i];
        }
        System.out.println("Сумма периметров: " + sum);

        Printable worker = new WorkerClass();
        Printable accountant = new AccountantClass();
        Printable director = new DirectorClass();

        System.out.println("--------------------------------");
        worker.post("Рабочий");
        accountant.post("Бухгалтер");
        director.post("Директор");
        }
}
