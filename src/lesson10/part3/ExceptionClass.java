package lesson10.part3;

//      Создать класс, в котором будет статический метод. Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//      Все поля имеют тип данных String. Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//      Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//      Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//      Также password и confirmPassword должны быть равны.
//      Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//      WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//      второй принимает сообщение исключения и передает его в конструктор класса Exception.
//      Метод возвращает true, если значения верны или false в другом случае.

public class ExceptionClass {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        checkUserInfo("ewqheuew", "qw2","qw2");
    }

    public static boolean checkUserInfo (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Проверьте правильность введения логина");
        } else if (password.length() >= 20 || password.contains(" ") || !password.contains("0") && !password.contains("1") && !password.contains("2") && !password.contains("3") &&
                !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8")  && !password.contains("9") ||
                !password.equals(confirmPassword)){
            throw new WrongPasswordException("Проверьте правильность введения пароля");
        }
        return true;
    }
}






