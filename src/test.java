import java.util.Scanner;

public class test {
    public static void main(String[] args) {        // Код для запуску програми

        double a = 5.0;         // Зміна з типом double (число з плаваючою комою подвійної точності)
        float b = 3.0f;         // Зміна з типом float (число з плаваючою комою одинарної точності). Обов'язково вказувати 'f' в кінці

        int c = 5;              // Зміна з типом int (ціле число)
        String d = "test";      // Зміна з типом String (рядок тексту)

        int value = 5;
        boolean t = value > 3;  // Зміна з типом boolean (логічне значення, true або false)

        // Print example
        System.out.println("Hello " + "World " + a + b + c + " " + d);  // Виведення тексту та змінних в консоль
        System.out.println(t);    // Виведення логічного значення

        // While example
        while (value > 2) {
            System.out.println("Value is greater than 2");
            value--;          // Зменшуємо value на 1 в кожній ітерації
        }

        // For example
        for (int i = 0; i < 5; i++) {     // Цикл, який виконується 5 разів. Стартує з i=0, поки i<5, збільшує і на 1 в кожній ітерації
            System.out.println("Iteration: " + i);
        }

        // If example
        int z = 10;
        int x = 7;
        if (z > x) {
            System.out.println("Z > X");
        } else if (z == x) {
            System.out.println("Z == X");
        } else {
            System.out.println("Z < X");
        }

        // Scanner example
        Scanner s = new Scanner(System.in);     // Створення об'єкта Scanner для читання вводу з консолі
        System.out.println("Enter smth: ");     // Запит на введення тексту
        String userInput = s.nextLine();        // Читання введеного тексту
        System.out.println("You entered: " + userInput);    // Виведення введеного тексту

        // Do-while example
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;     // Збільшуємо count на 1 в кожній ітерації
        } while (count < 3);   // Цикл виконується, поки count менш як 3

        // Switch example
        Scanner scanner = new Scanner(System.in);   // Створення об'єкта Scanner для читання вводу з консолі
        System.out.print("Enter your age: ");       // Запит на введення віку
        int age = scanner.nextInt();                // Читання введеного віку
        switch (age) {                              // Перевірка значення age
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:   // Якщо age від 0 до 12
                System.out.println("Child");
                break;                  // Вихід з switch після виконання цього кейсу
            case 13, 14, 15, 16, 17:    // Якщо age від 13 до 17
                System.out.println("Teenager");
                break;
            case 18, 19, 20, 21, 22, 23, 24:        // Якщо age від 18 до 24
                System.out.println("Young Adult");
                break;
            default:                    // Якщо жоден з попередніх кейсів не підходить
                System.out.println("Nothing of this cases matched");

        }

        // Massive example
        int[] numbers = {1, 2, 3, 4, 5};    // Створення масиву цілих чисел
        int sum = 0;
        for (int number : numbers) {        // Цикл for-each для проходження по кожному елементу масиву
            sum = sum + number;             // Додавання поточного елемента до суми
        }
        System.out.println(sum);            // Виведення суми всіх елементів масиву

        String[] words = {"Hello", "World", "Java"};   // Створення масиву рядків
        for (String word : words) {                    // Цикл for-each для проходження по кожному елементу масиву
            System.out.println("Word: " + word);
        }
    }
}