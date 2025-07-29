import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your JAVA Subject marks");
        int JAVA = sc.nextInt();

        System.out.println("Enter your C language Subject marks");
        int C = sc.nextInt();

        System.out.println("Enter your HTML Subject marks");
        int HTML = sc.nextInt();

        int total = JAVA + C + HTML;
        System.out.println("Total is " + total);

        int grade = (total / 3);
        System.out.println("Grade is " + grade);

        if (grade > 75) {
            System.out.println("Dist class " + grade);
        } else if (grade < 75 && grade >= 60) {
            System.out.println("First class " + grade);
        } else if (grade < 60 && grade >= 35) {
            System.out.println("Second  class " + grade);
        } else {
            System.out.println("Fail " + grade);
        }

    }
}
