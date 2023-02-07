package OOPS;

abstract class Animal1 {
    void eat() {
        System.out.println("eating");
    }

    abstract void walk();
}

class Horse extends Animal1 {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Human extends Animal1 {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse d = new Horse();
        d.walk();
        d.eat();
        Human h = new Human();
        h.walk();
        h.eat();
    }
}
