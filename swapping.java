public class swapping {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        System.out.println("Before Swapping");
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);

    }
}
