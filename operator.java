public class operator {
    public static void main(String[] args) {
        // Declare variables
        int a = 10, b = 5;
        boolean x = true, y = false;

        System.out.println("----- Arithmetic Operators -----");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n----- Relational Operators -----");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n----- Logical Operators -----");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\n----- Bitwise Operators -----");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        System.out.println("\n----- Assignment Operators -----");
        int c = 10;
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 2;
        System.out.println("c -= 2: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 3;
        System.out.println("c /= 3: " + c);
        c %= 4;
        System.out.println("c %= 4: " + c);

        System.out.println("\n----- Unary Operators -----");
        int d = 3;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("d = " + d);

        System.out.println("\n----- Ternary Operator -----");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
