import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        double a = 5.0;
        float b = 3.0f;

        int c = 5;
        String d = "test";

        int value = 5;
        boolean t = value > 3;

        // Print example
        System.out.println("Hello " + "World " + a + b + c + " " + d);
        System.out.println(t);

        // While example
        while (value > 2) {
            System.out.println("Value is greater than 2");
            value--;
        }

        // For example
        for (int i = 0; i < 5; i++) {
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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter smth: ");
        String userInput = s.nextLine();
        System.out.println("You entered: " + userInput);

        // Do-while example
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 3);

        // Switch example
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Child");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("Teenager");
                break;
            case 18, 19, 20, 21, 22, 23, 24:
                System.out.println("Young Adult");
                break;
            default:
                System.out.println("Nothing of this cases matched");

        }

        // Massive example
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);

        String[] words = {"Hello", "World", "Java"};
        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }
}