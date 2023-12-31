import java.util.Scanner;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double dagresSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes< badGrades){
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)){
                isFailed = false;
                break;

            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <=4){
                failedTimes++;
            }
            dagresSum += grade;
            solvedProblems++;
            lastProblem = problemName;
        }
        if (isFailed){
            System.out.printf(	"You need a break, %d poor grades.",failedTimes);
        }else {
            System.out.printf("Average score: %.2f%n", dagresSum/solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
