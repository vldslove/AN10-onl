package lesson8;

//       Написать иерархию классов «Фигуры».
//       Фигура -> Треугольник -> Прямоугольник -> Круг.
//       Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
//       Создать массив из 5 фигур.
//       Вывести на экран сумму периметра всех фигур в массиве.

public abstract class FigureClass {
    private int sideLength;

    public FigureClass(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void getSquare() {

    }

    public int getPerimeter() {

        return 0;
    }

}

