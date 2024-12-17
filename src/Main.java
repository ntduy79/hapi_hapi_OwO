import java.lang.foreign.SymbolLookup;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Random random = new Random();
        int length = random.nextInt(100);
        int [] prices = new int[length];

        for (int i = 1; i < length; i++) {
            prices[i] = random.nextInt(200);
        }
        System.out.print("Array: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        bestTimeToBuyandSell solution = new bestTimeToBuyandSell();
        int maxProfilt = solution.maxProfit(prices);
        System.out.println("Max profil: " + maxProfilt);

        climbingStairsSolution solution1 = new climbingStairsSolution();
        int inputStairs = solution1.climbStairs(random.nextInt(10));
        System.out.println("Total stairs: " + inputStairs);

        System.out.println("Hi here is the funny game: ");
        System.out.println("The rule is simple, you will guess a number from 1 to 100, Number Guessing Game :) ");
        Scanner scanner = new Scanner(System.in);
        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("So choose difficulty :)");
        while (true) {
            System.out.println("\nCommands: easy, medium, hard");
            System.out.print("> ");
            String command = scanner.next().toLowerCase(Locale.ROOT);

            switch (command) {
                case "easy" -> {
                    System.out.println("You have 10 chances :) good luck! ");
                    System.out.println("What numbers are you thinking?");
                    int number = inputFromUser.nextInt();
                    if (number == random.nextInt(0,1)) {
                        System.out.println("Wao, you are so good");
                    }
                    else {
                        System.out.println("So bad");
                }
            }
                default -> throw new IllegalStateException("Unexpected value: " + command);
            }

    }
}
}