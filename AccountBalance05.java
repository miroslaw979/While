import java.util.Scanner;

public class AccountBalance05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        double sum = 0;
        while (!number.equals("NoMoreMoney")){
            double amount = Double.parseDouble(number);

            if (amount<0){
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + amount;
            System.out.printf("Increase: %.2f%n ",amount);
            number = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
