package OOPS;
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    String breed;
    void bark(){
        System.out.println("barking");
    }
}

public class Inheritance {
    
    public static void main(String[] args) {
        Dog dg= new Dog();
        dg.eat();
    }
}
