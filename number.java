import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " Number is Positive");
        } else {
            System.out.println(num + " Number is Negative");
        }
    }
}
