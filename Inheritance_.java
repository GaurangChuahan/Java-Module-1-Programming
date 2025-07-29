class p {
    int a = 10, b = 20;
}

class c extends p {
    void add() {
        System.out.println(a + b);
    }
}

public class Inheritance_ {
    public static void main(String[] args) {
        c c1 = new c();
        c1.add();
    }
}
