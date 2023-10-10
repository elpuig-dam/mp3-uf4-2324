package setmana2.InheritanceConstructor;

public class A {
    private int num;
    public A() {
        System.out.println("sóc A");
    }
    /*public A(int num) {
        System.out.printf("sóc A - %d%n", num);
        this.num = num;
    }*/
}

class A2 extends A {
    public A2() {
        System.out.println("sóc B");
    }
}

class MainA {
    public static void main(String[] args) {
        //A a = new A(4);
        A2 a2 = new A2();
    }
}

