public class instance_local {
     int a = 10; // Instance Variable

    public static void main(String[] args) {
        int b = 2; // Local Variable
        instance_local v = new instance_local();
        System.out.println("a is " + (v.a * b));
    }
}
