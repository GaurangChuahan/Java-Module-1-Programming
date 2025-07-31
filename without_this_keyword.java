class demo {

    void set() {
        int a = 10;
        int b = 20;
        get(a, b);
    }

    void get(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}

public class without_this_keyword {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.set();
    }
}
