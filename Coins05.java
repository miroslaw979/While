import java.util.Scanner;

public class Coins05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double totalSum = Math.floor(sum * 100);
        int coinsCount = 0;

        while (totalSum >0) {

            if (totalSum >= 200) {
                totalSum -= 200;
                coinsCount++;
            } else if (totalSum >= 100) {
                totalSum -= 100;
                coinsCount++;
            } else if (totalSum >= 50) {
                totalSum -= 50;
                coinsCount++;
            } else if (totalSum >= 20) {
                totalSum -= 20;
                coinsCount++;
            } else if (totalSum >= 10) {
                totalSum -= 10;
                coinsCount++;
            } else if (totalSum >= 5) {
                totalSum -= 5;
                coinsCount++;
            } else if (totalSum >= 2) {
                totalSum -= 2;
                coinsCount++;
            } else if (totalSum >= 1) {
                totalSum -= 1;
                coinsCount++;
            }


        }
            System.out.println(coinsCount);

    }
}
