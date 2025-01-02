package _05_class._05_inheritance.ex1;

public class Animal {
    // 종, 이름, 나이 의미하는 변수
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
