import java.util.Random;

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
    }
}