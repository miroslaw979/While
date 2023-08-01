import java.util.Scanner;

public class Password02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();


        String enterPass = scanner.nextLine();

        while(!enterPass.equals(pass)){
            enterPass=scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);

    }
}
