import java.util.Scanner;

public class Moving07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirochina = Integer.parseInt(scanner.nextLine());
        int dulzhiba =  Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int nalichnomqsto = shirochina * dulzhiba * visochina;


        while (!command.equals("Done")){
            int kashonite = Integer.parseInt(command);
            nalichnomqsto = nalichnomqsto - kashonite;

            if (nalichnomqsto<=0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(nalichnomqsto));
            break;
            }

            command = scanner.nextLine();

        }
        if(nalichnomqsto > 0){
            System.out.printf("%d Cubic meters left.", nalichnomqsto);

        }

    }
}

