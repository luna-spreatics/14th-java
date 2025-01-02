package _05_class._05_inheritance;

public class Person {
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

    // 생성자 명시 X -> 기본 생성자가 만들어짐
    public Person(String name) {
        setName(name);
    }

    public  Person() {

    }
}
