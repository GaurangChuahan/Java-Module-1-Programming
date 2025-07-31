import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Subject 1 marks");
        int sub1 = sc.nextInt();

        System.out.println("Enter your Subject 2 marks");
        int sub2 = sc.nextInt();

        System.out.println("Enter your Subject 3 marks");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        System.out.println("Total is " + total);

        int pr = (total / 3);
        System.out.println("Percentage is " + pr);

        if (pr > 35) {
            if (pr > 75) {
                System.out.println("Passing with good marks");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("fail");
        }

    }
}
