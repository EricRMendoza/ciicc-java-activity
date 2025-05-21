abstract class abstractClass {
    abstract void abstractMethod();

    void concreteMethod() {
        // concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    // Implementation of the abstract method
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void main(String args[]) {
        B b = new B();
        b.concreteMethod();
        b.abstractMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}