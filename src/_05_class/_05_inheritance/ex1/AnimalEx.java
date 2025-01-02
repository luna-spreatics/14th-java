package _05_class._05_inheritance.ex1;

public class AnimalEx {
    public static void main(String[] args) {
        Cat myCat = new Cat("나비", 3);
        Dog myDog = new Dog("바둑", 2);

        myCat.makeSound();
        myDog.makeSound();
    }
}
