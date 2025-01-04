package _06_abstract;

// class 앞에 abstract 선언
// 추상 클래스는 설계와 구현을 분리함
// 부모 클래스(슈퍼 클래스)에서는 개념을 정의함
// 자식 클래스(서브 클래스)에서는 목적에 맞게 추상 메서드 구현
// 추상 클래스는 new 연산자로 객체를 생성할 수 없음
public abstract class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 추상 메서드 : 메서드 앞에 abstract 선언
    // 선언만 하고 구현은 하지 않음
    abstract public void printName();
}
