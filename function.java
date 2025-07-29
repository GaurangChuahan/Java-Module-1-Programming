public class function {
    int add(int a, int b) { // With Argument & Return
        int c = a + b;
        return c;
    }

    void sub() { // No Argument & No Return
        int a = 40, b = 20;
        int c = a - b;
        System.out.println(c);
    }

    int mul() { // No Argument & With Return
        int a = 10, b = 20;
        return a * b;
    }

    void div(int a, int b) { // With Argument & No Return
        int c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        function f = new function();
        System.out.println(f.add(10, 20));
        f.sub();
        System.out.println(f.mul());
        f.div(10, 2);
    }

}
