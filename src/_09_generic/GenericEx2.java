package _09_generic;

// 참고. Number 클래스
// - Java 에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 모든 타입 포함

// case 1
class Box<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

// case 2
interface Movable {
    void move();
}

// Movable 구현하는 Car 클래스
class Car implements Movable {

    @Override
    public void move() {
        System.out.println("자동차 출발");
    }
}

// Container 클래스는 제네릭 타입 T 를 받지만 제한을 두어 Movable 인터페이스를 구현한 클래스만 허용
class Container<T extends Movable> {
    private T item;

    public Container(T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}


public class GenericEx2 {
    public static void main(String[] args) {
        // Box<String> stringBox = new Box<String>(); // error
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println(doubleBox.getItem());

        Box<Short> shortBox = new Box<>();
        // (short) 형변환 필요한 이유?
        // - Java 에서 정수 리터럴 기본적으로 int 로 간주됨.
        // - 명시적으로 short 로 형 변환 후 넘겨 주어야 함
        shortBox.setItem((short)40);
        System.out.println(shortBox.getItem());

        // case 2
        // Container<String> stringContainer = new Container<String>(); // error
        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();
    }
}
