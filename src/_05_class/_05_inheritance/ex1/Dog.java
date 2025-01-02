package _05_class._05_inheritance.ex1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("개", name, age);
    }

    // makeSound 메소드를 오버라이드
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}