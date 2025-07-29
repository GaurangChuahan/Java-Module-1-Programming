public class variable {
    int a = 10; // Instance Variable

    public static void main(String[] args) {
        int b = 20; // Local Variable
        variable v = new variable();
        System.out.println("a is " + (v.a));
        System.out.println("b is " + b);

    }
}