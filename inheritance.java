class parent {
    void demo() {
        System.out.println("Hello");
    }
}

class child extends parent {
    void print() {
        System.out.println("World");
    }
}

public class inheritance {

    public static void main(String[] args) {
        child c1 = new child();
        c1.demo();
        c1.print();
    }
}
