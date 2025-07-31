class demo {
    void voice() {
        System.out.println("Cat says : Meow Meow!");
    }

    int voice(String sound) {
        System.out.println("Dog says : Woof Woff!");
        return 0;
    }
}

public class overloading_voice {
    public static void main(String[] args) {
        demo d = new demo();
        d.voice();
        d.voice("dog");
    }
}
