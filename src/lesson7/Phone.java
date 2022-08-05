package lesson7;

//        Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
//        сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
//        объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
//        переменных класса - number, model и weight.
//        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//        number, model.
//        Добавить конструктор без параметров.
//        Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
//        телефона звонящего.
//        Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
//        телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.



public class Phone {
    int number;
    String model;
    int weight;

    Phone(int number, String model, int weight){
        this(number,model);
        this.weight = weight;

    }

    Phone (int number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){

    }


    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

    public int getNumber() {
        System.out.println(number);
        return number;
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит" + name + " Номер: " + number);
    }

    public void sendMessage(String message, int[] number) {
        System.out.print("Сообщение: " + message + " Номера телефонов, на которые будет отправлено сообщение: ");
        for (int i : number) {
            System.out.print(i + " ");
        }

    }

}

