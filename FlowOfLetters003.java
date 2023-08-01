import java.util.Scanner;

public class FlowOfLetters003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int cSymbol = 0;
        int oSymbol = 0;
        int nSymbol = 0;
        String wordBySteps = "";

        while (!input.equals("End")){

            if (cSymbol == 1 && oSymbol == 1 && nSymbol == 1){
                System.out.printf("%s", wordBySteps);
                wordBySteps = "";
                cSymbol = 0;
                oSymbol = 0;
                nSymbol = 0;
                continue;
            }
            input = scanner.nextLine();

            if (input.equals("c") && cSymbol == 0){
                cSymbol++;
                continue;
            } else if (input.equals("o") && oSymbol == 0) {
                oSymbol++;
                continue;
            } else if (input.equals("n") && nSymbol == 0) {
                nSymbol++;
                continue;
            }
            char currentSymbol = input.charAt(0);

            if (Character.isLetter(currentSymbol)){
                wordBySteps= wordBySteps + currentSymbol;
            }

        }
        if (cSymbol == 1 && oSymbol == 1 && nSymbol == 1) {
            System.out.printf("%s ", wordBySteps);
        }
    }
}
