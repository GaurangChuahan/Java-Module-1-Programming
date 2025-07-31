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

        int pr = (total / 3);
        System.out.println("Percentage is " + pr);

        if (pr > 75) {
            System.out.println("Distinct class " + pr);
        } else if (pr < 75 && pr >= 60) {
            System.out.println("First class " + pr);
        } else if (pr < 60 && pr >= 35) {
            System.out.println("Second  class " + pr);
        } else {
            System.out.println("Fail " + pr);
        }

    }
}
