import java.util.Scanner;

public class Dishwasher001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int zarejdane = 0;
        int chinii = 0;
        int tendjeri = 0;
        int konsumaicq = 0;
        int kolichestvoPreparat = bottles * 750;


        while (!command.equals("End")){
            zarejdane++;
            int broisudove = Integer.parseInt(command);
            if (zarejdane % 3 == 0){
                tendjeri = tendjeri + broisudove;
                konsumaicq = konsumaicq + broisudove * 15;
            } else {
                chinii = chinii + broisudove;
                konsumaicq = konsumaicq + broisudove * 5;
            }

            if (konsumaicq>kolichestvoPreparat){
                break;
            }
            command = scanner.nextLine();
        }

        int ostanalPreparat = Math.abs(kolichestvoPreparat- konsumaicq);
        if (kolichestvoPreparat>=konsumaicq){
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", chinii, tendjeri);
            System.out.printf("Leftover detergent %d ml.",ostanalPreparat);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", ostanalPreparat);
        }
    }
}
