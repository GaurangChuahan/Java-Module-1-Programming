class demo {
    int a, b;

    void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void get() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        demo d = new demo();
        d.set(5, 6);
        d.get();
    }
}
