import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of num2 : ");
        int num2 = sc.nextInt();

        System.out.println("a==b : " + (num1 == num2));
        System.out.println("a!=b : " + (num1 != num2));
        System.out.println("a<b : " + (num1 < num2));
        System.out.println("a>b : " + (num1 > num2));
        System.out.println(("a<=b : " + (num1 <= num2)));
        System.out.println("a>=b : " + (num1 >= num2));
    }
}
