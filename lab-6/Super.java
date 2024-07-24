class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor");
    }
}

public class Super {
    public static void main(String[] args) {
        Child child = new Child();
    }
}