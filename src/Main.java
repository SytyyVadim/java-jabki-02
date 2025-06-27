import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /**
         * примитивы
         */
        int age = 25;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        /**
         * Ссылочные типы данных
         */
        String name = "Alice";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());

        /**
         * Операторы
         */
        // Арифметические
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3 (целочисленное деление)
        System.out.println(a % b); // 1 (остаток от деления)

        // Операторы сравнения
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // true
        System.out.println(a <= b); // false

        // Логические операторы
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x); // false

        System.out.println(2 == 2 && 3 != 2); // true
        System.out.println(2 == 2 && 3 != 3); // false
        System.out.println(!((2 + 2) == 4)); // false
        System.out.println(!((2 + 2) == 4) || true); // true

        /**
         * Вывод в консоль
         */
        System.out.println("Привет, мир!");
        System.out.print("А это ");
        System.out.print("будет на одной строке");
        System.out.println();
        System.out.println("А еще " + "можно так " + x);
        System.out.printf("Привет, меня зовут %s и я люблю %s\n", name, "маму");

        int oddNumber = 3;
        System.out.printf("Число четное? %s\n", oddNumber % 2 == 0);

        System.out.println("* * *");
        System.out.println("*   *");
        System.out.println("* * *");

        /**
         * Комментарии
         */

        // Однострочный комментарий
        // вторая строка

        /*
        многострочный
        комментарий
         */

        /**
         * Складывает два числа
         *
         * @param a первое число
         * @param b второе число
         * @return сумму чисел a и b
         */

        /**
         * Условные операторы
         * if-else
         */

        boolean isRain = true;
        /*
        if (isRain) {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
            System.out.println("Взять зонт");
        } else {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
        }
         */

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        if (isRain) {
            System.out.println("Взять зонт");
        }

        String animal = "fish";
        if (animal.equals("cat")) {
            System.out.println("Маяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Буль");
        }

        int floor = 1;
        double price = 3000;
        if (floor == 1 && price < 5000) {
            System.out.println("Подходит для аренда");
        }

        a = 0;
        String result = a > 0 ? "a положительное число" : "а отрицательное число";
        System.out.println(result);

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль!");
                break;
            case "bear":
                System.out.println("рр");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Выход из цикла
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропуск
            }
            System.out.println(i);
        }

    }
}