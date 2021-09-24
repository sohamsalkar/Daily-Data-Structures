
abstract class A {
    abstract void msg();

    // abstract void notimpl();

    protected void novo() {
        System.out.println("working");
    }

}

class B extends A {
    public void msg() {
        System.out.println("in B");
    }

}

class ABC {
    public static void main(String args[]) {
        A b = new B();
        b.msg();
        b.novo();

    }

}