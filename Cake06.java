import java.util.Scanner;

public class Cake06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duljina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int parchetaTortaObshto = duljina * shirochina;


        while (!command.equals("STOP")){
            int currentPieces = Integer.parseInt(command);
            parchetaTortaObshto -= currentPieces;

            if (parchetaTortaObshto<=0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(parchetaTortaObshto));
                break;
            }
            command= scanner.nextLine();
        }


        if (parchetaTortaObshto>0){
            System.out.printf("%d pieces are left.", parchetaTortaObshto);
        }

    }

}
