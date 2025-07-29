class operaction {
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void add(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }
}

public class Overloading {
    public static void main(String[] args) {
        operaction o = new operaction();
        o.add(10, 20);
        o.add(10.5, 20.5);
    }
}
