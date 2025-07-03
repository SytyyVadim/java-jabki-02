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

//****************************Домашнее задание №2 ********************************
        //Задание №1. Определяем площадь круга
        double r = 5;
        double area = Math.PI * r * r;
        System.out.println("Задание №1. Площадь круга " + area);

        //Задание №2. Переводим температуру в Цельсиях в Фаренгейты
        double tCels = 25;
        double tFaren = tCels * 9 / 5 + 32;
        System.out.println("Задание №2. Температура в Фаренгейтах: " + tFaren);

        //Задание №3. Сравниваем длины двух строк
        String str1 = "Hello";
        String str2 = "Хай";
        System.out.println("Задание №3. Длины строк " +
                (str1.length() == str2.length() ? "равны" : "неравны"));

        //Задание №4. Определяем високосный год или нет
        /** Год считается високосным если:
         *  год делится на 4 и не делится на 100    ИЛИ    год делится на 400
         */
        System.out.print("Задание №4. ");
        int year = 2023;
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный.");
        } else {
            System.out.println(year + " год — не високосный.");
        }

        //Задание №5. Калькулятор индекса массы тела (Body Mass Index - bmi)
        String retStr;
        double humanWeight = 70;
        double humanHeight = 1.75;
        double bmi = humanWeight / (humanHeight * humanHeight);
        if (bmi < 18.5) {
            retStr = "недовес";
        } else if (bmi < 25) {
            retStr = "норма";
        } else if (bmi < 30) {
            retStr = "избыточный вес";
        } else {
            retStr = "ожирение";
        }
        System.out.println("Задание №5. Ваш индекса массы тела: " + bmi + ", категория: " + retStr);

        //Задание №6. Выведите в консоль таблицу истинности для операторов && и ||
        boolean a1, b1;
        System.out.println("Задание 6. Таблица истинности для операторов && и ||.");
        System.out.println("A\tB\tA && B\tA || B");
        System.out.println("-----------------------------");

        a1 = false;
        b1 = false;
        System.out.println(a1 + "\t" + b1 + "\t" + (a1 && b1) + "\t" + (a1 || b1));

        a1 = false;
        b1 = true;
        System.out.println(a1 + "\t" + b1 + "\t" + (a1 && b1) + "\t" + (a1 || b1));

        a1 = true;
        b1 = false;
        System.out.println(a1 + "\t" + b1 + "\t" + (a1 && b1) + "\t" + (a1 || b1));

        a1 = true;
        b1 = true;
        System.out.println(a1 + "\t" + b1 + "\t" + (a1 && b1) + "\t" + (a1 || b1));

        //Задание 7. Выведите в консоль квадрат.
        System.out.println("Задание 7. Выводим в консоль квадрат.");
        int sizeSquare = 5;

        for (int i = 0; i < sizeSquare; i++) {
            for (int j = 0; j < sizeSquare; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Задание 8. Выведите в консоль полый квадрат.
        System.out.println("Задание 8. Выводим в консоль полый квадрат.");
        int widthSquare = 6;
        int heightSquare = 4;

        for (int i = 0; i < heightSquare; i++) {
            for (int j = 0; j < widthSquare; j++) {
                if (i == 0 || i == heightSquare - 1 || j == 0 || j == widthSquare - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Задание 9. Выведите в консоль ромб
        System.out.println("Задание 9. Выводим в консоль ромб.");
        int rhombSize = 9;
        int half = rhombSize / 2;

        for (int i = 0; i < rhombSize; i++) {
            int starsInRow = i <= half
                    ? 1 + i * 2
                    : 1 + (rhombSize - 1 - i) * 2;

            int spaces = (rhombSize - starsInRow) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < starsInRow; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Задание 10. Выведите в консоль смайлик
        System.out.println("Задание 10. Выводим в консоль смайлик.");
        System.out.println("\uD83D\uDE03");

        //Задание 1. if-else
        int checkedNumber = 7;

        System.out.print("Задание 1. if-else. ");
        if (checkedNumber % 2 == 0) {
            System.out.println("Число " + checkedNumber + " — чётное.");
        } else {
            System.out.println("Число " + checkedNumber + " — нечётное.");
        }

        //Задание 2. if-else
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.print("Задание 2. if-else. ");
        if (firstNumber > secondNumber) {
            System.out.println("Первое число больше");
        } else if (firstNumber < secondNumber) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }

        //Задание 3. if-else
        int inputNumber = -5;

        System.out.print("Задание 3. if-else. ");
        if (inputNumber > 0) {
            System.out.println("Положительное");
        } else if (inputNumber < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        //Задание 4. if-else
        int userAge = 16;

        System.out.print("Задание 4. if-else. ");
        if (userAge >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        //Задание 4. if-else Проверка месяца на квартал года
        int monthNumber = 7;

        System.out.print("Задание 5. if-else. Проверка месяца на квартал года. ");
        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("1 квартал");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("2 квартал");
        } else if (monthNumber >= 7 && monthNumber <= 9) {
            System.out.println("3 квартал");
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("4 квартал");
        } else {
            System.out.println("Некорректный номер месяца");
        }

        //Задание 1. Тенарный оператор.
        int inputValue = -10;

        System.out.print("Задание 1. Тенарный оператор. ");
        String signDescription = inputValue > 0
                ? "Положительное"
                : inputValue < 0
                ? "Отрицательное"
                : "Равно нулю";
        System.out.println(signDescription);

        //Задание 2. Тенарный оператор.
        int inputNum = 15;

        System.out.print("Задание 2. Тенарный оператор. ");
        String res1 = (inputNum % 3 == 0 && inputNum % 5 == 0)
                ? "Кратно"
                : "Не кратно";
        System.out.println(res1);

        //Задание 3. Тенарный оператор.
        int inputN = 42;

        System.out.print("Задание 3. Тенарный оператор. ");
        String parity = (inputN % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(parity);

        //Задание 1. switch
        int dayNumber = 3;
        String dayName;

        System.out.print("Задание 1. switch. ");
        switch (dayNumber) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Ошибка";
        }
        System.out.println(dayName);

        //Задание 2. switch
        int grade1 = 4;
        String gradeDescription;

        System.out.print("Задание 2. switch. ");
        switch (grade1) {
            case 1:
                gradeDescription = "Очень плохо";
                break;
            case 2:
                gradeDescription = "Плохо";
                break;
            case 3:
                gradeDescription = "Удовлетворительно";
                break;
            case 4:
                gradeDescription = "Хорошо";
                break;
            case 5:
                gradeDescription = "Отлично";
                break;
            default:
                gradeDescription = "Ошибка";
        }
        System.out.println(gradeDescription);

        //Задание 1. for
        int[] numbers = {4, 7, 10, 3, 8, 5};
        int evenSum = 0;

        System.out.print("Задание 1. for. ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println("Сумма чётных чисел: " + evenSum);

        //Задание 2. for
        int[] numList = {4, 7, 10, 3, 8, 5};
        int maxNumber = numList[0];

        System.out.print("Задание 2. for. ");
        for (int number : numList) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Максимальное число: " + maxNumber);

        //Задание 3. for
        int n = 7;

        System.out.print("Задание 3. for. ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        //Задание 4. for
        System.out.print("Задание 4. for: ");
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");

        //Задание 5. for
        int evenCount = 0;

        System.out.print("Задание 5. for: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных чисел от 1 до 50: " + evenCount);

        //Задание 1. while
        int number = 101;

        System.out.print("Задание 1. while: ");
        while (number % 7 != 0) {
            number++;
        }
        System.out.println("Наименьшее число > 100, делящееся на 7: " + number);

        //Задание 2. while
        int num = 5;
        int factorialResult = 1;
        int currentMultiplier = 1;

        System.out.print("Задание 2. while: ");
        while (currentMultiplier <= num) {
            factorialResult *= currentMultiplier;
            currentMultiplier++;
        }
        System.out.println("Факториал числа " + num + " равен " + factorialResult);

        //Задание 3. while
        int numb = 29;
        boolean isPrime = true;
        int divisor = 2;

        System.out.print("Задание 3. while: ");
        if (numb <= 1) {
            isPrime = false;
        } else {
            while (divisor * divisor <= numb) {
                if (numb % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
        }
        if (isPrime) {
            System.out.println(numb + " — простое число");
        } else {
            System.out.println(numb + " — не простое число");
        }

        //Задание 4. while Вывести все числа от 1 до n, которые делятся на 3
        int limit = 20;
        int currentNumber = 1;
        StringBuilder res = new StringBuilder();

        System.out.print("Задание 4. while: ");
        while (currentNumber <= limit) {
            if (currentNumber % 3 == 0) {
                if (res.length() > 0) {
                    res.append(", ");
                }
                res.append(currentNumber);
            }
            currentNumber++;
        }
        System.out.println(res.toString());

        //Задание 1. break & continue
        boolean first = true;

        System.out.print("Задание 1. break & continue: ");
        for (int i = 1; i <= 20; i++) {
            if (i > 18) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(i);
            first = false;
        }
        System.out.println("");

        //Задание 2. break & continue
        int[] nLst = {5, 8, 12, 0, 7, -3, 9, 4};
        int sum = 0;

        System.out.print("Задание 2. break & continue: ");
        for (int num1 : nLst) {
            if (num1 < 0) {
                break;
            }
            if (num1 == 0) {
                continue;
            }
            sum += num1;
        }
        System.out.println("Сумма элементов до первого отрицательного числа: " + sum);

        //Задание 3. break & continue
        int[] numLst = {10, 20, 30, 25, 15, 5, 10};
        int sum1 = 0;

        System.out.print("Задание 3. break & continue: ");
        for (int num2 : numLst) {
            if (sum1 > 100) {
                break;
            }
            sum1 += num2;
        }
        System.out.println("Сумма элементов: " + sum1);
    }
}