class demo{
    int b,a;
    void add(int a, int b)
    {
        // this.a=a;
        this.b=b;
        System.out.println(a);
    }
    void print()
    {
        System.out.println(b);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        demo d = new demo();
        d.add(5, 6);
        d.print();
    }
}
