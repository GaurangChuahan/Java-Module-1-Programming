class dog {
    void sound() {
        System.out.println("Dog says : Woof Woff!");
    }
}

class cat extends dog {
    void sound() {
        System.out.println("Cat says : Meow Meow!");
    }
}

public class override_voice {
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        dog d = new dog();
        d.sound();
    }
}
