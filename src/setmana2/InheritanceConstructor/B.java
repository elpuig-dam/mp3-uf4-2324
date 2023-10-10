package setmana2.InheritanceConstructor;

public class B {
    public B(int b) {
        System.out.println("Sóc B: " + b);
    }
}

class B2 extends B {
    public B2(int b, int b2) {
        super(b);
        System.out.println("Sóc B2: " + b2 + " B: " + b);
    }
}

class MainB {
    public static void main(String[] args) {
        B2 b2 = new B2(1,2);
    }
}
