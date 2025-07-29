class demo1 {
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}

class demo2 extends demo1 {
    void add(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }
}

public class Override {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.add(10, 20);

        demo2 d2 = new demo2();
        d2.add(50, 25);
    }
}
