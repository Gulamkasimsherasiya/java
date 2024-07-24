final class Parent {
    final int x = 10; 

    final void display() { 
        System.out.println("Parent class display method");
    }
}

public class Final {
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println("Value of x: " + obj.x);
        obj.display();
    }
}