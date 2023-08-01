import java.util.Scanner;

public class ReportSystem002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        // Ako e nad 100lv moje samo s karta. Ako e pod 10lv moje samo v broi.

        int sumBroi = 0;
        int sumKarti = 0;
        int broiVKarti = 0;
        int broiVCash = 0;
        int totalSum= 0;
        int countTotal= 0;

        while (!command.equals("End")){
            int priceForSomething = Integer.parseInt(command);
            countTotal++;

            if (countTotal % 2 != 0){
                if (priceForSomething<=100 ){
                    broiVCash++;
                    sumBroi= sumBroi + priceForSomething;
                    totalSum = totalSum +priceForSomething;
                    System.out.println("Product sold!");
                }else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (priceForSomething >= 10){
                    broiVKarti++;
                    sumKarti += priceForSomething;
                    totalSum += priceForSomething;
                    System.out.println("Product sold!");
                }else {
                    System.out.println("Error in transaction!");
                }
            }
            if (totalSum>=needSum){
                break;
            }
            command = scanner.nextLine();
        }

        if (!command.equals("End")){
            double avgCash = sumBroi * 1.0 /broiVCash;
            double avgCard = sumKarti *1.0 / broiVKarti;
            System.out.printf("Average CS: %.2f%n",avgCash);
            System.out.printf("Average CC: %.2f%n",avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }


    }
}


