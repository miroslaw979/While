import java.util.Scanner;

public class Sequence2k104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =1;
        int n= Integer.parseInt(scanner.nextLine());

        while (number<=n){
            System.out.println(number);
            number = number * 2 +1;
        }
    }
}
