package _05_class._05_inheritance.ex1;

public class Cat extends Animal {
    public Cat(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("고양이", name, age);
    }

    // makeSound 메소드를 오버라이드
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
