import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

        System.out.println("Enter your Address");
        String add = sc.nextLine();
        System.out.println("Address " + add);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("My age is " + age);

        System.out.println("Enter your percentage");
        double percentage = sc.nextDouble();
        System.out.println("My percentage is " + percentage);

    }
}
