import java.util.Scanner;

public class Graduation08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int suskan= 0;
        double sumGrades = 0;
        int year = 1;

        while (year <=12){
            if( suskan>1){
                break;
            }
            double ocenka = Double.parseDouble(scanner.nextLine());
            if (ocenka<4){
                suskan++;
                continue;
            }

            sumGrades = sumGrades + ocenka;
            year++;
        }
        if (suskan > 1){
            System.out.printf("%s has been excluded at %d grade",name, year);
        } else {
            double srednaOcenka = sumGrades /12;
            System.out.printf("%s graduated. Average grade: %.2f",name,srednaOcenka);
        }

    }
}
