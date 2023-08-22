package HomeWork1;
/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
    Метод divisionByZero - Деление на 0
    Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов
 */
class Answer1 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int []array = new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.println(array[0]+array[10]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10;
        int b = 0;
        int res = a/b;
        System.out.println(res);

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "Task 3";
        System.out.println(Integer.parseInt(str));

    }
}

public class Task1 {
    public static void main(String[] args) {
       Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

